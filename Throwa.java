import java.lang.ArithmeticException;
public class Throwa{
    public static void validate(int age){
        if(age<18){
            throw new ArithmeticException("Person not elegible to vote");
        }
        else{
            System.out.println("Person is eligible to vote!!");    
        }
    }
    public static void main(String args[]){
        try{
        validate(10);
        }
        catch(ArithmeticException e){
            System.out.println("Error:" + e);
        }
        System.out.println("Rest of the code");
    }
}