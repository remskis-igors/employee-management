package com.remskis.employeemanagement.clientService.clientService.service;

import com.remskis.employeemanagement.clientService.clientService.model.Employee;

import java.util.List;

public interface EmployeeService {

    /**
     * Creates a new employee.
     *
     * @param employee The employee to create.
     * @return The created employee.
     */
    Employee createEmployee(Employee employee);

    /**
     * Retrieves an employee by its ID.
     *
     * @param id The ID of the employee to retrieve.
     * @return The retrieved employee, or null if no such employee exists.
     */
    Employee getEmployeeById(Long id);

    /**
     * Retrieves all employees.
     *
     * @return A list of all employees.
     */
    List<Employee> getAllEmployees();

    /**
     * Updates an existing employee.
     *
     * @param employee The employee to update.
     */
    void updateEmployee(Employee employee);

    /**
     * Deletes an employee by its ID.
     *
     * @param id The ID of the employee to delete.
     */
    void deleteEmployeeById(Long id);

    /**
     * Retrieves a list of employees for a given client ID.
     *
     * @param clientId The ID of the client.
     * @return A list of employees for the given client ID.
     */
    List<Employee> getEmployeesForClientId(Long clientId);
}
