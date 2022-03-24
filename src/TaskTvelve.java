public class TaskTvelve {
    public static void main(String[] args) {
        String str = "I like Java!!!";
        String substr_1 = "Java";
        String substr_2 = "I like";
        String substr_3 = "!!!";
        boolean str1 = str.contains(substr_1);
        boolean str2 = str.contains(substr_2);
        boolean str3 = str.contains(substr_3);
        if (str1 && str2 && str3) {
            System.out.println(str.toUpperCase());
        }
        else {
            System.out.println("Условия не верны");
        }
        String string = str.substring(6, 11);
        String newString =  string.replace('a', 'o');
        System.out.println(newString);
    }
}
