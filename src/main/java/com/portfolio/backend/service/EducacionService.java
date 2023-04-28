/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.Educacion;
import com.portfolio.backend.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {
    
    @Autowired
    public EducacionRepository eduRepo;

    @Override
    public void crearEstudios(Educacion edu) {
        eduRepo.save(edu);
    }

    @Override
    public void borrarEstudios(int id) {
        eduRepo.deleteById(id);
    }

    @Override
    public Educacion verEstudio(int id) {
        return eduRepo.findById(id).orElse(null);
    }

    @Override
    public List<Educacion> traerEstudios() {
        return eduRepo.findAll();
    }

    @Override
    public void editarEstudio(Educacion edu) {
        eduRepo.save(edu);
    }
    
}
