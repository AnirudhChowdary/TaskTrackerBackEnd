package com.example.TaskTracker.service;

import com.example.TaskTracker.entity.Task;

import java.util.List;

public interface taskService {
    Task saveTask(Task Task);
    List<Task> getAllTasks();
    Task deleteTask(int id);
    Task updateTask(int id,Task task);
}
