package jc01_2020.Kleautsevich.lesson06.task01;

public class Time {
    int seconds;
    int minutes;
    int hours;


    public Time(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    int getFullSeconds() {
        return seconds + 60 * minutes + 60 * 60 * hours;
    }
}
