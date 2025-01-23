package org.example.serialization;

import java.io.Serializable;

/**
 * The type Task.
 */
public class Task implements Serializable {
    private String title;
    private String description;
    private boolean isCompleted;
    private int priority;

    public Task() {
    }

    public Task(String title, String description, boolean isCompleted, int priority) {
        this.title = title;
        this.description = description;
        this.isCompleted = isCompleted;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", isCompleted=" + isCompleted +
                ", priority=" + priority +
                '}';
    }
}
