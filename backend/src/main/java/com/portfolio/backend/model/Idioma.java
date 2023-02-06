/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Idioma {
    
    private int id;
    private String nombre_idioma;

    public Idioma() {
    }

    public Idioma(int id, String nombre_idioma) {
        this.id = id;
        this.nombre_idioma = nombre_idioma;
    }
    
}
