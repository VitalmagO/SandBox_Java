/**
 * Приватные методы для повторяющихся действий
 */
public class Math {
    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        System.out.println(calculation.sum(1, 2));
        System.out.println(calculation.sum(1, 2, 5));
    }
}

class Calculation implements Calculatable {

}
/*
По умолчанию все методы в интерфейсе фактически имеют модификатор public. Однако начиная с Java 9 мы также можем
определять в интерфейсе методы с модификатором private. Они могут быть статическими и нестатическими, но они не могут
иметь реализации по умолчанию.

Подобные методы могут использоваться только внутри самого интерфейса, в котором они определены. То есть к примеру нам
надо выполнять в интерфейсе некоторые повторяющиеся действия, и в этом случае такие действия можно выделить в приватные методы:
 */
interface Calculatable {
    default int sum(int a, int b) {
        return sumAll(a, b);
    }

    default int sum(int a, int b, int c) {
        return sumAll(a, b, c);
    }

    private int sumAll(int... values) {
        int result = 0;
        for (int n : values) {
            result += n;
        }
        return result;
    }
}
