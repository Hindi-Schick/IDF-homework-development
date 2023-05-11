package com.hindischick.COVID19MS.repo;

import com.hindischick.COVID19MS.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,Long> {
}
