package org.APCSLowell;

public class StepTracker {
    private int steps;
    private int days;
    private int adays;
    private int mindays;
    public StepTracker(int activityThreshold) {
        steps = 0;
        days = 0;
        adays = 0;
        mindays = activityThreshold;
    }
    public void addDailySteps(int stepCount) {
        steps += stepCount;
        days++;
        if(stepCount >= mindays){
            adays++;
        }
    }
    public int activeDays() {
        return(adays);
    }
    public double averageSteps() {
        if(days == 0){
            return 0.0;
        }
        else{
            return ((double)steps/days);
        }
    }
}
