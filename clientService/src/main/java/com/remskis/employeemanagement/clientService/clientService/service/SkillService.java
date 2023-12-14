package com.remskis.employeemanagement.clientService.clientService.service;

import com.remskis.employeemanagement.clientService.clientService.model.Skill;

import java.util.List;

public interface SkillService {

    /**
     * Creates a new skill.
     *
     * @param skill The skill to create.
     * @return The created skill.
     */
    Skill createSkill(Skill skill);

    /**
     * Retrieves a skill by its ID.
     *
     * @param skillId The ID of the skill to retrieve.
     * @return The retrieved skill, or null if no such skill exists.
     */
    Skill getSkillById(Long skillId);

    /**
     * Retrieves all skills.
     *
     * @return A list of all skills.
     */
    List<Skill> getAllSkills();

    /**
     * Updates an existing skill.
     *
     * @param skill The skill to update.
     */
    void updateSkill(Skill skill);

    /**
     * Deletes a skill by its ID.
     *
     * @param skillId The ID of the skill to delete.
     */
    void deleteSkill(Long skillId);

    /**
     * Retrieves a list of skills for a given employee ID.
     *
     * @param employeeId The ID of the employee.
     * @return A list of skills for the given employee ID.
     */
    List<Skill> getSkillsForEmployee(Long employeeId);
}

