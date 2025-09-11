import mypackage1.Class1;
import mypackage2.Class2;
class Packages{
    public static void main(String args[]){
        Class1 C=new Class1();
        Class2 D=new Class2();
        C.SetName("ASDFGHJKL");
        System.out.println(C.GetName());
        D.m1();
    }
}