package com.ironhack.taskmanager.models;

import javax.persistence.*;

@Entity
@Table(name = "internal_tasks")
@Inheritance(strategy = InheritanceType.JOINED)
public class InternalTask extends Task {
    public InternalTask() {
    }
    public InternalTask(String title, String dueDate, boolean status) {
        super(title, dueDate, status);
    }

}
