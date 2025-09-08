class dog{
    String color="Black";
}
class cat extends dog{
    String color="White";
    void print(){
    System.out.println("Color of cat:" + color);
    
    System.out.println("Color of dog:" + super.color);
}}

class Supervar{
    public static void main(String args[]){
        cat c= new cat();
        c.print();
    }
}