/**
 * Задача от Facebook Company
 * Заполнение матрицы размерностью N по часовой стрелке (спирали)
 *
 * TODO: добавить реализацию через функцию Хевисайда
 *
 * @author Vital
 * @version 1.0
 */
public class HelloWorld {
    public static void main(String[] Args) {

        /**
         * Пример реализации: передаем значение 5, на выходе получаем матрицу вида:
         * 1	2	3	4	5
         * 16	17	18	19	6
         * 15	24	25	20	7
         * 14	23	22	21	8
         * 13	12	11	10	9
         *
         * @param dimension размерность матрицы
         * @param matrix искомый двумерный массив
         * @param number элемент матрицы
         */

        int dimension = 5;
        int k = dimension;
        int i = 1;
        int m = 1;
        String str = "";
        String str2 = "";
        for (int M = 0; M < 2; M++) {
            if (M == 0) {
                for (int N = 0; N < dimension + 1; N++) {
                    for (int j1 = 0; j1 < k; j1++) {
                        str += i;
                    }
                    k--;
                    switch (m) {
                        case 1:
                            for (int j2 = 0; j2 < k; j2++) {
                                i++;
                                str += i;
                            }
                            m = 2;
                            break;
                        case 2:
                            for (int j2 = 0; j2 < k; j2++) {
                                i--;
                                str += i;
                            }
                            m = 1;
                            break;
                    }
                }
            }
            m = 1;
            if (M == 1) {
                k = dimension;
                i = 0;
                for (int N = 0; N < dimension + 1; N++) {
                    switch (m) {
                        case 1:
                            for (int j2 = 0; j2 < k; j2++) {
                                i++;
                                str2 += i;
                            }
                            m = 2;
                            break;
                        case 2:
                            for (int j2 = 0; j2 < k; j2++) {
                                i--;
                                str2 += i;
                            }
                            m = 1;
                            break;
                    }
                    k--;
                    for (int j1 = 0; j1 < k; j1++) {
                        str2 += i;
                    }
                }
            }
        }
        System.out.println("Строка: " + str);
        System.out.println("Столбец: " + str2);
        int[][] matrix = new int[dimension][dimension];
        int number = 1;
        for (int j = 0; j < dimension*dimension; j ++) {
            int line = Integer.parseInt(String.valueOf(str.charAt(j)));
            int column = Integer.parseInt(String.valueOf(str2.charAt(j)));
            matrix [line - 1][column - 1] = number;
            number++;
        }
        for (int g = 0; g < matrix.length; g++) {
            for (int j = 0; j < matrix[g].length; j++) {
                System.out.print(matrix[g][j] + "\t");
            }
            System.out.println();
        }
    }
}