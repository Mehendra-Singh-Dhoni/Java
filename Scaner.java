import java.util.Scanner;
public class Scaner{
    public static void main(String args[]){
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter Number:");
        int n= reader.nextInt();
        if(n%2==0){
            System.out.println("Even Number");
        }
        else if(n==1){
            System.out.println("Number is 1 nither odd nor even");
        }
        else{
            System.out.println("Number is odd");
        }
    }
}