package com.example.EmployeeDemo.EmpController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeDemo.EmpEntity.Employee;
import com.example.EmployeeDemo.Service.EmpService;


@RestController 
public class EmpController {
    
    @Autowired 
    EmpService empServ;

    @GetMapping("/getAllEmp")
    public List<Employee> getAllEmp(){
        return empServ.getAllEmp();
    }

    @GetMapping("/getemp/{id}")
    public Employee getEmpById(@PathVariable int id){
        return empServ.getEmpById(id);
    }

    @PutMapping("/updateemp/{id}")
    public Employee updateEmpId(@RequestBody Employee e, @PathVariable int id){
         return empServ.updateEmpId(e , id);
    }

    
    @PostMapping("/insertemp")
public void insertEmp(@RequestBody Employee e) {
    empServ.insertEmp(e);
}

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable int id){
        empServ.deleteById(id);
    }

    // @GetMapping("/home")
    // public String home(){
    //     return "index";
    // }
    


}
