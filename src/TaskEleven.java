import java.util.Scanner;

public class TaskEleven {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите числа:");
        int number_one = console.nextInt();
        int number_two = console.nextInt();

        String number_one_to_string;
        String number_two_to_string;
        number_one_to_string = Integer.toString(number_one);
        number_two_to_string = Integer.toString(number_two);

        int number_1 = Integer.parseInt(number_one_to_string);
        int number_2 = Integer.parseInt(number_two_to_string);
        Double num_1 = Double.parseDouble(number_one_to_string);
        Double num_2 = Double.parseDouble(number_two_to_string);
        if (number_1 > number_2) {
            System.out.println("Большее число: " + number_1);
            System.out.println("Меньшее число: " + num_2);
        }
        else  {
            System.out.println("Большее число: " + number_2);
            System.out.println("Меньшее число: " + num_1);

        }
    }
}
