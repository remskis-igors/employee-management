package com.remskis.employeemanagement.clientService.clientService.service;

import com.remskis.employeemanagement.clientService.clientService.Exceptions.ClientNotFoundException;
import com.remskis.employeemanagement.clientService.clientService.model.Client;

import java.util.List;

public interface ClientService {

    //CLIENT
    // Create a new client
    Client createClient(Client client);

    // Get a client by ID
    Client getClientById(Long id) throws ClientNotFoundException;

    // Get all clients
    List<Client> getAllClients();

    // Update a client
    Client updateClient(Client client);

    // Delete a client
    void deleteClient(Long id) throws ClientNotFoundException;

}