package com.remskis.employeemanagement.clientService.clientService.precistence;

import com.remskis.employeemanagement.clientService.clientService.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ClientRepository extends JpaRepository <Client, Long>{

    Optional<Client> findByName(String name);
}
