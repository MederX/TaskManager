package com.example.taskmanager.service;

import com.example.taskmanager.model.Task;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TaskService {
    private final Map<String, Task> taskMap = new HashMap<>();

    public Task addTask(Task task) {
        taskMap.put(task.getId(), task);
        return task;
    }

    public Task getTask(String id) {
        return taskMap.get(id);
    }

    public Map<String, Task> getAllTasks() {
        return taskMap;
    }

    public void deleteTask(String id) {
        taskMap.remove(id);
    }
}
