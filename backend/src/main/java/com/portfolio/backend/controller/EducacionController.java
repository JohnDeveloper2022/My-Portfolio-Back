/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.controller;

import com.portfolio.backend.model.Educacion;
import com.portfolio.backend.service.IEducacionService;
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
public class EducacionController {
    
    @Autowired
    private IEducacionService eduServ;
    
    @PostMapping ("/new/estudio")
    public void crearEstudios (@RequestBody Educacion edu) {
        eduServ.crearEstudios(edu);
    }
    
    @DeleteMapping ("/delete/estudio/{id}")
    public void borrarEstudios (@PathVariable int id) {
        eduServ.borrarEstudios(id);
    }
    
    @GetMapping ("/ver/estudio/{id}")
    @ResponseBody
    public Educacion verEstudio (@PathVariable int id) {
        return eduServ.verEstudio(id);
    }
    
    @GetMapping ("/traer/estudios")
    @ResponseBody
    public List <Educacion> traerEstudios () {
        return eduServ.traerEstudios();
    }
}
