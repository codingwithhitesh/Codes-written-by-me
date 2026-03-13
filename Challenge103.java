import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Challenge103 {

    static class PrintNumbers implements Runnable {
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Number is " + (i + 1));
            }
        }

        static class singleThreadService {
            public static void main(String[] args) {
                ExecutorService service = Executors.newSingleThreadExecutor();
                PrintNumbers task = new PrintNumbers();
                service.submit(task);
            }
        }
    }
}
