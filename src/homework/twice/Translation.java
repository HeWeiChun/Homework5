package homework.twice;

abstract class Vehicle {
    String number;
    double weight, height;

    abstract void display();
}
class Bicycle extends Vehicle {
    Bicycle() {
        number = "T12345";
        weight = 10;
        height = 20;
    }
    void display() {
        System.out.println("The Bicycle's number is " + number +
                           ". It is " + weight + "kg heavy and " + height + " high.");
    }
}
class Car extends Vehicle {
    Car() {
        number = "B123456";
        weight = 30.5;
        height = 10.5;
    }
    void display() {
        System.out.println("The Car's number is " + number +
                           ". It is " + weight + "kg heavy and " + height + " high.");
    }
}
class Train extends Vehicle {
    Train() {
        number = "G8633";
        weight = 100.6;
        height = 50.4;
    }
    void display() {
        System.out.println("The Train's number is " + number +
                           ". It is " + weight + "kg heavy and " + height + " high.");
    }
}
public class Translation {
    public static void main(String[] args) {
        Bicycle x = new Bicycle();
        Car y = new Car();
        Train z = new Train();
        x.display();
        y.display();
        z.display();
    }
}
