package jc01_2020.Kleautsevich.lesson06.task01;

public class TimeLength {
    int seconds;

    public TimeLength(int seconds) {
        this.seconds = seconds;
    }
    Time convertSecondsToTime() {
       int secondsToMinutes = seconds % 3600;
       int hours = (seconds - secondsToMinutes) / 3600;
       int secondsLeft = secondsToMinutes % 60;
       int minutes = (secondsToMinutes - secondsLeft) / 60;
       return new Time(secondsLeft, minutes, hours);
    }

}
