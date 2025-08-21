public class Factorial{
    public static void main(String args[]){
        int f=5;
        int result=1;
        for(f=f;f>=1;f--){
            result=result*f;
        }
        System.out.println(
            "factorial is " + result
        );
    }
}