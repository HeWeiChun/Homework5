import java.util.*;

class Screener implements Comparable<Screener>{
    private int size;
    private int price;
    Screener(int size,int price){
        this.size=size;
        this.price=price;
    }
    public String toString(){
        return "("+this.size+","+this.price+")";
    }
    /*public int compareTo(Screener other){
        double a=this.size*1.0/this.price;
        double b=other.size*1.0/other.price;
        double epsilon=1e-5;
        double diff=a-b;
        if(Math.abs(diff)<epsilon) return 0;
        if(a<b) return -1;
        return 1;
    }*/
    public int compareTo(Screener other){
        return this.size-other.size;
    }

}
public class SetTester {
    private String[] names={"张三","李四","王五","赵六","张三2","李四2","王五2","赵六2"};
    private Random r=new Random();
    private int getGetRandomInt(int capacity){
        return Math.abs(r.nextInt()) % capacity;
    }
    private void randomFillSet(Set<String> s){
        int howmany=getGetRandomInt(names.length);
        howmany +=1;

        int i=0;
        for(;i<howmany;++i){
            int j=getGetRandomInt(names.length);
            s.add(names[j]);
        }
    }
    private void testSet(){
        Set<String> a=new HashSet<String>();
        Set<String> b=new HashSet<String>();

        randomFillSet(a);
        randomFillSet(b);

        Set<String> r=new HashSet<String>();
        for(String e:a) {
            if (!b.contains(e)) continue;
            r.add(e);
        }
        for(String e:r){
            System.out.println(e+" ");
        }
    }
    private void testSetSort(){
        Set<Integer> a=new TreeSet<Integer>(); //HashSet
        int i=10;
        for(;i>=0;--i){
            a.add(this.getGetRandomInt(100));
        }
        for(Integer s:a)
            System.out.print(s + " ");
    }
    private void testScreenSet(){
        Set<Screener> a=new TreeSet<Screener>();
        int i=10;
        for(;i>=0;--i)
            a.add(new Screener(i,i+1));
        for(Screener s:a)
            System.out.print(s+" ");
    }
    private void testScreenSet2(){

    }
    public static void main(String[] args){
        SetTester t=new SetTester();
        t.testSet();
        /*t.testSetSort();
        t.testScreenSet();*/
    }
}
