package homework.twice;
abstract class Animal{
    abstract void run();
    abstract void eat();
}
class Elephant extends Animal{
    void run(){
        System.out.println("The Elephant is running");
    }
    void eat(){
        System.out.println("The Elephant is eating");
    }
}
class Lion extends Animal{
    void run(){
        System.out.println("The Lion is running");
    }
    void eat(){
        System.out.println("The Lion is eating");
    }
}
class Zebra extends Animal{
    void run(){
        System.out.println("The Zebra is running");
    }
    void eat(){
        System.out.println("The Zebra is eating");
    }
}
public class TestAnimal {
    public static void main(String[] args){
        Animal testOne = new Elephant();
        Lion y = new Lion();
        Zebra z = new Zebra();
        Animal testTwo;
        testTwo=y;
        testOne.eat();
        testOne.run();
        testTwo.eat();
        testTwo.run();
        testTwo=z;
        testTwo.eat();
        testTwo.run();
    }
}

