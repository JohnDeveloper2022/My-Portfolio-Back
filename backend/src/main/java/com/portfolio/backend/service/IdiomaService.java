/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.Idioma;
import com.portfolio.backend.repository.IdiomaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdiomaService implements IIdiomaService {
    
    @Autowired
    public IdiomaRepository idioRepo;

    @Override
    public void agregarIdioma(Idioma idiom) {
        idioRepo.save(idiom);
    }

    @Override
    public void borrarIdioma(int id) {
        idioRepo.deleteById(id);
    }

    @Override
    public Idioma verIdioma(int id) {
        return idioRepo.findById(id).orElse(null);
    }

    @Override
    public List<Idioma> mostrarIdiomas() {
        return idioRepo.findAll();
    }
    
}
