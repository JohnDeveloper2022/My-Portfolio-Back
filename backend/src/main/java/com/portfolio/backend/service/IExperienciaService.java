/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.Experiencia;
import java.util.List;


public interface IExperienciaService {
    
    public void crearExperiencia (Experiencia exp);
    
    public void borrarExperiencia (int id);
    
    public Experiencia verExperiencia (int id);
    
    public List <Experiencia> traerExperiencias ();
    
}
