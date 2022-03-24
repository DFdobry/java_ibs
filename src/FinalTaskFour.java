import java.util.Scanner;

public class FinalTaskFour {
    public static void main(String[] args) {
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        System.out.println("Ответ:");
        Scanner console = new Scanner(System.in);
        String answer = console.nextLine();
        String trueAnswer = "Заархивированный вирус";
        String help = "Подсказка";
        String answer2;
        String answer3;
        String answer4;
        String answer5;
        String answer6;

        if (answer.equals(trueAnswer)) {
            System.out.println("Правильно!");
        }
        else if (answer.equals(help)) {
            System.out.println("архив");
            answer2 = console.nextLine();
            if (answer2.equals(trueAnswer)) {
                System.out.println("Правильно!");
            }
            else  {
                System.out.println("Обидно, приходи в другой раз");
            }
        }
        else if (!answer.equals(trueAnswer)) {
            System.out.println("Подумай еще!");
            answer3 = console.nextLine();
            if (answer3.equals(trueAnswer)) {
                System.out.println("Правильно!");
            }
            else if (answer3.equals(help)) {
                System.out.println("Подсказка уже недоступна");
                System.out.println("Подумай еще!");
                answer4 = console.nextLine();
                if (answer4.equals(trueAnswer)) {
                    System.out.println("Правильно!");
                }
                else if (!answer4.equals(trueAnswer)){
                    System.out.println("Подумай еще!");
                    answer6 = console.nextLine();
                    if (answer6.equals(trueAnswer)) {
                        System.out.println("Правильно!");
                    }
                    else {
                        System.out.println("Обидно, приходи в другой раз");
                    }
                }
                else {
                    System.out.println("Обидно, приходи в другой раз");
                }
            }
            else if (!answer.equals(trueAnswer)) {
                System.out.println("Подумай еще!");
                answer5 = console.nextLine();
                if (answer5.equals(trueAnswer)) {
                    System.out.println("Правильно!");
                }
                else if (answer5.equals(help)) {
                    System.out.println("Подсказка уже недоступна");
                    System.out.println("Подумай еще!");
                    answer6 = console.nextLine();
                    if (answer6.equals(trueAnswer)) {
                        System.out.println("Правильно!");
                    }
                    else {
                        System.out.println("Обидно, приходи в другой раз");
                    }
                }
                else {
                    System.out.println("Обидно, приходи в другой раз");
                }
            }
        }
    }
}
