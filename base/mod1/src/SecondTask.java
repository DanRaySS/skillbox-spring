//2) Создайте двумерный массив, в котором найдите минимальный элемент среди всех элементов массива.
//Важно учесть, что нахождение минимального массива должен производиться при помощи циклов.
//Массив:
//int[][] x = { {20, 34, 2}, {9, 12, 18}, {3, 4, 5} };
public class SecondTask {
    public static void main(String[] args) {
        int[][] x = { {20, 34, 2}, {9, 12, 18}, {3, 4, 5} };

        int minEl = 9999;

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (x[i][j] <  minEl) {
                    minEl = x[i][j];
                }
            }
        }
        System.out.println(minEl);

    }
}
