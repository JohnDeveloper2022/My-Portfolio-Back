/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.controller;

import com.portfolio.backend.model.Idioma;
import com.portfolio.backend.service.IIdiomaService;
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

@CrossOrigin
@RestController
public class IdiomaController {
    
    @Autowired
    private IIdiomaService idioServ;
    
    @PostMapping ("/new/idioma")
    public void agregarIdioma (@RequestBody Idioma idiom) {
        idioServ.agregarIdioma(idiom);
    }
    
    @DeleteMapping ("/delete/idioma/{id}")
    public void borrarIdioma (@PathVariable int id) {
        idioServ.borrarIdioma(id);
    }
    
    @GetMapping ("/ver/idioma/{id}")
    @ResponseBody
    public Idioma verIdioma (@PathVariable int id) {
        return idioServ.verIdioma(id);
    }
    
    @PutMapping ("/editar/idioma")
    public void editarIdioma (@RequestBody Idioma idiom) {
        idioServ.editarIdioma(idiom);
    }
    
    @GetMapping ("/traer/idiomas")
    @ResponseBody
    public List <Idioma> mostrarIdiomas () {
        return idioServ.mostrarIdiomas();
    }
    
}
