class ThreadState extends Thread {

    public void run(){
        try {
            Thread.sleep(5000);
            System.out.println("Phase 02"+" "+"From inside the Thread %s" +
                    getState());
        }catch (InterruptedException e){
            throw new RuntimeException();
        }


    } 

}

class Main{
    public static void main(String[] args) throws InterruptedException {
        ThreadState T1 = new ThreadState();
        System.out.println("Phase 1"+ " "+"Created the Thread " + T1.getState());
        T1.start();
        T1.join();
        System.out.println("Phase 3" +" "+"Thread finished "+ T1.getState());


    }
}
