/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombre_instituto;
    private String titulo;
    private String titulo_corto;
    private int fecha_inicio;
    private int fecha_fin;
    private String descripcion;
    private int persona_id;

    public Educacion() {
    }

    public Educacion(int id, String nombre_instituto, String titulo, String titulo_corto, int fecha_inicio, int fecha_fin, String descripcion, int persona_id) {
        this.id = id;
        this.nombre_instituto = nombre_instituto;
        this.titulo = titulo;
        this.titulo_corto = titulo_corto;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.descripcion = descripcion;
        this.persona_id = persona_id;
    }

    

    
}
