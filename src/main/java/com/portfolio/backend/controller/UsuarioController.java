/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.controller;

import com.portfolio.backend.model.Usuario;
import com.portfolio.backend.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "https://portfolio-johnny-f39f6.web.app")
@RequestMapping("/usuario")
@RestController
public class UsuarioController {
    
    @Autowired
    private UsuarioRepository usuarioRepo;
    
    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody Usuario userData) {
        System.out.println(userData);
        Usuario usuario = usuarioRepo.findByUsername(userData.getUsername());
        if(usuario.getPassword().equals(userData.getPassword()))
            return ResponseEntity.ok(usuario);
        return (ResponseEntity<?>)ResponseEntity.internalServerError();
    }
}
