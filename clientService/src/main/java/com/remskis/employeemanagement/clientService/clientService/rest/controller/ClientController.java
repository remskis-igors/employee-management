package com.remskis.employeemanagement.clientService.clientService.rest.controller;

import com.remskis.employeemanagement.clientService.clientService.Exceptions.ClientNotFoundException;
import com.remskis.employeemanagement.clientService.clientService.model.Client;
import com.remskis.employeemanagement.clientService.clientService.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController{

    @Autowired
    private ClientService clientService;

    @PostMapping
    public Client createClient(@RequestBody Client client){
        return clientService.createClient(client);
    }

    @GetMapping("/{id}")
    public Client getClientById(@PathVariable Long id) throws ClientNotFoundException {
        return clientService.getClientById(id);
    }

    @GetMapping
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    @PutMapping("/{id}")
    public Client updateClient(@PathVariable Long id, @RequestBody Client client) {
        client.setId(id);
        return clientService.updateClient(client);
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable Long id) throws ClientNotFoundException {
        clientService.deleteClient(id);
    }
}
