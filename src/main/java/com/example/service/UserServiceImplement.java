package com.example.service;

import com.example.dao.UserDAO;
import com.example.model.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImplement implements UserService{

    @Autowired
    private UserDAO usuarioDAO;
    
    @Override
    @Transactional(readOnly = true)
    public List<User> ListUsers() {
        return (List<User>) usuarioDAO.findAll();
    }

    @Override
    @Transactional
    public void SaveUser(User usuario) {
        usuarioDAO.save(usuario);
    }

    @Override
    @Transactional
    public void DeleteUser(User usuario) {
        usuarioDAO.delete(usuario);
    }

    @Override
    @Transactional(readOnly = true)
    public User SearchUser(User usuario) {
        return usuarioDAO.findById(usuario.getId()).orElse(null);
    }    
}
