import java.util.Scanner;

public class FinalTaskOne {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите текущий курс:");
        double course = console.nextDouble();
        System.out.println("Введите количество рублей");
        int value = console.nextInt();
        double result = value / course;
        System.out.println("Результат:");
        System.out.printf("%.2f",result);
    }
}
