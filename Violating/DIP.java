//DEPENDENCY INVERSION PRINCIPLE: High level modules should not depend upon low level modules, instead
//they should depend on the abstraction

//Here School class is dependent on Student class which violates DIP
package Violating;

class School{
    Student student;

    public School(Student student) {
        this.student = student;
    }

    public void display(){
        student.display();
    }
}


class Student{
    int no;
    String name;

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public void display(){
        System.out.println(no+" : "+name);
    }
}


public class DIP {
    public static void main(String[] args) {
        Student s = new Student(1,"Steve");
        Student s1 = new Student(2,"Tony");

        School sc = new School(s);
        sc.display();
        School sc1 = new School(s1);
        sc1.display();
    }
}
