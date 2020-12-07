import java.util.*;

interface Computable{
    Vector add(Vector other);
}
interface BinaryOper<E>{
    E oper(E a,E b);
}
class Vector implements Computable{
    private int[] data;
    private int dim;

    private Vector(int dim){
        this.dim=dim;
        data=new int[dim];
        for(int i=0;i<dim;++i)
            data[i]=0;
    }
    Vector(int[] data){
        this.data=new int[data.length];
        System.arraycopy(data,0,this.data,0,data.length);
        this.dim=data.length;
    }
    private Vector tupleOper(Vector other,BinaryOper<Integer> op){
        assert(this.dim==other.dim);
        Vector ret=new Vector(this.dim);
        for(int i=0;i<dim;++i){
            ret.data[i]=op.oper(this.data[i],other.data[i]);
        }
        return ret;
    }
    @Override
    public Vector add(Vector other) {
        return tupleOper(other, new BinaryOper<Integer>() {
            @Override
            public Integer oper(Integer a, Integer b) {
                return a+b;
            }
        });
    }
    public Vector minus(Vector other) {
        return tupleOper(other, new BinaryOper<Integer>() {
            @Override
            public Integer oper(Integer a, Integer b) {
                return a + b;
            }
        });
    }
    public String toString(){
        String tmp="";
        for(int d:this.data)
            tmp+=d+" ";
        return tmp;
    }
}
public class Test {
    public static void main(String[] args){
        int[] data=new int[]{1,2,3};
        Vector a=new Vector(data);
        Vector b=new Vector(new int[]{4,5,6});
        Vector c=a.add(b);
        System.out.println(c);
    }
}
