public class StaticBlockTrial {

    static {
        System.out.println("Printed from Block 1");
    }
    static {
        System.out.println("Printed from Block 2");
    }

    public static void main(String[] args) {

    }
}

// Static blocks are executed as soon as main() method is
// called