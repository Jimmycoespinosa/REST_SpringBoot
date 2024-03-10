package com.example.service;

import com.example.model.User;
import java.util.List;

public interface UserService {
    public List<User> ListUsers();
    public void SaveUser(User usuario);
    public void DeleteUser(User usuario);
    public User SearchUser(User usuario);
}
