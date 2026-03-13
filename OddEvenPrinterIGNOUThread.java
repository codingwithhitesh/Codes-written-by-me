

class OddEvenPrinterIGNOU extends Thread{

    static void OddPrinter(int i) {
        System.out.println("Odd Numbers are  - ");
        for (i = 1; i <= 50; i++) {
            if (i % 2 == 1) {
                System.out.print(i+",");
            }
        }
    }

    static void EvenPrinter(int i) {
        System.out.println("Even numbers are  - ");
        for (i=1;i<=50;i++){
            if( i%2== 0) {
                System.out.print(i +",");
            }
        }

    }
    public void run(){
        OddPrinter(1);
        EvenPrinter(1);
    }

    public static void main(String[] args) {

        OddEvenPrinterIGNOU T1 = new OddEvenPrinterIGNOU();
        OddEvenPrinterIGNOU T2 = new OddEvenPrinterIGNOU();

        T1.start();
        T2.start();

    }


}