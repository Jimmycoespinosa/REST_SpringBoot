package com.example.controller;

import com.example.dao.UserDAO;
import com.example.model.User;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class User_Controller_REST {
    @Autowired
    private UserDAO usuarioDAO;
    
    @PostMapping("usuario")
    @ResponseStatus(HttpStatus.CREATED)
    public User CreateUser(@RequestBody User usuario){
        return usuarioDAO.save(usuario);
    }
    
    @PutMapping("usuario")
    @ResponseStatus(HttpStatus.CREATED)
    public User UpdateUser(@RequestBody User usuario){
        return usuarioDAO.save(usuario);
    }
    
    @DeleteMapping("usuario/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void DeleteUser(@PathVariable Long id){
        usuarioDAO.deleteById(id);
    }
    
    @GetMapping("usuario/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<User> ShowById(@PathVariable Long id){
        return usuarioDAO.findById(id);
    }
    
    @GetMapping("usuarios")
    @ResponseStatus(HttpStatus.OK)
    public Iterable<User> ShowAll(){
        return usuarioDAO.findAll();
    }
}
