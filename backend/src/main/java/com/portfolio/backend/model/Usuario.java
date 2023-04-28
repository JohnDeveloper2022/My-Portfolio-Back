/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Usuario {
    
    @Id
    private int id;
    private String username;
    private String password;
    
    public int getId () {
        return id;
    }
    
    public String getUsername () {
        return username;
    }
    
    public String getPassword () {
        return password;
    }
    
}
