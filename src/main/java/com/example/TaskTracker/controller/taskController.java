package com.example.TaskTracker.controller;

import com.example.TaskTracker.entity.Task;
import com.example.TaskTracker.service.taskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/task")
public class taskController {


    private taskService taskservice;

    public taskController(taskService taskservice) {
        super();
        this.taskservice = taskservice;
    }


    @PostMapping
    public ResponseEntity<Task> saveTask(@RequestBody Task task)
    {
        return new ResponseEntity<Task>(taskservice.saveTask(task), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Task> getAllTasks(){
        return taskservice.getAllTasks();

    }


    @DeleteMapping("{id}")
    public ResponseEntity<Task> deleteTask(@PathVariable("id") int id)
    {
        return new ResponseEntity<Task>(taskservice.deleteTask(id),HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<Task> updateTask(@PathVariable("id") int id,@RequestBody Task task)
    {
        return new ResponseEntity<Task>(taskservice.updateTask(id,task),HttpStatus.OK);
    }






}
