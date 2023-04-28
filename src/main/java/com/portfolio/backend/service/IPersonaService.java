/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.Persona;
import java.util.List;


public interface IPersonaService {
    
    public List <Persona> traerPersonas ();
    
    public Persona verPersona (int id);
    
    public void crearPersona (Persona per);
    
    public void editarPersona (Persona per);
    
    public void borrarPersona (int id);
    
}
