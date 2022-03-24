public class TaskThree {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5};
        int firstElement = array[0];
        array[0] = array[array.length-1];
        array[array.length-1] = firstElement;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        int middleElement = array.length / 2 + 1;
        int sum = array[0] + middleElement;
        System.out.println(sum);
    }
}
