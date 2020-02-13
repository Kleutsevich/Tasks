package jc01_2020.Kleautsevich.lesson07.task01;

public class Box {
    private double volume;

    public Box(double volume) {
        this.volume = volume;
    }
    public boolean add(Shape shape) {
        if (this.volume >= shape.getVolume()) {
            this.volume -= shape.getVolume();
            return true;
        } else {
            return false;
        }
    }
}
