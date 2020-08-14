    class Person {
        private String name ="fdsd";
        @Override
        public String toString() {
            return "Person: " + " Name: " + name; 
        }
        public String getName() {
            return name;
        }
    }
    
    class Student extends Person {
        private String stuID="123342";
        @Override
        public String toString() {
            return "Student: " + "Name: " + getName() + " Student ID: " + stuID; 
        }
        // public String getstuID() {
        //     return stuID;
        // }
    }
    
    class Staff extends Person {
        private double salary=38274.324;
        @Override
        public String toString() {
            return "Staff: " + "Name: " + getName() + " Salary: " + salary;
        }
        // public double getSalary() {
        //     return salary;
        // }
    }
    
    class Lecturer extends Staff {
        private String subject="subject1";
        @Override
        public String toString() {
            return "Lecturer: " + "Name: " + getName() + " Subject: " + subject; 
        }
        // public String getSubject() {
        //     return subject;
        // } 
    }
    
    public class TestProgram {
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
    
            Person person2 = new Person();
            Person student2 = new Student();
            Person staff2 = new Staff();
            Person lecturer2 = new Lecturer();
            m(person2);
            m(student2);
            m(staff2);
            m(lecturer2);
        }
        
    }
