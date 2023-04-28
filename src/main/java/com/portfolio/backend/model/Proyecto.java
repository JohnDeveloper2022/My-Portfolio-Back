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
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombre_proyecto;
    private String descripcion;
    private int persona_id;

    public Proyecto() {
    }

    public Proyecto(int id, String nombre_proyecto, String descripcion, int persona_id) {
        this.id = id;
        this.nombre_proyecto = nombre_proyecto;
        this.descripcion = descripcion;
        this.persona_id = persona_id;
    }
    
    
    
}
