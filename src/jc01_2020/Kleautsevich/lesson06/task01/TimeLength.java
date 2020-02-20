package jc01_2020.Kleautsevich.lesson06.task01;

public class TimeLength {
    int seconds;
    int minutes;
    int hours;



    public TimeLength(int hours, int minutes, int seconds) {
        this.hours = Math.abs(hours);
        this.minutes = Math.abs(minutes);
        this.seconds = Math.abs(seconds);
    }


    void convertSecondsToTime(int seconds) {
       this.hours = seconds % 3600;
       this.minutes = seconds % 60;
       this.seconds = seconds;

    }

}
