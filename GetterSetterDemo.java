class Rectangle {

        private int length;
        private int breath;

        public Rectangle(int length, int breath) {
            this.length = length;
            this.breath = breath;
       }

        public int getLength() {
            return length;
        }

        public int getBreath() {
            return breath;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public void setBreath(int breath) {
            this.breath = breath;
        }

        int calPerimeter() {
            int Perimeter;
            Perimeter = 2 * (length + breath);
            return Perimeter;
        }




    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle(2,3);

        rect1.setLength(15);
        rect1.setBreath(10);

        System.out.println("Perimeter of given Rectangle is   " + rect1.calPerimeter());

        }

    }

    // Here , Both constructor and Setter is used to set the length and breadth. SSince, getter setter
    // is coming later, its value is used in output



