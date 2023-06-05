import java.lang.reflect.Proxy;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String line = scanner.nextLine();
        Pattern pattern = Pattern.compile("[a-z]{2,6} [^ \\s]+ [^\\d]+");
        System.out.println("-----------------------------");
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }*/
        /*String[] str = new String[4];
        try {
            System.out.println(str[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("sgsfbsfF");
            e.printStackTrace();
        } finally {
            System.out.println();
        }*/
        Person tom = new Person(19);
        Person dan = new Person(16);
        try {
            if (tom.getAge()<18){
                throw new MyFirstException("gdsg",tom.getAge());
            }else if (dan.getAge()<18){
                throw new MyFirstException("dgdsga",dan.getAge());
            }
        }catch (MyFirstException e){
            e.printStackTrace();
        }
    }
}
