import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите 3 числа:");
        int[] array = new int[3];
        double sum = 0;
        for (int i = 0; i < 3; i++) {
            array[i] = console.nextInt();
            sum =  sum + array[i];

        }
        double sumMiddle = (sum / 3);
        double result = Math.floor(sumMiddle / 2);
        System.out.println(result);
        if (result > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
