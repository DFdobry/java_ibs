import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер массива и данные с клавиатуры:");
        int x = 5;
        int y = 7;
        int z = 15;
        int sizeArray = console.nextInt();
        int[] array = new int[sizeArray];

        for (int i = 0; i < sizeArray; i++) {
            array[i] = console.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            if (array[i] == x) {
                System.out.println("Данное значение имеется в константах");
            }
            else if (array[i] == y) {
                System.out.println("Данное значение имеется в константах");
            }
            else if (array[i] == z) {
                System.out.println("Данное значение имеется в константах");
            }
        }
    }
}

