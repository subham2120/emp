package com.emp.demo.emp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpSession;



@Controller
public class EmpController {


    @Autowired
    private EmpService service;

    @GetMapping("/")
   public String home(Model m){

    List<EmpEntity> emp=service.getAllEmp();
    m.addAttribute("emp",emp);
        return "index";
    }

    @GetMapping("/addemp")
    public String AddEmpForm(){
        return "add_emp";
    }
    
    @PostMapping("/register")
    public String empRegister(@ModelAttribute EmpEntity e,HttpSession session){
        System.out.println(e);

        service.addEmp(e);
        session.setAttribute("msg", "Employee Added Successfully......");
        return "redirect:/"; 
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id,Model m){
        EmpEntity e=service.getEmpById(id);
        m.addAttribute("emp",e);
        return "edit";

    }

    @PostMapping("/update")
    public String UpdateEmp(@ModelAttribute EmpEntity e,HttpSession session){
      service.addEmp(e);
      session.setAttribute("msg","Employee data update Successfully......");
      return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String DeleteEmp(@PathVariable int id,HttpSession session){

        service.deleteEmp(id);
        session.setAttribute("msg","Employee data delete Successfully......");
        return "redirect:/";

    }
}
