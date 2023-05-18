/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.controller;

import com.portfolio.backend.model.Educacion;
import com.portfolio.backend.service.IEducacionService;
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
public class EducacionController {
    
    @Autowired
    private IEducacionService eduServ;
    
    @PostMapping ("/estudios")
    public void crearEstudios (@RequestBody Educacion edu) {
        eduServ.crearEstudios(edu);
    }
    
    @DeleteMapping ("/estudios/{id}")
    public void borrarEstudios (@PathVariable int id) {
        eduServ.borrarEstudios(id);
    }
    
    @GetMapping ("/estudios/{id}")
    @ResponseBody
    public Educacion verEstudio (@PathVariable int id) {
        return eduServ.verEstudio(id);
    }
    
    @PutMapping ("/estudios")
    public void editarEstudio (@RequestBody Educacion edu) {
        eduServ.editarEstudio(edu);
    }
    
    @GetMapping ("/estudios")
    @ResponseBody
    public List <Educacion> traerEstudios () {
        return eduServ.traerEstudios();
    }
}
