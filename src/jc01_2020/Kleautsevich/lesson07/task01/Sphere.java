package jc01_2020.Kleautsevich.lesson07.task01;

public class Sphere extends Shape {

    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
        this.setVolume(getVolume());
    }

    public double getVolume() {
        return (3 * Math.PI * Math.pow(radius, 3)) / 4;
    }
}
