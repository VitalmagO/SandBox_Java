public class Program{

    public static void main(String[] args) {

        Person tom = new Person("Tom");
        Person bob = new Person("Bob");
        Person tom2 = new Person("Tom");
        System.out.println(tom.toString()); //Person@7960847b
        System.out.println(tom.hashCode()); //664223387
        System.out.println(tom.getClass()); //class Person

        System.out.println(tom.equals(bob));
        System.out.println(tom.equals(tom2));
    }
}
class Person {

    private String name;

    public Person(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Person " + name;
    }

    @Override
    public int hashCode() {
        return name.hashCode() % 1000;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) return false;

        Person p = (Person) obj;
        return this.name.equals(p.name);
    }
}