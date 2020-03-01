package jc01_2020.Kleautsevich.lesson07.task01;

/*
 *
 * Собираем чемодан
 *
 * Класс Box является контейнером, он можем содержать в себе другие фигуры. Реализовать в нем конструктор, в который
 * передается объем коробки, и метод add(), который принимает на вход Shape и кладет в коробку.
 * Нужно добавлять новые фигуры до тех пор, пока для них хватает места в Box (будем считать только объём, игнорируя форму.
 * Допустим, мы переливаем жидкость). Если места для добавления новой фигуры не хватает, то метод должен вернуть false.
 * Все сущности должны являться наследниками класса Shape.
 * Параллелепипед - прямоугольный
 *
 */

public class Application {

    public static void main(String[] args) {
        Box box = new Box(200.0d);
        Cylinder cylinder = new Cylinder(2.8, 5);
        Parallelepiped parallelepiped = new Parallelepiped(4, 5, 6.2);
        Pyramid pyramid = new Pyramid(20.6, 6);
        Sphere sphere = new Sphere(4.1);
        System.out.println(box.add(cylinder));
        System.out.println(box.add(parallelepiped));
        System.out.println(box.add(pyramid));
        System.out.println(box.add(sphere));
    }
}
