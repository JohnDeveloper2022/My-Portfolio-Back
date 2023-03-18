/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.controller;

import com.portfolio.backend.model.Experiencia;
import com.portfolio.backend.service.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExperienciaController {
    
    @Autowired
    private IExperienciaService expeServ;
    
    @PostMapping ("/new/experiencia")
    public void crearExperiencia (@RequestBody Experiencia exp) {
        expeServ.crearExperiencia(exp);
    }
    
    @DeleteMapping ("/delete/experiencia/{id}")
    public void borrarExperiencia (@PathVariable int id) {
        expeServ.borrarExperiencia(id);
    }
    
    @GetMapping ("/ver/experiencia/{id}")
    @ResponseBody
    public Experiencia verExperiencia (@PathVariable int id) {
        return expeServ.verExperiencia(id);
    }
    
    @GetMapping ("/mostrar/experiencias")
    @ResponseBody
    public List <Experiencia> traerExperiencias () {
        return expeServ.traerExperiencias();
    }
    
}
