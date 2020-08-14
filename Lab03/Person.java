public class Person {
    private String name;
    private Person spouse;
    public Person() {

    }
    public Person(String name) {
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }
    public String toString() {
        if (spouse != null) {
            return "Person's name: " + name + ". Spouse's name: " + spouse.name; 
        } else {
            return "Person's name: " + name + ". No Spouse";
        }
    }
    public static void main(String[] args) {
        Person person1 = new Person("Thomas");
        Person person2 = new Person("Baby");
        System.out.println(person1);
    }
}

