//In this program, an interface is created which is implemented by the Student and used by the class School
//Hence it follows DIP

package NonViolating;

class School{
    Pupil pupil;

    public School(Pupil pupil) {
        this.pupil = pupil;
    }

    public void display(){
        pupil.display();
    }
}



interface Pupil{
    public void display();
}


class Student implements Pupil{
    int no;
    String name;

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
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
