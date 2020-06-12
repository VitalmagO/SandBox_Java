import java.util.Arrays;

public class PrimitiveTypes {
    public static void main(String[] args) {
        System.out.println(aChar(29));
        System.out.println(lenArray(1,1,1,1,1));
        int[] a = {1,2,3,4,5};
        int[] b = {5,4,3,2,1};
        boolean equalsArr = Arrays.equals(a,b); //Поэлементное сравнение массивов, ссылки можно проверить стандартным ==
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(equalsArr);
        System.out.println("A" + 12);
        System.out.println('A' + "12");
        System.out.println('A' + '1' + "2");
        System.out.println("A" + ('\t' + '\u0003'));

        for (String arg : args) {
            System.out.println(arg);
        }
    }

    static int lenArray(int ... numbers) {  //Объявление динамического массива
        return numbers.length;
    }

    public static char aChar(int value) {
        return (char) ('\\' + value);
    }
}
