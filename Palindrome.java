public class Palindrome{
    public static void main(String args[]){
        int p=121;
        int num=p;
        int check=0;
        while(num>0){
            int a=num%10;
            check=(check*10)+a;
            num=num/10;
        }
        if(p==check){
            System.out.println(p + " is an palindrome");
        }
        else{
            System.out.println(p + " is not an palindrome");
            }
    }
}