package org.work;

import jdk.jfr.DataAmount;
import org.camunda.bpm.engine.task.Task;

import java.util.List;
import java.util.Map;

public class TaskDTO {
    private String id;
    private String name;
    private String assignee;
    private  String formKey;
    private Map<String, Object> taskVariables;

    public TaskDTO(Task task) {
        this.id = task.getId();
        this.name = task.getName();
        this.assignee = task.getAssignee();
        this.formKey = task.getFormKey(); // only if .initializeFormKeys() was used
    }

    // Getters and setters


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getFormKey() {

        return formKey;
    }

    public void setFormKey(String formKey) {
        this.formKey = formKey;
    }

    public Map<String, Object> getTaskVariables() {
        return taskVariables;
    }
    public void setTaskVariables(Map<String, Object> taskVariables) {
        this.taskVariables = taskVariables;
    }
}

