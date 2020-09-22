public class ComparableGeneric {

    public static void main(String[] args) {
        System.out.println(max(new Person(), new Manager()));
        System.out.println(max(44, 23));
    }

    public static <E extends Person> E max(E o1, E o2) {   
        System.out.println("does it work");
        return o1;
    }
}

class Person {
    String name="thomas";
}

class Staff extends Person {
    int salary = 2000;
}

class Manager extends Person {
    String position = "boss";
}


    
  