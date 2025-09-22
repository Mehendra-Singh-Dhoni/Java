class ToStrings {  
    int rollno;  
    String name;  
    String city;  

    // Constructor (no return type)
    ToStrings(int rollno, String name, String city) {  
        this.rollno = rollno;  
        this.name = name;  
        this.city = city;  
    }  

    // Overriding toString() method  
    public String toString() {  
        return rollno + " " + name + " " + city;  
    }  

    public static void main(String args[]) {  
        ToStrings s1 = new ToStrings(101, "Raj", "Lucknow");  
        ToStrings s2 = new ToStrings(102, "Vijay", "Ghaziabad");  

        System.out.println(s1); // s1.toString() gets called  
        System.out.println(s2); // s2.toString() gets called  
    }  
}  
