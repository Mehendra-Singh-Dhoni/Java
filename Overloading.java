import java.util.Scanner;
class Operation{
    public int add(int a,int b){
        return a+b;
    }
    public double add(double a,double b){
        return a+b;
    }
}
public class Overloading{
    public static void main(String args[]){
        Scanner reader=new Scanner(System.in);
        Operation op= new Operation();
        int a=op.add(5,2);
        double b=op.add(4.2,5.5);
        System.out.println("Int add:" + a);
        System.out.println("Double add:" + b);
    }
}