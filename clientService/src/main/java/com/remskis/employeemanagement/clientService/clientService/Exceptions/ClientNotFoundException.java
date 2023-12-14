package com.remskis.employeemanagement.clientService.clientService.Exceptions;

public class ClientNotFoundException extends RuntimeException {

    public ClientNotFoundException(String message) {
        super(message);
    }

    public ClientNotFoundException(Long clientId) {
        super("Client not found with ID: " + clientId);
    }
}
