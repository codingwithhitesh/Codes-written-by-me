import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

class CountryMap {

    public static void main(String[] args) {
        Map <String,String> countyMap = new HashMap<>();
        countyMap.put("Bharat","New Delhi");
        countyMap.put("France","Paris");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the county");
        String county = sc.next();

        if (countyMap.containsKey(county)){
            System.out.println("The capital of " +" "+ county +" is " + countyMap.get(county));
        } else {
            System.out.println("The given country is not available in the database");
        }

    }

}
