import java.util.Arrays;
import java.util.Scanner;

public class TaskTen {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите количество строк массива: ");
        int a = console.nextInt();
        System.out.print("Введите количество столбцов массива: ");
        int b = console.nextInt();
        int[][] matrix = new int[a][b];
        System.out.println("Введите элементы строк: ");
        for (int j = 0; j < matrix.length; j++) {
            matrix[0][j] = console.nextInt();
            matrix[0][j] *= 3;
        }

        Arrays.stream(matrix).map(Arrays::toString).forEach(System.out::println);
    }
}
