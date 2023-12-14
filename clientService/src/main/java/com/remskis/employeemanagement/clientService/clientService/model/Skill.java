package com.remskis.employeemanagement.clientService.clientService.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private String description;

    @ManyToOne


    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    private Employee employee;
}