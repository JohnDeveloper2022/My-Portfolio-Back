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
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombre_empresa;
    private String cargo;
    private String mes_inicio;
    private String mes_fin;
    private int anno_inicio;
    private int anno_fin;
    private String ubicacion;
    private String descripcion;
    private int persona_id;

    public Experiencia() {
    }

    public Experiencia(int id, String nombre_empresa, String cargo, String mes_inicio, String mes_fin, int anno_inicio, int anno_fin, String ubicacion, String descripcion, int persona_id) {
        this.id = id;
        this.nombre_empresa = nombre_empresa;
        this.cargo = cargo;
        this.mes_inicio = mes_inicio;
        this.mes_fin = mes_fin;
        this.anno_inicio = anno_inicio;
        this.anno_fin = anno_fin;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
        this.persona_id = persona_id;
    }
    

  
}
