/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Educacion {
    
    private int id;
    private String nombre_instituto;
    private String titulo;
    private int fecha_inicio;
    private int fecha_fin;
    private String descripcion;

    public Educacion() {
    }

    public Educacion(int id, String nombre_instituto, String titulo, int fecha_inicio,
            int fecha_fin, String descripcion) {
        this.id = id;
        this.nombre_instituto = nombre_instituto;
        this.titulo = titulo;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.descripcion = descripcion;
    }
    
}
