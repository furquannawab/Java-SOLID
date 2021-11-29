//OPEN-CLOSED PRINCIPLE
//It means a class should be open for extension and closed for modification

//Here we have a single class AreaCalculator which claculates area of all shapes, we need to modify
//the class to add other shapes. Hence, it violates OCP.

package Violating;

class AreaCalculator{
    public double areaSquare(Square s){
        return s.side*s.side;
    }

    public double areaRectangle(Rectangle r){
        return r.length*r.breadth;
    }
}


class Square{
    int side;
    public Square(int side){
        this.side = side;
    }
}


class Rectangle{
    int length,breadth;
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}


public class OCP {
    public static void main(String[] args){
        Square sq = new Square(5);
        Rectangle r = new Rectangle(5,10);

        AreaCalculator area = new AreaCalculator();
        System.out.println(area.areaRectangle(r));
        System.out.println(area.areaSquare(sq));
    }
}
