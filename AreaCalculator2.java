
abstract class Shape1{
    abstract  int CalculateArea();
}

// Class add
class Circle1 extends Shape1 {
    int radius;

    Circle1(int radius) {
        this.radius = radius;
    }

    @Override
    int CalculateArea() {
        return 3 * radius * radius;
    }
}

class Square1 extends Shape1 {
    int side ;
    Square1 (int side){
        this.side=side;
    }
    @Override

    int CalculateArea(){
        return side*side;
    }
}


class RunCode1 {
    // Main Function
    public static void main(String args[])
    {
        Circle Cir = new Circle(4);
        Square sq =  new Square(7);

        System.out.println("Area of Circle" +" "+ Cir.CalculateArea());
        System.out.println("Area of square" +" "+ sq.CalculateArea());
    }

}
