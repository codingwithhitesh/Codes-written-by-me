import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Comparator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Bear","Zebra","Dog");
        System.out.println(list);
        SortArray(list);
        System.out.println(list);
    }

    public static void SortArray (List <String> stringList){
        Collections.sort(stringList);
        Collections.reverse(stringList);
    }
}
