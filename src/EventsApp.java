/**
 * Интерфейсы в механизме обратного вызова + анонимная реализация
 */
public class EventsApp {
    public static void main(String[] args) {
        Button button = new Button(new ButtonClickHandler());
        button.click();
        button = new Button(new ButtonClickCopy());
        button.click();
        button = new Button(new ButtonClickDelete());
        button.click();
    }
}

class ButtonClickHandler implements EventHandler {
    @Override
    public void execute() {
        System.out.println("Button click!");
    }
}

class ButtonClickCopy implements EventHandler {
    @Override
    public void execute() {
        System.out.println("Button copy!");
    }
}

class ButtonClickDelete implements EventHandler {
    @Override
    public void execute() {
        System.out.println("Button delete!");
    }
}

interface EventHandler {
    void execute();
}

/**
 * Класс Button в конструкторе принимает объект интерфейса EventHandler и в методе click вызывает метод execute этого объекта
 */
class Button {

    EventHandler handler;

    public Button(EventHandler handler) {
        this.handler = handler;
    }

    public void click() {
        handler.execute();
    }
}