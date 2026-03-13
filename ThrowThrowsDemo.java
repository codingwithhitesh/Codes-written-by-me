class ThrowThrowsDemo {

    public static void AreaCalculatorMethod ( int A,int B){
        int C = A*B;
        System.out.println("Area is  "+ C);

    }

    public static void NegativeCheckerMethod (int A, int B) throws IllegalArgumentException{

       if (A <= 0 || B <= 0){
           throw new IllegalArgumentException("Negative numbers not allowed");
       }else{
           AreaCalculatorMethod(A,B);
       }
    }

    public static void main(String[] args) {
         try {
             NegativeCheckerMethod(10, -8);

         }
         catch (IllegalArgumentException IL){
             System.out.println(IL.getMessage());
         }
    }
}
