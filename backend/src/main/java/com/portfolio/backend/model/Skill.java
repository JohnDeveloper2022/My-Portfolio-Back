/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Skill {
    
    private int id;
    private String nombre_skill;

    public Skill() {
    }
    
    public Skill(int id, String nombre_skill) {
        this.id = id;
        this.nombre_skill = nombre_skill;
    }
    
}
