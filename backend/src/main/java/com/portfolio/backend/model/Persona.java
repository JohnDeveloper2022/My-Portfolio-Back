/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Persona {
    
    private int id;
    private String username;
    private String password;
    private String nombre;
    private String apellido;
    private String profesion;
    private String email;
    private String telefono;
    private String direccion;
    private String sobre_mi;

    public Persona() {
    }

    public Persona(int id, String username, String password, String nombre, String apellido, 
            String profesion, String email, String telefono, String direccion, String sobre_mi) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
        this.sobre_mi = sobre_mi;
    }
    
    
}

