import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Challenge105 {

    // Class name corrected (capitalization optional but conventional)
    static class FactorialCalculator implements Callable<Integer> {
        private final int number;

        FactorialCalculator(int number) {
            this.number = number;
        }

        @Override
        public Integer call() throws Exception {
            Thread.sleep(2000);
            if (number <= 2) {
                return 1;
            }
            int result = 1;
            for (int i = 2; i <= number; i++) {
                result = result * i;
            }
            return result;
        }
    }

    // Corrected class declaration (removed parentheses)
    public static class TestingFactorial {
        public static void main(String[] args) {
            ExecutorService service = Executors.newFixedThreadPool(3);
            try {
                List<Future<Integer>> list = new ArrayList<>();
                for (int i = 1; i <= 10; i++) {
                    FactorialCalculator task = new FactorialCalculator(i);
                    // Corrected: add to list instead of "list(...)"
                    list.add(service.submit(task));
                }
                for (Future<Integer> future : list) {
                    System.out.println("Result is " + future.get());
                }
                service.shutdown();
                if (!service.awaitTermination(10, TimeUnit.SECONDS)) {
                    System.out.println("Time up");
                }
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
