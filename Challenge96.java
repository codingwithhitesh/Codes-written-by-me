public class Challenge96 {
    enum Day{
        FRIDAY (),SATURDAY (),SUNDAY ();

        Day() {
        }

        public static void main(String[] args) {

            System.out.println("Printing all days of the week");
            System.out.println(Day.FRIDAY);
            System.out.println(Day.SATURDAY);
            System.out.println(Day.SUNDAY);


        }
    }
}
