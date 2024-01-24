package com.workintech.task1;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Task taskForBob = new Task("s15d2","dummy desc","bob", Priority.HIGH, Status.ASSIGNED);
        Task taskForBob2 = new Task("s15d2","dummy desc 2","bob", Priority.HIGH, Status.IN_PROGRESS);

        Task taskForAnn = new Task("s15d2","dummy desc","ann", Priority.HIGH, Status.ASSIGNED);
        Task taskForAnn2 = new Task("s15d2","dummy desc 2","ann", Priority.MED, Status.IN_PROGRESS);

        Task taskForCarol = new Task("s15d2","dummy desc","carol", Priority.HIGH, Status.ASSIGNED);
        Task taskForCarol2 = new Task("s15d2","dummy desc 2","carol", Priority.LOW, Status.IN_PROGRESS);


        Set<Task> annsTasks = new LinkedHashSet<>();
        annsTasks.add(taskForAnn);
        annsTasks.add(taskForAnn2);

        Set<Task> bobsTasks = new LinkedHashSet<>();
        bobsTasks.add(taskForBob);
        bobsTasks.add(taskForBob2);

        Set<Task> carolsTasks = new LinkedHashSet<>();
        carolsTasks.add(taskForCarol);
        carolsTasks.add(taskForCarol2);

        TaskData taskData = new TaskData(annsTasks,bobsTasks,carolsTasks);
        System.out.println(taskData.getTasks("all").toString());


    }
}
