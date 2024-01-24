package com.workintech.task1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
    }

    public Set<Task> getAnnsTasks() {
        return annsTasks;
    }

    public Set<Task> getBobsTasks() {
        return bobsTasks;
    }

    public Set<Task> getCarolsTasks() {
        return carolsTasks;
    }

    public Set<Task> getTasks(String asignee) {
        switch (asignee) {
            case "ann":
                return annsTasks;
            case "bob":
                return bobsTasks;
            case "carol":
                return carolsTasks;
            case "all":
                System.out.println("all run");
                return getUnion(bobsTasks, annsTasks, carolsTasks);
            default:
                System.out.println("Wrong name!");
                return null;
        }

    }
    public Set<Task> getUnion(Set<Task>... sets) {
        HashSet<Task> total = new LinkedHashSet<>();

        for (Set<Task> taskSet : sets) {
            total.addAll(taskSet);
            System.out.println(taskSet);
        }
        System.out.println("total: " + total);
        return total;
    }
    public void addTask(Task task) {
        switch (task.getAssignee()){
            case "ann":
                annsTasks.add(task);
                break;
            case "bob":
                bobsTasks.add(task);
                break;
            case "carol":
                carolsTasks.add(task);
                break;
            default:
                System.out.println("Invalid asignee: " + task.getAssignee());
        }
    }

    @Override
    public String toString() {
        return "TaskData{" +
                "annsTasks=" + annsTasks +
                ", bobsTasks=" + bobsTasks +
                ", carolsTasks=" + carolsTasks +
                '}';
    }
}
