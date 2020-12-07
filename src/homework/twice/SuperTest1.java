package homework.twice;
class Father{
    int house_area=100;
    public void print_house_area(){
        System.out.println("The area of father's house is "+house_area);
    }
}
class Son extends Father{
    double house_area=120.3;
    public void print_house_area(){
        System.out.println("The area of son's house is "+house_area);
        super.house_area=160;
        super.print_house_area();
    }
}
class GrandSon extends Son{
    public void print_house_area(){
        Father a =new Father();
        a.print_house_area();
    }
}
public class SuperTest1 {
    public static void main(String[] args){
        GrandSon grandSon=new GrandSon();
        grandSon.print_house_area();
    }
}
