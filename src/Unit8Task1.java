import java.util.Scanner;

public class Unit8Task1 {
    public static void main(String[] args) {

        System.out.println("Ввод строки:");
        Scanner scanner = new Scanner(System.in);
        String stroka = scanner.next();


        System.out.println("Введите начальный символ");
        Scanner scannerBegin=new Scanner(System.in);
        String simbolBegin=scannerBegin.next();

        System.out.println("Введите конечный символ");
        Scanner scannerEnd=new Scanner(System.in);
        String simbolEnd=scannerEnd.next();


        int indexBegin= stroka.indexOf(simbolBegin);
        int indexEnd= stroka.lastIndexOf(simbolEnd);
        System.out.println(indexBegin+" "+indexEnd);

        if (indexBegin==-1||indexEnd==-1||indexBegin>indexEnd){
            System.out.println("Нечего вырезать");
        }
        else {
            String newStroka=stroka.substring(indexBegin,indexEnd);
            System.out.println("Результат: "+newStroka);
        }
    }
}