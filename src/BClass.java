interface InterfaceA{

    String s="good ";
    void f();
}
abstract class ClassA{
    abstract void g();
}
class ClassB extends ClassA implements InterfaceA{
    void g(){
        System.out.print(this.s);
    }
    public void f(){
        System.out.print(" "+s);
    }
}
class E {
    public static void main(String[] args) {
        System.out.println(InterfaceA.s);
    }
}