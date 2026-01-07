
package com.example.demo.service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public Employee getEmployee(String name) {
        // ISSUE: Logging user input directly (sensitive data exposure)
        System.out.println("Fetching employee with name: " + name);

        // ISSUE: No input validation before repository call
        return repository.findByName(name);
    }
}
