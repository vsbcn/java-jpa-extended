package com.ironhack.taskmanager.repositories;

import com.ironhack.taskmanager.models.InternalTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface InternalTaskRepository extends JpaRepository<InternalTask, Integer> {
    Optional<InternalTask> findByTitle(String title);
}
