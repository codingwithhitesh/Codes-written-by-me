
class ThreadTest extends Thread

{
    public ThreadTest(String name) {
        super(name);
        System.out.println("name is" +" "+  name);
    }

    public void run()
    {
        try
        {
            // Displaying the thread that is running
            for (int i=0;i<2;i++) {
                System.out.println("Thread " +
                        Thread.currentThread().getName() +
                        " is running" +" "+ i);
            }
            

        }
        catch (Exception e)
        {
            // Throwing an exception
            System.out.println ("Exception is caught");
        }
    }
}

// Main Class
class MainTest
{
    public static void main(String[] args)
    {

            ThreadTest T1 = new ThreadTest("Hitesh");
            ThreadTest T2 = new ThreadTest("Shruti");
            ThreadTest T3 = new ThreadTest("Aatmja");

            // start() is replaced with run() for
            // seeing the purpose of start
            T3.setPriority(1);
            T1.start();
            T2.start();
            T3.start();
            T3.setName("Puchki");
            System.out.println("New name of T3 is  "+ T3.getName() );

        }
    }
