package com.example.TaskTracker.service.impl;

import com.example.TaskTracker.bean.TaskBean;
import com.example.TaskTracker.entity.Task;
import com.example.TaskTracker.repository.taskRepository;
import com.example.TaskTracker.service.taskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class taskServiceImpl implements taskService {


    private taskRepository taskrepository;

    public taskServiceImpl(taskRepository taskrepository) {
        this.taskrepository = taskrepository;
    }


    @Override
    public Task saveTask(Task Task) {
        return taskrepository.save(Task);
    }

    @Override
    public List<Task> getAllTasks() {
        return taskrepository.findAll();
    }

    @Override
    public Task deleteTask(int id) {
        Task t = new Task();
        t.setDay(taskrepository.findById(id).get().getDay());
        t.setText(taskrepository.findById(id).get().getText());
        t.setReminder(taskrepository.findById(id).get().isReminder());
        taskrepository.deleteAllById(Collections.singleton(id));
        return t;
    }

    @Override
    public Task updateTask(int id, Task task) {
        task.setReminder(task.isReminder());
        return taskrepository.save(task);
    }
}
