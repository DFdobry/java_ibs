import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число: 1 - масса; 2 - расстояние");
        int operation = console.nextInt();
        switch (operation) {
            case 1:
                System.out.println("Выберите единицу измерения: 1 - киллограмм, 2 - грамм, 3 - тонна");
                int value2 = console.nextInt();
                double kg;
                double gramm;
                double ton;
                System.out.println("Введите число:");
                int count2 = console.nextInt();
                switch (value2) {
                    case 1:
                        kg = count2 * 1;
                        gramm = count2 * 1000;
                        ton = count2 / 1000;
                        System.out.println("киллограммы " + kg);
                        System.out.println("граммы " + gramm);
                        System.out.println("тонна " + ton);
                        break;
                    case 2:
                        kg = count2 / 1000;
                        gramm = count2 * 1;
                        ton = count2 / 1e-6;
                        System.out.println("киллограммы " + kg);
                        System.out.println("граммы " + gramm);
                        System.out.println("тонна " + ton);
                        break;
                    case 3:
                        kg = count2 * 1000;
                        gramm = count2 * 1e+6;
                        ton = count2 * 1;
                        System.out.println("киллограммы " + kg);
                        System.out.println("граммы " + gramm);
                        System.out.println("тонна " + ton);
                        break;
                }
                break;
            case 2:
                 System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
                 int value = console.nextInt();
                 double meters;
                 double miles;
                 double yards;
                 double futs;
                 System.out.println("Введите число:");
                 int count = console.nextInt();
                        switch (value) {
                            case 1:
                                meters = count * 1;
                                miles = count / 1609.34;
                                yards = count * 1.094;
                                futs = count * 3.281;
                                System.out.println("Метры " + meters);
                                System.out.println("Мили " + miles);
                                System.out.println("Ярды " + yards);
                                System.out.println("Футы " + futs);
                                break;
                            case 2:
                                meters = count * 1609;
                                miles = count * 1;
                                yards = count * 1760;
                                futs = count * 5280;
                                System.out.println("Метры " + meters);
                                System.out.println("Мили " + miles);
                                System.out.println("Ярды " + yards);
                                System.out.println("Футы " + futs);
                                break;
                            case 3:
                                meters = count / 1.094;
                                miles = count / 1760;
                                yards = count * 1;
                                futs = count * 3;
                                System.out.println("Метры " + meters);
                                System.out.println("Мили " + miles);
                                System.out.println("Ярды " + yards);
                                System.out.println("Футы " + futs);
                                break;
                            case 4:
                                meters = count / 3.281;
                                miles = count / 5280;
                                yards = count / 3;
                                futs = count * 1;
                                System.out.println("Метры " + meters);
                                System.out.println("Мили " + miles);
                                System.out.println("Ярды " + yards);
                                System.out.println("Футы " + futs);
                        }
                        break;
                }
        }
    }

