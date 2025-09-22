import java.io.IOException;
class Throwsa{
    void m()throws IOException{
        throw new IOException("Error");
    }
    void n()throws IOException{
        m();
    }
    void p(){    
   try{    
    n();    
   }catch(Exception e){System.out.println("exception handled");}    
  }    
    public static void main(String args[]){
        Throwsa obj= new  Throwsa();
        obj.p();
        System.out.println("Rest of code");
    }
}