package com.javadevjournal.demoproject.com.javadevjournal.demoproject.repository;

import com.javadevjournal.demoproject.com.javadevjournal.demoproject.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {


}
