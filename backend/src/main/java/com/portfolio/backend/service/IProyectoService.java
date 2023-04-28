/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.Proyecto;
import java.util.List;


public interface IProyectoService {
    
    public void agregarProyecto (Proyecto pro);
    
    public void editarProyecto (Proyecto pro);
    
    public void borrarProyecto (int id);
    
    public Proyecto verProyecto (int id);
    
    public List <Proyecto> mostrarProyectos ();
    
}
