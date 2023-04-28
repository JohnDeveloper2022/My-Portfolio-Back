/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.Proyecto;
import com.portfolio.backend.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService {
    
    @Autowired
    public ProyectoRepository proyeRepo;

    @Override
    public void agregarProyecto(Proyecto pro) {
        proyeRepo.save(pro);
    }

    @Override
    public void editarProyecto(Proyecto pro) {
        proyeRepo.save(pro);
    }

    @Override
    public void borrarProyecto(int id) {
        proyeRepo.deleteById(id);
    }

    @Override
    public Proyecto verProyecto(int id) {
        return proyeRepo.findById(id).orElse(null);
    }

    @Override
    public List<Proyecto> mostrarProyectos() {
        return proyeRepo.findAll();
    }
    
}
