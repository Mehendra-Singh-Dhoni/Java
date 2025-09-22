class Files{

public static void main(String args[]){
 int a[]=new int[5];  
    a[0]=10;//initialization    
    a[1]=20;    
    a[2]=70;    
    a[3]=40;    
    a[4]=50;    
    //traversing array  
    try{  
    for(int i=0;i<=5;i++){//length is the property of array    
        System.out.println(a[i]);    
    } 
    }
    catch(Exception e){
        System.out.println(e);
        System.out.println("out of index");
    } 

}
}