package com.kodilla.collections.adv.immutable.homework;

public final class Task {                         // zmiana - wprowadzenie zabezpieczenia "final"
    protected final String title;
    protected final int duration;


    public Task(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public final String getTitle() {
        return title;
    }

    public final int getDuration() {
        return duration;
    }
}
