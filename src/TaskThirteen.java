import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskThirteen {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        Pattern words = Pattern.compile(("\\b[A-Za-z]+\\b"));
        Matcher m = words.matcher(str);
        while (m.find()) {
            System.out.println(m.group());
        }
        // не разобрался как посчитать количество слов этим способом
    }
}
