package com.ironhack.taskmanager.models;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class BillableTask extends InternalTask {
    private double hourlyRate;

    public BillableTask() {
    }

    public BillableTask(String title, String dueDate, boolean status, double hourlyRate) {
        super(title, dueDate, status);
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

}
