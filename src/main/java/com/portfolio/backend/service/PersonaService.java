/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.Persona;
import com.portfolio.backend.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {
    
    @Autowired
    public PersonaRepository persoRepo;
    
    
    @Override
    public Persona verPersona(int id) {
        return persoRepo.findById(id).orElse(null);
    }

    @Override
    public void crearPersona(Persona per) {
        persoRepo.save(per);
    }

    @Override
    public List<Persona> traerPersonas() {
        return persoRepo.findAll();
    }

    @Override
    public void borrarPersona(int id) {
        persoRepo.deleteById(id);
    }

    @Override
    public void editarPersona(Persona per) {
        persoRepo.save(per);
    }
    
}
