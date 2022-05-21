package com.example.TaskTracker.repository;

import com.example.TaskTracker.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;

public interface taskRepository extends JpaRepository<Task,Integer>, RevisionRepository<Task,Integer,Integer> {
}
