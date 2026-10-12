
package com.example.EmployeeDemo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeDemo.EmpEntity.Employee;
import com.example.EmployeeDemo.EmpRepo.EmpRepo;

@Service
public class EmpService {

    @Autowired
    EmpRepo empRepo;

    // Get all employees
    public List<Employee> getAllEmp() {
        return empRepo.findAll();
    }

    // Get employee by ID
    public Employee getEmpById(int id) {
        return empRepo.findById(id).orElse(null);
    }

    // Update employee
    public Employee updateEmpId(Employee e, int id) {

        Employee emp = empRepo.findById(id)
                .orElseThrow(() ->
                    new RuntimeException("Employee not found: " + id));

        emp.setName(e.getName());
        emp.setSalary(e.getSalary());

        return empRepo.save(emp);
    }

    // Insert employee
    public void insertEmp(Employee e) {
        empRepo.save(e);
    }

    // Delete employee
    public void deleteById(int id) {
        empRepo.deleteById(id);
    }
}
