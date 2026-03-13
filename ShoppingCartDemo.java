import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

class ShoppingCart {
    public static void main(String[] args) {
        List<String> foods = new ArrayList<>();
        List<Integer> prices = new ArrayList<>();

        int total = 0;


        while (true) {
            System.out.print("Enter the Item you wanna buy   :  ");
            Scanner sc = new Scanner(System.in);

            String food = sc.nextLine();

            if (food.toLowerCase().equals("q")) {
                break;
            }

            System.out.print("Enter the Item price  :  ");
            Scanner sc1 = new Scanner(System.in);
            int price = sc1.nextInt();
            sc.nextLine();

            foods.add(food);

            prices.add(price);

            total = total + price;
            sc1.close();
            sc.close();
        }

        // Print foods
        for (String food : foods) {
            System.out.println(food);
        }

        // Print prices (not adding again, otherwise double-counting)
        for (Integer price : prices) {
            System.out.println(price);
        }

        System.out.println("---- Total Cart Value ----");
        System.out.println(total);


    }
}
