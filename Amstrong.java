public class Amstrong{
    public static void main(String args[]){
        int sum=0;
        int a=7;
        int check=a;
        while(a>0){
            int b=(a%10);
            int c=(b*b*b);
            sum+=c;
            a=a/10;
        }
        if (sum==check){
            System.out.println(check + " is an amstrong number");
        }
        else{
                System.out.println(check + " is not an amstrong number");
        }
    }
}