class Person {
    protected String name;
    public String toString() {
        return "Person class" + "Name: " + name; 
    }
}

class Student extends Person {
    protected int stuID;

    public Student() {}
    public Student(String name, int stuID) {
        super(name);
        this.stuID = stuID;
    } 
    @Override
    public String toString() {
        return "Student: " + "Name: " + name + " Student ID: " + stuID; 
    }
}

class Staff extends Person {
    protected double salary;
    @Override
    public String toString() {
        return "Staff: " + "Name: " + name + " Salary: " + salary;
    }
}

class Lecturer extends Staff {
    protected String subject;
    @Override
    public String toString() {
        return "Lecturer: " + "Name: " + name + " Subject Taught: " + subject; 
    }
}

public class TestPerson {
    public static void m(Person x) {
        System.out.println(x.toString());
    }
    public static void main(String[] args) {
        Person person = new Person();
        Student student = new Student();
        Staff staff = new Staff();
        Lecturer lecturer = new Lecturer();
        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(staff.toString());
        System.out.println(lecturer.toString());

        // Person person2 = new Person();
        // Person student2 = new Student();
        // Person staff2 = new Staff();
        // Person lecturer2 = new Lecturer();
        // m(person2);
        // m(student2);
        // m(staff2);
        // m(lecturer2);

        System.out.println("With upcasting (polymorphism)");
        Person people[] = {new Person(),
                            new Student(),
                            new Staff(),
                            new Lecturer()};
        for (Person person: people) {
            System.out.println(person);
        }
    }
    
}