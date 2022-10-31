package com.ironhack.pr_company.models;

import com.ironhack.pr_company.enums.Salutation;

import javax.persistence.*;

@Embeddable
public class Name {
    private String firstName;
    private String lastName;
    private String middleName;
    @Enumerated(EnumType.STRING)
    private Salutation salutation;

    public Name() {
    }

    public Name(String firstName, String lastName, String middleName, Salutation salutation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.salutation = salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Salutation getSalutation() {
        return salutation;
    }

    public void setSalutation(Salutation salutation) {
        this.salutation = salutation;
    }
}
