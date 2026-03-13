class ThreadPrinter extends Thread{

    public int threadNumber ;

    public ThreadPrinter(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    public void run(){
        System.out.println("Thread has started" +" "+
              "Current running thread is " + Thread.currentThread().getName()+"-"+
                "Original thread no" +" "+ threadNumber);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.println("Thread has started" +" "+
                "Current running thread is " + Thread.currentThread().getName()+"-"+
                "Original thread no" +" "+ threadNumber);


    }


    public static void main(String[] args) throws InterruptedException {
        ThreadPrinter T1 = new ThreadPrinter(1);
        ThreadPrinter T2 = new ThreadPrinter(2);
        ThreadPrinter T3 = new ThreadPrinter(3);
        
        T1.start();
        T1.join();

        T2.start();
        T2.join();
        T3.start();
        T3.join();

        
    } 
}
