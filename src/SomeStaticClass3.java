import java.util.Scanner;

public class SomeStaticClass3 {
    static String string;

    static {
        System.out.println("Инициализация статического блока");
        Scanner scanner = new Scanner(System.in);
        string = scanner.nextLine();
    }

    public static void main(String[] args) {
        System.out.println("String = " + string);
    }
}
