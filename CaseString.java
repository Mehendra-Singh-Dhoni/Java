public class CaseString{
    public static void main(String args[]){
        String s="Sachin";    
System.out.println(s.toUpperCase());//SACHIN    
System.out.println(s.toLowerCase());//sachin    
System.out.println(s);//Sachin(no change in original)    
System.out.println(s.startsWith("Sa"));//true    
System.out.println(s.endsWith("n"));//true 
System.out.println(s.charAt(0));
System.out.println(s.charAt(4));
    }
}