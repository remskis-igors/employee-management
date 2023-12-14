package com.remskis.employeemanagement.clientService.clientService.precistence;

import com.remskis.employeemanagement.clientService.clientService.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public interface SkillRepository extends JpaRepository<Skill, Long> {

    Optional<Skill> findById(Long id);

    Optional<Skill> findByName(String name);

    Optional<Skill> findByDescription(String description);

    Optional<Skill> findByIdAndEmployeeId(Long id, Long employeeId);

    List<Skill> findAllByEmployeeId(Long employeeId);

    List<Skill> findAllByNameContaining(String name);

    List<Skill> findAllByDescriptionContaining(String description);

    boolean existsById(Long id);

    boolean existsByName(String name);

    boolean existsByDescription(String description);

    boolean existsByIdAndEmployeeId(Long id, Long employeeId);
}
