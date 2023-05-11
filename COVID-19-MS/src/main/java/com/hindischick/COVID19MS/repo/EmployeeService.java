package com.hindischick.COVID19MS.repo;

import com.hindischick.COVID19MS.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository repository;

    public Iterable<Employee> all() {
        return repository.findAll();
    }

    public Optional<Employee> findById(Long id) {
        return repository.findById(id);
    }


    public Employee save(Employee student) {
        return repository.save(student);
    }

}
