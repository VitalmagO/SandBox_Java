import VitalCorporation.Math;

public class MainClass {
    public static void main(String[] args) {
        Math.Factorial factorial = Math.Factorial.getFactorial(14);
        factorial.displayFactorial();

        Math.Pow pow = Math.Pow.getPow(14, 5);
        pow.displayPow();
    }
}
