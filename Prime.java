public class Prime{
    public static void main(String args[]){
        int num=7;
        int check=0;
        int i=2;
        while(i<num){
            if(num%i==0){
                check=1;
            }
            i++;
        }
        if(check==1){
            System.out.println(num + " is not an prime number");
        }
        else{
            System.out.println(num + " is an prime number");

        }
    }
}