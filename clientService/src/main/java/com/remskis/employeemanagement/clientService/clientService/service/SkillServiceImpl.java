package com.remskis.employeemanagement.clientService.clientService.service;

import com.remskis.employeemanagement.clientService.clientService.model.Skill;
import com.remskis.employeemanagement.clientService.clientService.precistence.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillServiceImpl implements SkillService {

    @Autowired
    private SkillRepository skillRepository;

    @Override
    public Skill createSkill(Skill skill) {
        return skillRepository.save(skill);
    }

    @Override
    public Skill getSkillById(Long skillId) {
        return skillRepository.findById(skillId).orElse(null);
    }

    @Override
    public List<Skill> getAllSkills() {
        return skillRepository.findAll();
    }

    @Override
    public void updateSkill(Skill skill) {
        skillRepository.save(skill);
    }

    @Override
    public void deleteSkill(Long skillId) {
        skillRepository.deleteById(skillId);
    }

    @Override
    public List<Skill> getSkillsForEmployee(Long employeeId) {
        return skillRepository.findAllByEmployeeId(employeeId);
    }
}
