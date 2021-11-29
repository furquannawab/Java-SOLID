//INTERFACE SEGREGATION PRINCIPLE: A single interface should be segregated into different interfaces
//so that the class only implement those interfaces which are required by them

//Here normal calculator cannot implement this interface thereby violating ISP
package Violating;

//All the functions are inside on single interface
interface Calculator2{
    public int addN(int a,int b);
    public int subtract(int a,int b);
    public double log(int a);
}


//Only a scientific calculator can perform log
class Scientific implements Calculator2 {

    @Override
    public int addN(int a, int b) {return a+b;}

    @Override
    public int subtract(int a, int b) {return a-b;}

    @Override
    public double log(int a) {return Math.log(a);}
}


public class ISP {
    public static void main(String[] args) {
        Scientific s = new Scientific();
        s.addN(1,2);
        s.subtract(3,2);
        s.log(10);
    }
}
