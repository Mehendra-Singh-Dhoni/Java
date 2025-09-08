import java.util.Scanner;
class Person{
    String name;
    int age;
    void displayPerson(){
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
    }
}
class Student extends Person{
    int id;
    void displayPerson(){
        super.displayPerson();
        System.out.println("id:" + id);
    }
}
public class Overriding{
    public static void main(String args[]){
        Scanner reader=new Scanner(System.in);
        Student s=new Student();
        System.out.print("Enter id:");
        s.id=reader.nextInt();
        System.out.print("Enter age:");
        s.age=reader.nextInt();
        reader.nextLine();
        System.out.print("Enter name");
        s.name=reader.nextLine();
        s.displayPerson();
    }
}