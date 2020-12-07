package homework.twice;

class People{
    private double weight,height;
    People(){
        weight=50.2;
        height=172;
    }
    public String toString(){
        return "Weight: " + weight + " kg\nHeight: " + height +" cm";
    }
}
public class PeopleTest {
    public static void main(String[] agrs){
        People wang=new People();
        System.out.println(wang);
    }
}
