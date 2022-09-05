package com.bitanya.employeems.controller;

import com.bitanya.employeems.entity.employee;
import com.bitanya.employeems.service.adminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

public class adminController {
    @Autowired
    private adminService service;


    @GetMapping("/addemp")
    public String addEmpForm() {
        return "add_emp";
    }

    @PostMapping("/register")
    public String empRegister(@ModelAttribute employee e, HttpSession session) {
        service.addEmp(e);
        session.setAttribute("msg", "Emplyoee Added Sucessfully..");
        return "redirect:/";
    }




    @PostMapping("/update")
    public String updateEmp(@ModelAttribute employee e, HttpSession session) {
        service.addEmp(e);
        session.setAttribute("msg", "Emp Data Update Sucessfully..");
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteEMp(@PathVariable int id, HttpSession session) {

        service.deleteEMp(id);
        session.setAttribute("msg", "Emp Data Delete Sucessfully..");
        return "redirect:/";
    }


}
