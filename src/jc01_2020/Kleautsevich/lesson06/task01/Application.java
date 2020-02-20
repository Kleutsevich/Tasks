package jc01_2020.Kleautsevich.lesson06.task01;

public class Application {
    public static void main(String[] args) {
        Time time = new Time(5, 3, 1);
        System.out.println(time.getFullSeconds());

        TimeLength timeLength = new TimeLength(5000);
        System.out.println(time.toString());
    }
}
