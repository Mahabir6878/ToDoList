package com.example.ToDo.ToDoList.service;

import com.example.ToDo.ToDoList.entity.Task;
import com.example.ToDo.ToDoList.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    TaskRepository taskRepository;

    public String saveAllTask(List<Task> tasks){
        taskRepository.saveAll(tasks);
        return "Task saved";
    }

    public Task getTasksByUserId(long task_id) {
        return taskRepository.findById(task_id).get();
    }
}
