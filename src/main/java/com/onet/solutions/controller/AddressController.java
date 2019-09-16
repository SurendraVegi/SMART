package com.onet.solutions.controller;

import com.onet.solutions.dao.AddressDao;
import com.onet.solutions.dao.EmployeeDao;
import com.onet.solutions.entity.Address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author : Otorus
 * @since : 1/10/18
 */
@Controller
//priya update
public class AddressController {
	
	 public static final Logger log = LoggerFactory.getLogger(AddressController.class);

    @Autowired
    private EmployeeDao empDao;

    @Autowired
    private AddressDao addressDao;
    
    


    @RequestMapping("/address/list")
    public String address(Model model, @PageableDefault(size = 5) Pageable pageable,
                         @RequestParam(name = "value", required = false) String value) {
        if (value != null) {
            model.addAttribute("key", value);
            model.addAttribute("data", addressDao.findByNamaContainingIgnoreCase(value, pageable));
            
            log.info("info:first::");
            
        } else {
            model.addAttribute("data", addressDao.findAll(pageable));
        }
        return "address/list";

    }


    @GetMapping("/address/form")
    public String tampilkanForms(@RequestParam(value = "id", required = false) Address address, Model m) {
        if (address == null) {
            address = new Address();
        }
        m.addAttribute("address", address);
        m.addAttribute("karyawan", empDao.findAll());
        return "address/form";
    }


    @PostMapping("/address/form")
    public String simpan(@ModelAttribute @Valid Address address, BindingResult errors, SessionStatus status) {
        if (errors.hasErrors()) {
            return "address/form";
        }
        addressDao.save(address);
        status.setComplete();
        return "redirect:/address/list";
    }



    @GetMapping("/address/delete")
    public ModelMap deleteConfirm(@RequestParam(value = "id", required = true) Address address) {
        return new ModelMap("address", address);
    }



    @PostMapping("/address/delete")
    public Object delete(@ModelAttribute Address address, SessionStatus status) {
        try {
        	addressDao.delete(address);
        } catch (DataIntegrityViolationException exception) {
            status.setComplete();
            return new ModelAndView("error/errorHapus")
                    .addObject("entityId", address.getNama())
                    .addObject("entityName", "Alamat")
                    .addObject("errorCause", exception.getRootCause().getMessage())
                    .addObject("backLink", "/address/list");
        }
        status.setComplete();
        return "redirect:/address/list";
    }
}