package com.remskis.employeemanagement.clientService.clientService.model;

import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SkillId {

    private Long employeeId;
    private Long skillId;
}