package com.remskis.employeemanagement.clientService.clientService.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public

class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Long id;

    private String name;
    private String email;
    private String contactNumber;
    private String role;
    private Long clientId;

    @ManyToOne
    @JoinColumn(name = "clientId", referencedColumnName = "id", insertable = false, updatable = false)
    private Client client;
}