/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.Skill;
import com.portfolio.backend.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService implements ISkillService {
    
    @Autowired
    public SkillRepository skillRepo;

    @Override
    public void crearSkill(Skill sk) {
        skillRepo.save(sk);
    }

    @Override
    public void borrarSkill(int id) {
        skillRepo.deleteById(id);
    }

    @Override
    public Skill verSkill(int id) {
        return skillRepo.findById(id).orElse(null);
    }

    @Override
    public List<Skill> mostrarSkills() {
        return skillRepo.findAll();
    }
    
}
