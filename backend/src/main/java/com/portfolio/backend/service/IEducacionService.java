/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.Educacion;
import java.util.List;


public interface IEducacionService {
    
    public void crearEstudios (Educacion edu);
    
    public void borrarEstudios (int id);
    
    public Educacion verEstudio (int id);
    
    public List <Educacion> traerEstudios ();
    
}
