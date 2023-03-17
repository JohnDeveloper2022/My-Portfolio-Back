/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.Skill;
import java.util.List;


public interface ISkillService {
    
    public void crearSkill (Skill sk);
    
    public void borrarSkill (int id);
    
    public Skill verSkill (int id);
    
    public List <Skill> mostrarSkills ();
    
}
