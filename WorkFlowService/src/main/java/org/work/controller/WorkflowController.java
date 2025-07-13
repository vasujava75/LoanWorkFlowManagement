package org.work.controller;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.TaskService;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import org.work.TaskDTO;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/workflow")
public class WorkflowController {

    @Autowired
    private RuntimeService runtimeService;

    @Autowired
    private TaskService taskService;

    // Start the loan application process
    @PostMapping("/start")
    public ResponseEntity<String> startProcess(@RequestBody Map<String, Object> variables) {
        ProcessInstance instance = runtimeService.startProcessInstanceByKey("LoanApplicationProcess", variables);
        return ResponseEntity.ok("Started process instance with ID: " + instance.getId());
    }
    // Get tasks for a specific user
    @GetMapping("/tasks")
    public List<TaskDTO> getTasks() {
        String managerRole= SecurityContextHolder.getContext().getAuthentication().getAuthorities().stream().findAny().get().toString();
        return taskService.createTaskQuery()
                .taskAssignee(managerRole)
                .initializeFormKeys().list().stream().map(
                TaskDTO::new).collect(Collectors.toList());
    }

    // Complete a task
    @PostMapping("/tasks/{taskId}/complete")
    public ResponseEntity<String> completeTask(@PathVariable String taskId, @RequestBody Map<String, Object> variables) {
        taskService.complete(taskId, variables);
        return ResponseEntity.ok("Task " + taskId + " completed.");
    }
}
