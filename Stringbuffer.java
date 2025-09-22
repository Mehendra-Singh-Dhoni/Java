public class Stringbuffer{
    public static void main(String args[]){
        StringBuffer s= new StringBuffer("Tendulkar");
        s.insert(0,"Sachin");
        s.replace(1,3,"Java");    
        System.out.println(s);
        s.delete(1,3);    
        s.append("Java");
        System.out.println(s);

    }
}