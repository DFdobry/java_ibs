import java.util.Scanner;

public class FinalTaskThree {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int size = console.nextInt();
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[size];
        System.out.println("Заполните массив числами:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextLine();
        }
        int[] count = new int[size];
        for(int i = 0; i < array.length; i++){
            for(int j = i; j < array[i].length(); j++){
                char temp = ' ';
                for(int z = j; z < array[i].length(); z++){

                    if(array[i].charAt(j)!=array[i].charAt(z) && temp != array[i].charAt(z)){
                        temp = array[i].charAt(z);
                        count[i]++;
                    }

                }
            }
        }
        int max = 0;
        String answer = "";
        for(int i = 0; i < count.length; i++){
            if(max <= count[i]){
                max = count[i];
                answer = array[i];
            }
        }
        System.out.println(answer);

    }
}

