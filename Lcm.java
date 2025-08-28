import java.util.Scanner;
public class Lcm{
    public static void main(String args[]){
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter value of n1: ");
        int n1=reader.nextInt();
        System.out.print("Enter value of n2: ");
        int n2=reader.nextInt();
        int gcd=1;
        for(int i=1;i<=n1 && i<=n2;i++){
            if(n1%i==0 && n2%i==0){
                gcd=i;
                }
        }
        int lcm=(n1*n2)/gcd;
        System.out.println("LCM for " + n1 + " and " + n2 + " is: " + lcm);
    }
}