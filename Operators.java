public class Operators{
    public static void main(String args[]){
        int x=100,y=10,z=2;
        System.out.println("the pre increment of 10:" + ++x);
        System.out.println("the post increment of 10:"+ x++);
        System.out.println("After post increment value:" + x);
        System.out.println("X and Y:" + (x&y));
        System.out.println("X or Z:" + (x|z));
        System.out.println("Y xor Z:" + (y^z));
        if((x>y)&&(x>z)){
            System.out.println("X is largest");
        }
        String d="x is greater";
        System.out.println((x>y)?d:y);
    }
}