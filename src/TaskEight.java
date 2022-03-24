import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число");
        int number = console.nextInt();
        int[] array = new int[0];
        int sum = 0;
        int numbers;
        if(number > 0) {
            array = new int[number];
        }
        else {
            System.out.println("Введено отрицательное число");
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            numbers = array[i];
            System.out.println(numbers);
            if (!(numbers % 2 == 0))  {
                sum += numbers;

            }
        }
        System.out.println("Cумма нечетных чисел: " + sum);
    }
}
