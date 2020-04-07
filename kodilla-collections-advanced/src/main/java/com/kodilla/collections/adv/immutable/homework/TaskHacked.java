package com.kodilla.collections.adv.immutable.homework;

public class TaskHacked extends Task{
    private String hackTitle;
    private int hackDuration;

    public TaskHacked(String title, int duration) {
        super(title, duration);
        hackTitle = title;
        hackDuration =  duration;
    }

    public void modifyTitle(String newTitle){hackTitle = newTitle;}

    public void modifyDuration(String newDuration){hackDuration = newDuration;}

    public int getHackDuration() {
        return hackDuration;
    }

    public String getTitle() {
        return hackTitle;
    }


}
