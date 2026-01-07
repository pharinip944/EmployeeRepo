
package com.example.demo.entity;

import javax.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private Long id;

    // ISSUE: No validation constraints on name
    private String name;

    // ISSUE: No validation constraints on department
    private String department;

    // ISSUE: Email is not validated
    private String email;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmail() {
        return email;
    }
}
