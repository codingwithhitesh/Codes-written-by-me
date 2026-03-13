import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Challenge91 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,2,3,3,4,5,6,7);
        System.out.println(Collections.frequency(list,2));
        System.out.println(Collections.frequency(list,3));

        }
    }


