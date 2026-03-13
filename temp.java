class DemoCode1 {

    static class SyncDemo {

    }
    static  void multipleCreator(int n) {

        for (int i = 1; i <= 5; i++) {
                System.out.println(n * i  );

            }
        }

        public static void main(String[] args)  {
        multipleCreator(5);
        multipleCreator(8);
        multipleCreator(10);
    }
    }


