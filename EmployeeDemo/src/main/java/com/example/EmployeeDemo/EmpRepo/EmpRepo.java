
package com.example.EmployeeDemo.EmpRepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EmployeeDemo.EmpEntity.Employee;

@Repository 
public interface EmpRepo extends  JpaRepository<Employee, Integer>{


}
