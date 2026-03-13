import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class UniqueCharacters {

    public static void main(String[] args) {
        Set<Character> unique = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String userString = sc.next();

        for (int i = 0; i < userString.length(); i++) {
            char ch = userString.charAt(i);
            unique.add(ch);
        }
        System.out.println("Unique charaxters are "+ " "+ unique.size());
    }
}
