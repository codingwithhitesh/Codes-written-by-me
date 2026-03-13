
abstract class Shape{
    abstract  int CalculateArea();
}

// Class add
class Circle extends Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    int CalculateArea() {
        return 3 * radius * radius;
    }
}

class Square extends Shape {
    int side ;
    Square (int side){
        this.side=side;
    }
    @Override

    int CalculateArea(){
        return side*side;
    }
}


class RunCode {
    // Main Function
    public static void main(String args[])
    {
        Circle Cir = new Circle(4);
        Square sq =  new Square(7);

        System.out.println("Area of Circle" +" "+ Cir.CalculateArea());
        System.out.println("Area of square" +" "+ sq.CalculateArea());
    }

}
