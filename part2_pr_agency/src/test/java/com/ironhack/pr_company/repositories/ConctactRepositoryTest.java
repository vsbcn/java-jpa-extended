package com.ironhack.pr_company.repositories;

import com.ironhack.pr_company.enums.Salutation;
import com.ironhack.pr_company.models.Contact;
import com.ironhack.pr_company.models.Name;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ConctactRepositoryTest {

    @Autowired
    private ContactRepository contactRepository;

    @BeforeEach
    void setUp() {
        contactRepository.save(new Contact(new Name("John","Smith","Vanderstuck",Salutation.Mr),"Manager","LaserPro"));
    }

    @AfterEach
    void tearDown() {
        contactRepository.deleteAll();
    }

    @Test
    public void testContactRepository() {
        Optional<Contact> contactOptional = contactRepository.findByTitle("Manager");

        assertTrue(contactOptional.isPresent());
        assertEquals("John", contactOptional.get().getName().getFirstName());
        assertEquals("Mr", contactOptional.get().getName().getSalutation().name());
    }
}