interface ROI {
    float GetROI();
}

class Bob implements ROI {
    public float GetROI() {
        return 6;
    }
}

class HDFC implements ROI {
    public float GetROI() {
        return 7;
    }
}

class Axis implements ROI {
    public float GetROI() {
        return 6.5f; // add 'f' for float literal
    }
}

class SBI implements ROI {
    public float GetROI() {
        return 4.5f;
    }
}

public class Interface {
    public static void main(String[] Args) {
        ROI arr[] = new ROI[4];
        arr[0] = new Bob();
        arr[1] = new HDFC();
        arr[2] = new Axis();
        arr[3] = new SBI();

        for (int i = 0; i < arr.length; i++) {
            ROI R = arr[i];
            System.out.println(R.getClass().getSimpleName() + " : " + R.GetROI());
        }
    }
}
