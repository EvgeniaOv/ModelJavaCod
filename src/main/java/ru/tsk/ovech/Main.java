package ru.tsk.ovech;

public class Main {

    public static void main (String[] args) {
        //создание объекта по описанию
        Dog aDog = new Dog();
        aDog.age = 7;
        aDog.color = "Ginger";
        aDog.isBarking = false;
        aDog.playing();

        Parrot aParrot = new Parrot();
        aParrot.name = "Гоша";
        aParrot.isFlying = true;
        aParrot.singing();
    };
}

