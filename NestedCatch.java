class NestedCatch{
    public static void main(String args[]){
        try{
            try{
                int a=100/0;
            }
            catch(ArithmeticException e){
                System.out.println(e);
            }
            try{
                int arr[]= new int[5];
                arr[5]=410;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
             finally {    
    System.out.println("Finally block is always executed");    
    }      
        }
        catch(Exception e){
            System.out.println("handled the exception (outer catch)");    

        }
    }
}