class Student{
    int id;
    String student;
    int marks;
    Student(int i,String s){
        id=i;
        student=s;
    }
    Student(int i,String s,int j){
        id=i;
        student=s;
        marks=j;
    }
    void display(){
        System.out.println(id + "   " + student + "    " + marks);
    }
}
public class Cons{
    public static void main(String args[]){
        Student s1=new Student(1001,"asdfghj");
        Student s2=new Student(1002,"zxcvbnm");
        Student s3=new Student(1003,"qwertyuiop",87);
        s1.display();
        s2.display();
        s3.display();
    }
}