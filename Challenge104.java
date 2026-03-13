import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Sleeptask implements Runnable {
    public void run() {
        Thread current = Thread.currentThread();
        System.out.println("Started with Thread %s \n" + current.getName());

        try {
            Thread.sleep(getRandom() * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Ended with Thread %s \n" + current.getName());
    }

    private int getRandom() {
        double random = Math.random() * 5 + 1;
        return (int) random;
    }
}

class multiThreadExecutorService {
    public static void main(String[] args) {
                try {
                    ExecutorService service = Executors.newFixedThreadPool(3);

                    for (int i = 0; i < 10; i++) {
                        Sleeptask task = new Sleeptask();
                        service.submit(task);
                    }
                    if (!service.awaitTermination(10, TimeUnit.SECONDS)) {
                        System.out.println("Emergency shutdown");
                    }

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }



