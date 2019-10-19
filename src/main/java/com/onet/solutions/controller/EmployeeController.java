package com.onet.solutions.controller;

import com.onet.solutions.dao.EmployeeRepository;
import com.onet.solutions.entity.Employee;

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

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * @author : Otorus
 * @since : 1/4/18
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeDao;


    @GetMapping("/employee/list")
    public ModelMap employee(@PageableDefault(size = 5) Pageable pageable, @RequestParam(name = "value", required = false) String value, Model model){
        if (value != null) {
            model.addAttribute("key", value);
            return new ModelMap().addAttribute("employee", employeeDao.findByNamaContainingIgnoreCase(value, pageable));
        } else {
            return new ModelMap().addAttribute("employee", employeeDao.findAll(pageable));
        }
    }



    




    


    



    
}


