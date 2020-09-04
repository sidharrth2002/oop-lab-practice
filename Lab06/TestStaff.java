abstract class Staff implements Comparable<Staff>{
    private String name;
    private double salary;

    public Staff() {}
    public Staff(String name, double salary) {
        this.name = name;
        this.salary = salary;
    } 
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }

    public abstract double getPaid();

    public abstract String toString();

    @Override
    // public abstract int compareTo(Staff o);
    public int compareTo(Staff o) {
        if (getPaid() < o.getPaid()) {
            return -1;
        } else if (getPaid() > o.getPaid()) {
            return 1;
        } else {
            return 0;
        }
    } 
}

class Manager extends Staff {
    protected double allowance;

    public Manager() {}
    public Manager(String name, double salary, double allowance) {
        super(name, salary);
        this.allowance = allowance;
    }
    public double getPaid() {
        return getSalary() + allowance;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " Salary: " + getSalary() + " Allowance: " + allowance + " Paid: " + getPaid();
    }

    // @Override
    // public int compareTo(Staff o) {
    //     if (getPaid() < o.getPaid()) {
    //         return -1;
    //     } else if (getPaid() > o.getPaid()) {
    //         return 1;
    //     } else {
    //         return 0;
    //     }
    // }
}

class Technician extends Staff {
    protected double overtimePay;
    public Technician() {}
    public Technician(String name, double salary, double overtimePay) {
        super(name, salary);
        this.overtimePay = overtimePay;
    }

    public double getPaid() {
        return getSalary() + overtimePay;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " Salary: " + getSalary() + " Allowance: " + overtimePay + " Paid " + getPaid();
    }

    // public int compareTo(Staff o) {
    //     if (getPaid() < o.getPaid()) {
    //         return -1;
    //     } else if (getPaid() > o.getPaid()) {
    //         return 1;
    //     } else {
    //         return 0;
    //     }
    // }
}

public class TestStaff {
    public static void main (String[] args) {
        // Staff s = new Staff ("Alex", 1000);
        // Staff t = new Technician ("Ali", 2000, 1200);
        // System.out.println (t);
        // Staff m = new Manager ("Siti", 4000, 1500);
        // System.out.println (m);
        
        Staff[] array = { new Technician ("Ali", 2000, 1200),
        new Manager ("Siti", 4000, 800),
        new Technician ("Zul", 2000, 0),
        new Technician ("Abu", 2500, 1000) };

        // java.util.Arrays.sort(array);

        java.util.Arrays.sort (array);
        for (Staff s: array)
            System.out.println (s);

    }
}