//This program follows SRP because the print method is seperated in a different class as it is not
//a responsibility of calculator

package NonViolating;

//For calculation
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

}

//For Printing
class PrintNumbers{
    public void print(int num1, int num2){
        System.out.println(num1+" "+num2);
    }
}

public class SRP {
    public static void main(String[] args){
        Calculator calculator = new Calculator(2,3);
        calculator.add();
        calculator.substract();

        PrintNumbers printNumbers = new PrintNumbers();
        printNumbers.print(3,4);
    }
}