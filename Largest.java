import java.util.Scanner;
class Largest{
    public static void main(String args[]){
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++){
            Scanner reader=new Scanner(System.in);
            System.out.print("Enter value for " + i + " index position:");
            int a=reader.nextInt();
            arr[i]=a;
        }
            int largest=0;

        for(int j=0;j<arr.length;j++){
            if(arr[j]>arr[largest]){
                largest=j;
            }
        }
        System.out.println("the largest element is: at index " + largest + " and value is :" + arr[largest]);
    }
}