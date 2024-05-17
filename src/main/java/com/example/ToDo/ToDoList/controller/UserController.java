package com.example.ToDo.ToDoList.controller;

import com.example.ToDo.ToDoList.entity.Task;
import com.example.ToDo.ToDoList.entity.User;
import com.example.ToDo.ToDoList.repository.TaskRepository;
import com.example.ToDo.ToDoList.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @Autowired
    TaskRepository taskRepository;

    @GetMapping("/getUserById")
    ResponseEntity<User> getUser(@RequestParam long user_id) {
        Optional<User> user = userRepository.findById(user_id);
        //User user2 = user.get();
        return ResponseEntity.of(user);
    }


    @PostMapping("/saveTasks")
    Task saveTask(@RequestParam long user_id, Task task) {
        Optional<User> user = userRepository.findById(user_id);
        task.setUser(user.get());
        return taskRepository.save(task);
    }

    @PostMapping("/saveUser")
    User saveUser(User user) {
        return userRepository.save(user);
    }

}
