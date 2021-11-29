//The interfaces are divided so that the normal calculator can implement only addition and subtraction

package NonViolating;

interface Add{
    public int addN(int a,int b);
}

interface Substract{
    public int subtract(int a,int b);
}

interface Log{
    public double log(int a);
}


//Implements all the interfaces
class Scientific implements Add,Substract,Log{

    @Override
    public int addN(int a, int b) {
      return a+b;
    }

    @Override
    public int subtract(int a, int b) {return a-b;}

    @Override
    public double log(int a) {
        return Math.log(a);
    }
}


//Implements only add and subtract interfaces
class Normal implements Add,Substract{
    @Override
    public int addN(int a, int b) {
        return a+b;
    }

    @Override
    public int subtract(int a, int b) {return a-b;}
}


public class ISP {
    public static void main(String[] args) {
        Scientific s = new Scientific();
        s.addN(1,2);
        s.subtract(3,2);
        s.log(10);

        Normal n = new Normal();
        n.addN(1,2);
        n.subtract(2,1);

    }
}