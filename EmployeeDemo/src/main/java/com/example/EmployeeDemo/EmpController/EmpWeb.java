package com.example.EmployeeDemo.EmpController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class EmpWeb {

    @Autowired 
    EmpController empController;
    
    @GetMapping ("/home")
    public String home(){
        return "index";
    }

    
}
