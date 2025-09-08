class Instanceinitiliser {
    // constructor (no return type)
    Instanceinitiliser() {
        System.out.println("Constructor is invoked");
    }

    // instance initializer block
    {
        System.out.println("Instance initializer block is invoked");
    }

    public static void main(String args[]) {
        Instanceinitiliser b1 = new Instanceinitiliser();
        Instanceinitiliser b2 = new Instanceinitiliser();
    }
}
