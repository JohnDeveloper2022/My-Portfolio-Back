/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.controller;

import com.portfolio.backend.model.Proyecto;
import com.portfolio.backend.service.IProyectoService;
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
public class ProyectoController {
    
    @Autowired
    private IProyectoService proyeServ;
    
    @PostMapping ("/proyectos")
    public void agregarProyecto (@RequestBody Proyecto pro) {
        proyeServ.agregarProyecto(pro);
    }
    
    @DeleteMapping ("/proyectos/{id}")
    public void borrarProyecto (@PathVariable int id) {
        proyeServ.borrarProyecto(id);
    }
    
    @GetMapping ("/proyectos/{id}")
    @ResponseBody
    public Proyecto verProyecto (@PathVariable int id) {
        return proyeServ.verProyecto(id);
    }
    
    @PutMapping ("/proyectos")
    public void editarProyecto (@RequestBody Proyecto pro) {
        proyeServ.editarProyecto(pro);
    }
    
    @GetMapping ("/proyectos")
    @ResponseBody
    public List <Proyecto> traerProyectos () {
        return proyeServ.mostrarProyectos();
    }
}
