/**
 * Иерархия наследования и преобразование типов
 * @author Vital
 * @version 1.0
 * @see Person человек
 * @see Employee служащий некоторой компании
 * @see Client клиент банка
 */

public class Program {

    public static void main(String[] args) {
        Object tom = new Person("Tom");
        ((Person) tom).display();

        Object sam = new Employee("Sam", "Oracle");
        ((Employee) sam).display();

        Object bob = new Client("Bob", "DeutscheBank", 3000);
        Client cl_bob = (Client) bob;
        cl_bob.display();

        Object kate = new Client("Kate", "DeutscheBank", 2000);
        if (kate instanceof Employee) { //Важная проверка данных, которые к нам пришли и мы не знаем, что за тип объекта. instanceof проверяет, является ли kate объектом типа Employee
            ((Employee)kate).display();
        } else {
            System.out.println("Conversion is invalid");
        }
    }
}

class Person {

    private String name;

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

    public void display() {
        System.out.printf("Person %s \n", name);
    }
}

class Employee extends Person {

    private String company;

    public Employee(String name, String company) {
        super(name);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public void display() {
        System.out.printf("Employee %s works in %s \n", super.getName(), company);
    }
}

class Client extends Person {

    private int sum;
    private String bank;

    public Client(String name, String bank, int sum) {
        super(name);
        this.bank = bank;
        this.sum = sum;
    }

    @Override
    public void display() {
        System.out.printf("Client %s has account in %s \n", super.getName(), bank);
    }

    public int getSum() {
        return sum;
    }

    public String getBank() {
        return bank;
    }
}
