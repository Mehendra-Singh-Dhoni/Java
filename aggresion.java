import java.util.Scanner
class Address {
    String city, state, country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

class Emp {
    int id;
    String name;
    Address address; // HAS-A relationship (Aggregation)

    public Emp(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address.city + ", " + address.state + ", " + address.country);
        System.out.println("--------------------------------");
    }
}

public class aggresion {
    public static void main(String args[]) {
        Address address1 = new Address("Gzb", "UP", "India");    
        Address address2 = new Address("Gno", "UP", "India");    

        Emp e1 = new Emp(111, "Varun", address1);    
        Emp e2 = new Emp(112, "Arun", address2);    

        e1.display();    
        e2.display();      
    }
}
