import java.util.*;
public class StringToken{
    public static void main(String args[]){
        StringTokenizer st= new StringTokenizer("Hello java how are you .", "java");
        while (st.hasMoreTokens()) {  
         System.out.println(st.nextToken());  
     }  
   }  
}