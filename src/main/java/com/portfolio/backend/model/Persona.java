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
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombre;
    private String apellido;
    private String profesion;
    private String email;
    private String telefono;
    private String direccion;
    private String sobre_mi;

    public Persona() {
    }

    public Persona(int id, String nombre, String apellido, String profesion, String email, String telefono, String direccion, String sobre_mi) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
        this.sobre_mi = sobre_mi;
    }

    
}

