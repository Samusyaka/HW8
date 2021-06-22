import java.util.Scanner;

public class Unit8Task2 {
    public static void main(String[] args) {

        System.out.println("Ввод строки:");
        Scanner scanner = new Scanner(System.in);
        String stroka = scanner.next();
        char a = stroka.charAt(0);
        char b = stroka.charAt(3);
        String newstroka = stroka.replace(b, a);
        System.out.print(newstroka);
    }
}
