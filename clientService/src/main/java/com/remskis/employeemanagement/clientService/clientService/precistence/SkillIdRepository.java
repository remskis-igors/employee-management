package com.remskis.employeemanagement.clientService.clientService.precistence;

import com.remskis.employeemanagement.clientService.clientService.model.SkillId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SkillIdRepository extends JpaRepository<SkillId, Long> {

    Optional<SkillId> findByEmployeeId(Long employeeId);

    Optional<SkillId> findBySkillId(Long skillId);

    boolean existsByEmployeeId(Long employeeId);

    boolean existsBySkillId(Long skillId);
    void deleteSkillId(Long employeeId, Long skillId);
}
