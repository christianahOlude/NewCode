package org.example.data.repositories;

import org.example.data.models.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contacts, Long> {
}
