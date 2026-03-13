public class SychronisationDemo {

    static class SyncDemo extends Thread {
        int n;

        public SyncDemo(int i) {
            this.n = i;
        }

        public void run() {
            multipleCreator(n);
            

        }

        static synchronized void multipleCreator(int n) {

            for (int i = 1; i <= 5; i++) {
                System.out.println(n * i +" "+ "Printed by " + Thread.currentThread().getName());

            }
        }

        public static void main(String[] args) throws InterruptedException {
            SyncDemo T1 = new SyncDemo(3);
            SyncDemo T2 = new SyncDemo(5);
            T1.start();
            T1.join();
            T2.start();
            T2.join();

        }
    }
}
