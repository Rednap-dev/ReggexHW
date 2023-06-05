import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String line = scanner.nextLine();
        Pattern pattern = Pattern.compile("[a-z]{2,6} [^ \\s]+ [^\\d]+");
        System.out.println("-----------------------------");
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}