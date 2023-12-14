package com.remskis.employeemanagement.clientService.clientService.service;

import com.remskis.employeemanagement.clientService.clientService.model.SkillId;


public interface SkillIdService {

    /**
     * Creates a new skill ID.
     *
     * @param employeeId The ID of the employee the skill ID belongs to.
     * @param skillId The ID of the skill.
     * @return The created skill ID.
     */
    SkillId createSkillId(Long employeeId, Long skillId);

    /**
     * Retrieves a skill ID by its employee ID.
     *
     * @param employeeId The ID of the employee the skill ID belongs to.
     * @return The retrieved skill ID, or null if no such skill ID exists.
     */
    SkillId getSkillId(Long employeeId);

    /**
     * Updates an existing skill ID.
     *
     * @param skillId The skill ID to update.
     * @param newEmployeeId The ID of the new employee the skill ID should belong to.
     * @param newSkillId The ID of the new skill.
     * @return The updated skill ID.
     */
    SkillId updateSkillId(SkillId skillId, Long newEmployeeId, Long newSkillId);

    /**
     * Deletes a skill ID by its employee ID and skill ID.
     *
     * @param employeeId The ID of the employee the skill ID belongs to.
     * @param skillId The ID of the skill.
     */
    void deleteSkillId(Long employeeId, Long skillId);
}
