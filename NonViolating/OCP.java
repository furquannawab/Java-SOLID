// To follow the OCP principle, calculateArea method is stored in interface so that
// it can be implemented by all the shapes according to their calculation.

package NonViolating;

interface Area{
    public double calculateArea();
}

class Square implements Area{
    int side;
    public Square(int side){
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side*side;
    }
}


class Rectangle implements Area{
    int length, breadth;
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return length*breadth;
    }
}


public class OCP {
    public static void main(String[] args){
        Square sq = new Square(5);
        System.out.println(sq.calculateArea());

        Rectangle r = new Rectangle(5,10);
        System.out.println(r.calculateArea());
    }
}
