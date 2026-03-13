import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

class ShoppingCartDemo {
    public static void main(String[] args) {
        List <String> Foods = new ArrayList<>();
        List <Integer> Price = new ArrayList<>();
        int TotalValue = 0;

        Scanner sc = new Scanner(System.in);


        try {
            while (true) {
                System.out.println("Enter the Food Item you wanna buy");
                String foodItem = sc.nextLine();
                if (foodItem.toLowerCase(Locale.ROOT).equals("q")) {
                    break;
                }

                System.out.println("Enter the Price of the Item");
                int priceItem = sc.nextInt();
                sc.nextLine();


                Foods.add(foodItem);
                Price.add(priceItem);

                TotalValue = TotalValue + priceItem;
            }

            System.out.println("List of Food Items you bought   : " + Foods);
            System.out.println("Respective Prices  :" + Price);

            System.out.println("---- Thanks for purchasing ----");

            System.out.println("Total Cart value to paid - Rs " + TotalValue);


        }catch (RuntimeException e){
            System.out.println(e);
        }



    }
}