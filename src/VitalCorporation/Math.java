package VitalCorporation;

/**
 * Класс математических вычислений
 * @author Vital
 * @version 1.0
 * @see Math.Factorial Вычисление факториала
 * @see Pow Возведение числа в степень
 */

public final class Math {

    public static class Factorial {
        /**
         * TODO Добавить исключение большего значения факториала
         */

        private int result;
        private int value;

        /**
         * Конструктор
         * @param number Результат вычисления факториала
         * @param x Переданное значение для вычисления
         */
        public Factorial (int number, int x) {
            result = number;
            value = x;
        }

        public int getResult() {
            return result;
        }

        public int getValue() {
            return value;
        }

        public void displayFactorial() {
            System.out.printf("Факториал числа %d равен %d \n", getValue(), getResult());
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

    public static class Pow {

        private static int result;
        private int pow;
        private int value;

        /**
         *
         * @param powX Результат возведения числа в степень
         * @param power Степень
         * @param x Число
         */
        public Pow(int powX, int power, int x) {
            result = powX;
            pow = power;
            value = x;
        }

        public int getResult() {
            return result;
        }

        public int getPow() {
            return pow;
        }

        public int getValue() {
            return value;
        }

        public void displayPow() {
            System.out.printf("Число %d в степени %d равно %d \n", getValue(), getPow(), getResult());
        }

        /**
         *
         * @param x Число возведенное в степень
         * @param pow Степень числа
         * @return Объект статически вложенного класса Pow(результат возведения числа в степень, степень, число)
         */
        public static Pow getPow(int x, int pow) {
            result = 1;
            if (pow == 0) {
                return new Pow(result, pow, x);
            }
            for (int i = 0; i < pow; i++) {
                result *= x;
            }
            return new Pow(result, pow, x);
        }
    }
}