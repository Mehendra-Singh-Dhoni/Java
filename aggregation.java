class Operation{
    int square(int n){
        return n*n;
    }
}
class Circle{
    double pi=3.14;

    double area(int radius){
    Operation op=new Operation();
    int rsquare=op.square(radius);
    return pi*rsquare;
    }
}
public class aggregation{
    public static void main(String args[]){
        Circle c=new Circle();
        double result=c.area(10);
        System.out.println(result);
    }
}