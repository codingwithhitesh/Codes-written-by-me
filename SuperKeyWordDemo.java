class RectangleNew {

    int length;
    int breadth;


    public  RectangleNew(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void AreaVolumeCalculator (){
        System.out.println("(Parent) Found 2 parameters, Area of the given shape is  " + length*breadth);
    }
}

    class Cuboid extends RectangleNew {

        int height;
         public Cuboid(int length,int breadth,int height) {
            super(length,breadth);
            this.height = height;

        }

        public void AreaVolumeCalculator() {

            System.out.println("(Child) Found 3 parameters, Volume of the given shape is  "+ length*breadth* height);

        }

}


    class MainMethod{
        public static void main(String[] args) {

            RectangleNew P1 = new Cuboid(10,5,6);
            P1.AreaVolumeCalculator();

            RectangleNew P2 = new RectangleNew(12,8);
            P2.AreaVolumeCalculator();

        }
    }
// this code had method overloading. If we need that a single function in main() accept both 2 and 3 parameter ,
// Overriding is required