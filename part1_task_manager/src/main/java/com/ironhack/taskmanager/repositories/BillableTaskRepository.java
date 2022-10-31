package com.ironhack.taskmanager.repositories;

import com.ironhack.taskmanager.models.BillableTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillableTaskRepository extends JpaRepository<BillableTask, Integer> {
}
