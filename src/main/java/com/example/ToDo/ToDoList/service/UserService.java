package com.example.ToDo.ToDoList.service;

import com.example.ToDo.ToDoList.entity.Task;
import com.example.ToDo.ToDoList.entity.User;
import com.example.ToDo.ToDoList.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User saveUser(User user){
        return userRepository.save(user);
    }
}
