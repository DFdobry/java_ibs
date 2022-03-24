import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите 2 числа:");
        int firstNumber = console.nextInt();
        int secondNumber = console.nextInt();
        char operation = console.next().charAt(0);
        int answer = 0;
        switch (operation) {
            case '*':
                answer = firstNumber * secondNumber;
                break;
            case '/':
                answer = firstNumber / secondNumber;
                break;
            case '+':
                answer = firstNumber + secondNumber;
                break;
            case '-':
                answer = firstNumber - secondNumber;
        }
        System.out.println(answer);

    }
}

