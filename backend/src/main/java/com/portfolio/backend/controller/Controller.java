/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.controller;

import com.portfolio.backend.model.Persona;
import com.portfolio.backend.service.IPersonaService;
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

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class Controller {
    
    @Autowired
    private IPersonaService persoServ;
    
    @PostMapping ("/new/persona")
    public void agregarPersona (@RequestBody Persona per) {
        persoServ.crearPersona(per);
    }
    
    @GetMapping ("/ver/persona/{id}")
    @ResponseBody
    public Persona verPersona (@PathVariable int id) {
        return persoServ.verPersona(id);
    }
    
    @PutMapping ("/editar/persona")
    public void editarPersona (@RequestBody Persona per) {
        persoServ.editarPersona(per);
    }
            
    @GetMapping ("/traer/personas")
    @ResponseBody
    public List <Persona> traerPersonas () {
        return persoServ.traerPersonas();
    }
    
    @DeleteMapping ("delete/persona/{id}")
    public void borrarPersona (@PathVariable int id) {
        persoServ.borrarPersona(id);
    }
    
}
