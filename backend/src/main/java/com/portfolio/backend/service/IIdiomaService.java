/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.Idioma;
import java.util.List;


public interface IIdiomaService {
    
    public void agregarIdioma (Idioma idiom);
    
    public void editarIdioma (Idioma idiom);
    
    public void borrarIdioma (int id);
    
    public Idioma verIdioma (int id);
    
    public List <Idioma> mostrarIdiomas ();
    
}
