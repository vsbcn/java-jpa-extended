package com.ironhack.taskmanager.repositories;

import com.ironhack.taskmanager.models.BillableTask;
import com.ironhack.taskmanager.models.InternalTask;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class InternalTaskRepositoryTest {

    @Autowired
    private InternalTaskRepository internalTaskRepository;

    @BeforeEach
    void setUp() {
        internalTaskRepository.save(new InternalTask("Make photocopy", "23-08-2022", true));
        internalTaskRepository.save(new InternalTask("Dispatch blisters", "27-08-2022", true));
        internalTaskRepository.save(new InternalTask("Deliver notes", "03-09-2022", false));

        internalTaskRepository.save(new BillableTask("Export", "05-09-2022", true, 22.4));
        internalTaskRepository.save(new BillableTask("Import", "04-09-2022", true, 60));

    }

    @AfterEach
    void tearDown() {
        internalTaskRepository.deleteAll();
    }

    @Test
    public void testInternalTaskRepository() {
        Optional<InternalTask> internalTaskOptional = internalTaskRepository.findByTitle("Deliver notes");
        Optional<InternalTask> billableTaskOptional = internalTaskRepository.findByTitle("import");

        assertTrue(internalTaskOptional.isPresent());
        assertEquals("Deliver notes", internalTaskOptional.get().getTitle());

        assertTrue(internalTaskOptional.isPresent());
        assertEquals("Import", billableTaskOptional.get().getTitle());
    }
}