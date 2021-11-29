// SINGLE RESPONSIBILITY PRINCIPLE : Every class must have only one responsibilty

// Here we have add and subtract which is calculator's responsibilty
// But printing is not a Calculator's behaviour

package Violating;

class Calculator{
    int num1, num2;
    public Calculator(int num1,int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public int add(){
        return num1+num2;
    }
    public int substract(){
        return num1-num2;
    }

    //    Printing is a different responsiblity
    public void print(){
        System.out.println(num1+" "+num2);
    }
}


public class SRP {
    public static void main(String[] args){
        Calculator calculator = new Calculator(2,3);
        calculator.add();
        calculator.substract();
        calculator.print();
    }
}