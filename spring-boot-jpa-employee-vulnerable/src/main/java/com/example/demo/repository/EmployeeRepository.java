
package com.example.demo.repository;

import com.example.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // ISSUE: No null handling for name parameter
    @Query("SELECT e FROM Employee e WHERE e.name = ?1")
    Employee findByName(String name);
}
