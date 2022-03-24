import java.util.Scanner;

public class TaskNine {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int sizeArray = console.nextInt();
        double[] array = new double[sizeArray];
        double sum = 0;
        System.out.println("Заполните массив числами:");
        for (int i = 0; i < sizeArray; i++) {
            array[i] = console.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            sum += array[i] / array.length;
        }
        System.out.println("Среднее арифметическое элементов массива: " + sum);
        System.out.println("Выводим перемноженный массив:");

        for (int i = 0; i < array.length; i++) {
            array[i] *= sum;
            System.out.println(array[i]);
        }
    }
}
