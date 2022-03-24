public class TaskFourteen {
    public static void main(String[] args) {
        int[] array;
        array = new int[15];
        int indexOfMax = 0;
        int indexOfMin = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 41)-20);
            System.out.println(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > indexOfMax) {
                indexOfMax = array[i];

            }
            else if (array[i] < indexOfMin) {
                indexOfMin = array[i];
            }
        }
        System.out.println(indexOfMin + " мин");
        System.out.println(indexOfMax + "макс");
        int result = Math.abs(indexOfMin);
        System.out.println(result + " - модуль");
        if (indexOfMax > result) {
            System.out.println(indexOfMax);
        }
        else {
            System.out.println(result);
        }
    }
}
