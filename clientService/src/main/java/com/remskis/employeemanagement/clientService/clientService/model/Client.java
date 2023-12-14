package com.remskis.employeemanagement.clientService.clientService.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Client {

    private Long id;
    private String name;
    private String email;
    private String contactNumber;
    private String company;

}
