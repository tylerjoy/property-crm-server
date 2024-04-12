package io.propcrm.crmapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.propcrm.crmapi.domain.Contact;
import java.util.List;
import java.util.Optional;


@Repository
public interface ContactRepo extends JpaRepository<Contact, String> {
    Optional<Contact> findById(String id);
}
