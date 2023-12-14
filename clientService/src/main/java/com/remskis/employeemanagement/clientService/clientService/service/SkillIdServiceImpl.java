package com.remskis.employeemanagement.clientService.clientService.service;

import com.remskis.employeemanagement.clientService.clientService.model.SkillId;
import com.remskis.employeemanagement.clientService.clientService.precistence.SkillIdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillIdServiceImpl implements SkillIdService {

    @Autowired
    private SkillIdRepository skillIdRepository;

    @Override
    public SkillId createSkillId(Long employeeId, Long skillId) {
        SkillId skillIdEntity = new SkillId();
        skillIdEntity.setEmployeeId(employeeId);
        skillIdEntity.setSkillId(skillId);

        skillIdRepository.save(skillIdEntity);

        return skillIdEntity;
    }

    @Override
    public SkillId getSkillId(Long employeeId) {
        return skillIdRepository.findByEmployeeId(employeeId).orElse(null);
    }


    @Override
    public SkillId updateSkillId(SkillId skillId, Long newEmployeeId, Long newSkillId) {
        if (skillId == null) {
            throw new IllegalArgumentException("SkillId cannot be null");
        }
        if (newEmployeeId != null) {
            skillId.setEmployeeId(newEmployeeId);
        }
        if (newSkillId != null) {
            skillId.setSkillId(newSkillId);
        }

        skillIdRepository.save(skillId);

        return skillId;
    }

    @Override
    public void deleteSkillId(Long employeeId, Long skillId) {

        skillIdRepository.deleteSkillId(employeeId, skillId);
    }
}
