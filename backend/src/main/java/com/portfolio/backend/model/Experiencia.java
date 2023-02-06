/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Experiencia {
    
    private int id;
    private String nombre_empresa;
    private String cargo;
    private int fecha_inicio;
    private int fecha_fin;
    private String ubicacion;
    private String descripcion;

    public Experiencia() {
    }

    public Experiencia(int id, String nombre_empresa, String cargo, int fecha_inicio,
            int fecha_fin, String ubicacion, String descripcion) {
        this.id = id;
        this.nombre_empresa = nombre_empresa;
        this.cargo = cargo;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
    }
  
}
