package com.remskis.employeemanagement.clientService.clientService.rest.controller;

import com.remskis.employeemanagement.clientService.clientService.model.Skill;
import com.remskis.employeemanagement.clientService.clientService.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skills")
public class SkillController {

    @Autowired
    private SkillService skillService;

    @PostMapping
    public Skill createSkill(@RequestBody Skill skill) {
        return skillService.createSkill(skill);
    }

    @GetMapping("/{id}")
    public Skill getSkillById(@PathVariable Long id) {
        return skillService.getSkillById(id);
    }

    @GetMapping
    public List<Skill> getAllSkills() {
        return skillService.getAllSkills();
    }

    @PutMapping("/{id}")
    public void updateSkill(@PathVariable Long id, @RequestBody Skill skill) {
        skill.setId(id);
        skillService.updateSkill(skill);
    }

    @DeleteMapping("/{id}")
    public void deleteSkill(@PathVariable Long id) {
        skillService.deleteSkill(id);
    }

    @GetMapping("/employees/{employeeId}")
    public List<Skill> getSkillsForEmployee(@PathVariable Long employeeId) {
        return skillService.getSkillsForEmployee(employeeId);
    }
}