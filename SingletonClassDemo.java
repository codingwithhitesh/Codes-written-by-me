class Singleton {

    private static Singleton Instance;

    public Singleton() {

    }

    public static Singleton getInstance() {

        Instance = new Singleton();
        return Instance;
    }

    public void showMessage() {
        System.out.println("Printing from Singleton Class");
    }


    public static void main(String[] args) {
        // Get the only object available
        Singleton object = Singleton.getInstance();

        // Show the message
        object.showMessage();
    }
}

