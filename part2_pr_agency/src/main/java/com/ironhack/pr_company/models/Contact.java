package com.ironhack.pr_company.models;

import javax.persistence.*;

// Composition Mapping
@Entity
@Table(name = "contacts")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeId;
    @Embedded
    private Name name;
    private String title;
    private String company;

    public Contact() {
    }

    public Contact(Name name, String title, String company) {
        this.name = name;
        this.title = title;
        this.company = company;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
