public class Program {
    public static void main(String[] args) {
        /**
         * @param bookPrintable т.к. класс Journal релаизует интерфейс Printable, то переменная bookPrintable хранит ссылку на объект типа Journal
         * @param journalPrintable аналогично
         */
        Printable bookPrintable = new Book("Java. Complete Reference.", "H. Shildt");
        bookPrintable.print();

        Printable journalPrintable = new Journal("Foreign policy");
        journalPrintable.print();

        Printable p = new Journal("Foreign policy");
        // Интерфейс не имеет метода getName, необходимо явное приведение
        String name = ((Journal) p).getName();
        System.out.printf("Name: %s\n", name);

        Printable notePrintable = new Note("ToDo");
        notePrintable.print();

        Printable printable = createPrintable("Foreign Affairs", false);
        printable.print();

        read(new Book("Java for impatients", "Cay Horstmann"));
        read(new Journal("Java Dayly News"));

    }

    /**
     * @param p Метод read() в качестве параметра принимает объект интерфейса Printable, поэтому в этот метод мы можем передать объекты Book или Journal
     */
    static void read(Printable p) {
        p.print();
    }

    /**
     * @param name
     * @param option
     * @return Возвращяет объект Printable, поэтому также мы можем возвратить как объект Book, так и Journal
     */
    static Printable createPrintable(String name, boolean option) {
        if(option)
            return new Book(name, "Undefined");
        else
            return new Journal(name);
    }
}

interface Printable {
    default void print() {
        System.out.println("Undefined printable");
    }
}

class Book implements Printable {

    String name;
    String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.printf("%s (%s) \n", name, author);
    }
}

class Journal implements Printable {

    private String name;

    String getName() {
        return name;
    }

    Journal(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}

class Note implements Printable {
    private String name;

    public String getName() {
        return name;
    }

    public Note(String name) {
        this.name = name;
    }
}