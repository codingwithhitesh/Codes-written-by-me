class Challenge97 {
    enum Day {
        FRIDAY(true), SATURDAY(false), SUNDAY(false);

        private final boolean isWeekday;

        Day(boolean isWeekday) {
            this.isWeekday = isWeekday;
        }

        public void getType() {
            if (isWeekday) {
                System.out.println(this.name() +" "+ "Its a Working day. Work hard");
            } else System.out.println(this.name() +" "+  "Enjoy, its weekend");

    }

        public static void main(String[] args) {

            //System.out.println("Printing all days of the week");
            //Day.FRIDAY.getType();

            System.out.println("Printing all days of the week :-");
            for (Day i : Day.values()) {
                i.getType();
            }


        }
    }
}
