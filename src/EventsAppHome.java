public class EventsAppHome {
    public static void main(String[] args) {
        /**
         * Вместо создания отдельных классов, реализующих интерфейс EventHandler, обработчики задаются в виде анонимных
         * объектов, которые реализуют интерфейс EventHandler.
         */
        Button tvButton = new Button(new EventHandler() {
            private boolean on = false;
            @Override
            public void execute() {
                if (on) {
                    System.out.println("TV off!");
                    on = false;
                } else {
                    System.out.println("TV on..");
                    on = true;
                }
            }
        });
        Button printButton = new Button(new EventHandler() {
            @Override
            public void execute() {
                System.out.println("Printing...");
            }
        });

        tvButton.click();
        printButton.click();
        tvButton.click();
    }
}
