import java.util.Scanner;

class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println(id + " " + name + " " + marks);
    }
}

public class Thiis {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = reader.nextInt();
        Student[] obj = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter id:");
            int id = reader.nextInt();

            System.out.println("Enter Marks:");
            int marks = reader.nextInt();

            reader.nextLine(); // clear leftover newline

            System.out.println("Enter name:");
            String name = reader.nextLine();

            obj[i] = new Student(id, name, marks);
        }

        System.out.println("\nStudent Details:");
        for (int j = 0; j < n; j++) {
            obj[j].display();
        }
    }
}
