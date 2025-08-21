public class Switchch{
    public static void main(String args[]){
        String a="Soham";
        switch(a){
            case"Soham":
            System.out.println("correctly typed name");
            break;
            case"soham":
            System.out.println("S should be capital in Soham");
            break;
            case"sOHAM":
            System.out.println("Check your capslock key");
            default:
                System.out.println("enter correct spelling");
        }
    }
}