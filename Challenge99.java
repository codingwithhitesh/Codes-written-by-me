class Hellothread extends Thread {
    private final int threadNumber;

    public Hellothread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("S.No" + i + 1 + " " + "Hello from Thread " + " " + threadNumber +
                    Thread.currentThread().getName());
        }
    }

    static class Main {

        public static void main(String[] args) {
            Hellothread T1 = new Hellothread(1);
            Hellothread T2 = new Hellothread(2);

            T1.start();
            T2.start();

        }
    }
}

