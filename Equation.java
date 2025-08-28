import java.util.Scanner;
public class Equation{
    public static void main(String args[]){
        System.out.println("Consider equation: ax^2+bx+c and give value for (a,b,c)");
        double a,b,c;
        Scanner reader=new Scanner(System.in);
        System.out.print("Value of a: ");
        a=reader.nextDouble();
        System.out.print("Value of b: ");
        b=reader.nextDouble();
        System.out.print("Value of c: ");
        c=reader.nextDouble();
        double k=b * b - 4 * a * c;
        c=Math.sqrt(k);
        a=2*a;
        double root1=(-b+c/a);
        double root2=(-b-c/a);
        System.out.println(root1);
        System.out.println(root2);
    }
}