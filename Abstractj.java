abstract class Roi{
    Roi(){System.out.println("Hello");}
    abstract int GetROI();
}
class HDFC extends Roi{
    int GetROI(){return 7;}
}

class BOB extends Roi{
    int GetROI(){return 6;}
}

class Abstractj{
    public static void main(String args[]){
        Roi R;
        R=new HDFC();
        System.out.println("Roi of HDFC:" + R.GetROI() + "%");
        R=new BOB();
        System.out.println("Roi of BOB:" + R.GetROI() + "%");
    }
}