package homework.twice;
interface Computable<E>{
    E add(E other);
    E minus(E other);
}
class Vector implements Computable<Vector>{
    private int x,y;
    Vector(int x, int y){this.x=x;this.y=y;}
    public Vector add(Vector other){
        return new Vector(this.x+other.x,+this.y+other.y);
    }
    public Vector minus(Vector other){
        return new Vector(this.x-other.x,+this.y-other.y);
    }
    public String toString(){
        return "("+x+","+y+")";
    }
}
public class VectorTest {
    public static void main(String[] args){
        Vector apple = new Vector(5,2);
        Vector banana = new Vector(3,-1);
        System.out.println(apple.add(banana));
        System.out.println(apple.minus(banana));
    }
}
