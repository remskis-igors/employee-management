package com.remskis.employeemanagement.clientService.clientService.Exceptions;

public class EmployeeNotFoundException extends RuntimeException {

    public EmployeeNotFoundException(String message) {
        super(message);
    }

    public EmployeeNotFoundException(Long emplId) {
        super("Employee not found with ID: " + emplId);
    }
}
