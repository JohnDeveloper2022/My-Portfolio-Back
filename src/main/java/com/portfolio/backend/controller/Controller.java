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

@CrossOrigin(origins = "https://portfolio-johnny-f39f6.web.app")
@RestController
public class Controller {
    
    @Autowired
    private IPersonaService persoServ;
    
    @PostMapping ("/persona")
    public void agregarPersona (@RequestBody Persona per) {
        persoServ.crearPersona(per);
    }
    
    @GetMapping ("/persona/{id}")
    @ResponseBody
    public Persona verPersona (@PathVariable int id) {
        return persoServ.verPersona(id);
    }
    
    @PutMapping ("/persona")
    public void editarPersona (@RequestBody Persona per) {
        persoServ.editarPersona(per);
    }
            
    @GetMapping ("/persona")
    @ResponseBody
    public List <Persona> traerPersonas () {
        return persoServ.traerPersonas();
    }
    
    @DeleteMapping ("/persona/{id}")
    public void borrarPersona (@PathVariable int id) {
        persoServ.borrarPersona(id);
    }
    
}
