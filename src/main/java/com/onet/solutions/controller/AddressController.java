package com.onet.solutions.controller;

import com.onet.solutions.dao.AddressRepository;
import com.onet.solutions.dao.EmployeeRepository;
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

import java.util.Properties;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/*import com.sap.conn.jco.ext.DestinationDataProvider;
import com.sap.conn.jco.JCoDestination;
import com.sap.conn.jco.JCoException;
import com.sap.conn.jco.JCoDestinationManager;*/




/**
 * @author : Otorus
 * @since : 1/10/18
 */
@Controller
//priya update
public class AddressController {
	
	public final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private EmployeeRepository empDao;

    @Autowired
    private AddressRepository addressDao;
    
    //@Autowired
   // private JCoDestination destination; 
    
    


    @RequestMapping("/address/list")
    public String address(Model model, @PageableDefault(size = 5) Pageable pageable,
                         @RequestParam(name = "value", required = false) String value) {
        if (value != null) {
            model.addAttribute("key", value);
            model.addAttribute("data", addressDao.findByNamaContainingIgnoreCase(value, pageable));
            
            log.info("info:first::");
            
        } else {
            model.addAttribute("data", addressDao.findAll(pageable));
            
            
           /* String DESTINATION_NAME1 = "mySAPSystem";
            Properties connectProperties = new Properties();
            connectProperties.setProperty(DestinationDataProvider.JCO_ASHOST, "124.123.42.25");
            connectProperties.setProperty(DestinationDataProvider.JCO_SYSNR,  "48");
            connectProperties.setProperty(DestinationDataProvider.JCO_CLIENT, "800");
            connectProperties.setProperty(DestinationDataProvider.JCO_USER,   "pgopi");
            connectProperties.setProperty(DestinationDataProvider.JCO_PASSWD, "AI@123");
            connectProperties.setProperty(DestinationDataProvider.JCO_LANG,   "en");
            createDestinationDataFile(DESTINATION_NAME1, connectProperties);

            // This will use that destination file to connect to SAP
            try {
                JCoDestination destination = JCoDestinationManager.getDestination("mySAPSystem");
                System.out.println("Attributes:");
                System.out.println(destination.getAttributes());
                System.out.println();
                destination.ping();
            } catch (JCoException e) {
                e.printStackTrace();
            }*/
            log.info("info:first::");
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
        log.debug("debug::first");
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