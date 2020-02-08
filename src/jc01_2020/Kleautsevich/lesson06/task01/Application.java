package jc01_2020.Kleautsevich.lesson06.task01;

public class Application {
    public static void main(String[] args) {
        Time time = new Time((byte) 5, (byte) 3, (byte) 1);
        System.out.println(time.getFullSeconds());
    }
}
