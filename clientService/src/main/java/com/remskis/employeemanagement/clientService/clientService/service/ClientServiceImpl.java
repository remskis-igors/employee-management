package com.remskis.employeemanagement.clientService.clientService.service;

import com.remskis.employeemanagement.clientService.clientService.Exceptions.ClientNotFoundException;
import com.remskis.employeemanagement.clientService.clientService.model.Client;
import com.remskis.employeemanagement.clientService.clientService.precistence.ClientRepository;
import com.remskis.employeemanagement.clientService.clientService.precistence.EmployeeRepository;
import com.remskis.employeemanagement.clientService.clientService.precistence.SkillIdRepository;
import com.remskis.employeemanagement.clientService.clientService.precistence.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private SkillIdRepository skillIdRepository;

    @Autowired
    private SkillRepository skillRepository;

    @Override
    public Client createClient(Client client) {

        return clientRepository.save(client);
    }

    @Override
    public Client getClientById(Long id) throws ClientNotFoundException {
        return clientRepository.findById(id).orElseThrow(() -> new ClientNotFoundException(id));
    }

    @Override
    public List<Client> getAllClients() {

        return clientRepository.findAll();
    }

    @Override
    public Client updateClient(Client client) {

        return clientRepository.save(client);
    }

    @Override
    public void deleteClient(Long id) throws ClientNotFoundException {
        clientRepository.deleteById(id);
    }
}
//EMPLOYEE
//    @Override
//    public Employee createEmployee(Employee employee) {
//        return employeeRepository.save(employee);
//    }
//
//    @Override
//    public Employee getEmployeeById(Long id) throws EmployeeNotFoundException {
//        return employeeRepository.findById(id).orElseThrow(() -> new EmployeeNotFoundException(id));
//    }
//
//    @Override
//    public List<Employee> getAllEmployee() {
//
//        return employeeRepository.findAll();
//    }
//
//    @Override
//    public Employee updateEmployee(Employee employee) {
//
//        return employeeRepository.save(employee);
//    }
//
//    @Override
//    public void deleteEmployee(Long id) throws EmployeeNotFoundException {
//        employeeRepository.deleteById(id);
//    }
//
//    @Override
//    public Employee createEmployeeForClient(Long clientId, Employee employee) throws ClientNotFoundException {
//        employee.setClientId(clientId);
//        employeeRepository.save(employee);
//        return employee;
//    }
//
//    @Override
//    public List<Employee> getEmployeesByClientId(Long clientId) {
//        List<Employee> employees = employeeRepository.findAllByClientId(clientId);
//        return employees;
//    }
//
////SKILLS
//        @Override
//        public void addSkillToEmployee(Long employeeId, Long skillId) throws SkillIdNotFoundException, EmployeeNotFoundException {
//            if (!skillIdRepository.existsById(skillId)) {
//                throw new SkillIdNotFoundException("Skill ID not found: " + skillId);
//            }
//
//            if (!employeeRepository.existsById(employeeId)) {
//                throw new EmployeeNotFoundException("Employee ID not found: " + employeeId);
//            }
//
//            Skill skill = skillRepository.getById(skillId);
//            Employee employee = employeeRepository.getById(employeeId);
//
//            SkillId skillIdToAdd = new SkillId();
//            skillIdToAdd.setEmployeeId(employeeId);
//            skillIdToAdd.setSkillId(skill.getId());
//
//            skillIdRepository.save(skillIdToAdd);
//            employeeRepository.save(employee);
//        }
//
//    public void removeSkillFromEmployee(Long employeeId, Long skillId) throws SkillIdNotFoundException, EmployeeNotFoundException {
//    SkillId skillIdToRemove = null;
//    for (Skill skill : getSkillsOfEmployee(employeeId)) {
//        if (skill.getId() == skillId) {
//            skillIdToRemove = new SkillId();
//            skillIdToRemove.setEmployeeId(employeeId);
//            skillIdToRemove.setSkillId(skillId);
//        }
//    }
//
//    if (skillIdToRemove == null) {
//        throw new SkillIdNotFoundException("Skill ID not found: " + skillId);
//    }
//
//    skillIdRepository.deleteById(skillIdToRemove.getSkillId());
//}
//    public Set<Skill> getSkillsOfEmployee(Long employeeId) {
//        List<SkillId> skillIds = skillIdRepository.findAllByEmployeeId(employeeId);
//        Set<Skill> skills = new HashSet<>();
//
//
//        for (SkillId skillId : skillIds) {
//            Skill skill = new Skill();
//            skill.setId(skillId.getSkillId());
//            skill.setSkillName(skillId.getSkillName());
//            skills.add(skill);
//        }
//
//        return skills;
//    }

