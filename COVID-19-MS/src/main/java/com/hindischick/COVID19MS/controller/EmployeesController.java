package com.hindischick.COVID19MS.controller;

import com.hindischick.COVID19MS.model.Employee;
import com.hindischick.COVID19MS.model.EmployeeIn;
import com.hindischick.COVID19MS.repo.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/employees")
public class EmployeesController  {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<?> getAllEmployees()
    {
        return new ResponseEntity<>(employeeService.all(), HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getOneEmployee(@PathVariable Long id)
    {
        return new ResponseEntity<>(employeeService.findById(id), HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<?> insertEmployee(@RequestBody EmployeeIn employeeIn)
    {
        Employee employee = employeeIn.toEmployee();
        employee = employeeService.save(employee);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }


}
