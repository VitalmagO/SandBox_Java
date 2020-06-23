/**
 * Класс математических вычислений
 * @author Vital
 * @version 1.0
 * @see Math.Factorial Вычисление факториала
 */
class Math {
    public static void main(String[] args) {
        Math.Factorial factorial = Math.Factorial.getFactorial(14);
        factorial.displayFactorial();
    }

    public static class Factorial {
        /**
         * Передаем значение для вычисления факториала
         * TODO Добавить исключение большего значения факториала
         */

        private int result;
        private int key;

        /**
         * Конструктор
         * @param number Результат вычисления факториала
         * @param x Переданное значение для вычисления
         */
        public Factorial (int number, int x) {
            result = number;
            key = x;
        }

        public int getResult() {
            return result;
        }

        public int getKey() {
            return key;
        }

        public void displayFactorial() {
            System.out.printf("Факториал числа %d равен %d \n", getKey(), getResult());
        }

        /**
         * Вычисление факториала
         * @param x полученное значение для вычисления факториала
         * @return Объект статически вложенного класса Factorial(факториал числа, число)
         */
        public static Factorial getFactorial (int x) {
            int result = 1;
            for (int i = 1; i < x; i++) {
                result *= i;
            }
            return new Factorial(result, x);
        }
    }
}