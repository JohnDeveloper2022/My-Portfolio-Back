/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.controller;

import com.portfolio.backend.model.Skill;
import com.portfolio.backend.service.ISkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "https://portfolio-johnny-f39f6.web.app")
@RestController
public class SkillController {
    
    @Autowired
    private ISkillService skillServ;
    
    @PostMapping ("/skills")
    public void agregarSkill (@RequestBody Skill sk) {
        skillServ.crearSkill(sk);
    }
    
    @DeleteMapping ("/skills/{id}")
    public void borrarSkill (@PathVariable int id) {
        skillServ.borrarSkill(id);
    } 
    
    @GetMapping ("/skills/{id}")
    @ResponseBody
    public Skill verSkill (@PathVariable int id) {
        return skillServ.verSkill(id);
    }
    
    @PutMapping ("/skills")
    public void editarSkill (@RequestBody Skill sk) {
        skillServ.editarSkill(sk);
    }
    
    @GetMapping ("/skills")
    @ResponseBody
    public List <Skill> mostrarSkills () {
        return skillServ.mostrarSkills();
    }
}
