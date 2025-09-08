class Animal {
    String color = "Black";

    void display() {
        System.out.println("Animal color: " + color);
    }
}

class Dog extends Animal {
    String color = "White";

    Dog() {
        super(); // calls Animal constructor
    }

    void display() {
        super.display(); // calls parent method
        System.out.println("Animal color (via super): " + super.color);
        System.out.println("Dog color: " + color);
    }
}

class Super {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}
