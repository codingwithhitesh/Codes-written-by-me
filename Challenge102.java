class TrafficLightThread extends Thread {


        public String color;

        public TrafficLightThread(String color) {
            this.color = color;
        }

        public void run() {
            System.out.println("Current Light is -" + " " + color + "= Light sequence" +
                    Thread.currentThread().getName() + "-" +
                    "Time - 10 sec");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }


        public static void main(String[] args) throws InterruptedException {
            TrafficLightThread T1 = new TrafficLightThread("Red");
            TrafficLightThread T2 = new TrafficLightThread("Yellow");
            TrafficLightThread T3 = new TrafficLightThread("Green");

            T1.start();
            T1.join();

            T2.start();
            T2.join();
            T3.start();
            T3.join();


        }
    }



