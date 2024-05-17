package com.example.ToDo.ToDoList.repository;

import com.example.ToDo.ToDoList.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
