import java.util.Scanner;

public class FinalTaskTwo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите уравнение");
        String elements = console.nextLine();
        char[] elementsToArray = elements.toCharArray();
        char str = '+';
        char str1 = '-';
        char x = 'x';
        int result = 0;
        for (int i = 0; i < elementsToArray.length; i++) {
            int a = Character.getNumericValue(elementsToArray[0]);
            int b = Character.getNumericValue(elementsToArray[2]);
            int c = Character.getNumericValue(elementsToArray[4]);
            System.out.println(elementsToArray[i]);
            if(elementsToArray[0] == x) {

                if (elementsToArray[1] == str) {
                    result = c - b;
                }
                else if(elementsToArray[1] == str1) {
                    result = c - (-b);
                }
            }
            else  if (elementsToArray[2] == x) {

                if (elementsToArray[1] == str) {
                    result = c - a;
                }
                else if(elementsToArray[1] == str1) {
                    result = -c - (-a);
                }
            }
            else if (elementsToArray[4] == x) {

                if (elementsToArray[1] == str) {
                    result = a+b;
                }
                else if (elementsToArray[1] == str1) {
                    result = a-b;
                }
            }
        }
        System.out.println("неизвестное значение " + result);

    }

}


