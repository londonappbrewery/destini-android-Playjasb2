package com.londonappbrewery.destini;


public class Story {

    private int storyID;
    private int firstOptionID;
    private int secondOptionID;

    public Story(int storyResourceID, int firstOptionResourceID, int secondOptionResourceID) {
        storyID = storyResourceID;
        firstOptionID = firstOptionResourceID;
        secondOptionID = secondOptionResourceID;
    }

    public int getStoryID() {
        return storyID;
    }

    public void setStoryID(int storyID) {
        this.storyID = storyID;
    }

    public int getFirstOptionID() {
        return firstOptionID;
    }

    public void setFirstOptionID(int firstOptionID) {
        this.firstOptionID = firstOptionID;
    }

    public int getSecondOptionID() {
        return secondOptionID;
    }

    public void setSecondOptionID(int secondOptionID) {
        this.secondOptionID = secondOptionID;
    }
}
