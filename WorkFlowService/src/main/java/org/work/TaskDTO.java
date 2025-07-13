package org.work;

import org.camunda.bpm.engine.task.Task;

public class TaskDTO {
    private String id;
    private String name;
    private String assignee;
    private String formKey;

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
}

