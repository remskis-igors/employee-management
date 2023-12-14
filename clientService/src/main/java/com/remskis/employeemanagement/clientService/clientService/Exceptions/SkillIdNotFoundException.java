package com.remskis.employeemanagement.clientService.clientService.Exceptions;

public class SkillIdNotFoundException extends RuntimeException {

    public SkillIdNotFoundException(String message) {
        super(message);
    }

    public SkillIdNotFoundException(Long skillId) {
        super("Skill not found with ID: " + skillId);
    }
}
