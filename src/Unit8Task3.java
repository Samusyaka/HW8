//полиндромы выделяет, выходной файл формирует, но туда пишется ерунда


import java.io.*;

public class Unit8Task3 {
    public static void main(String[] args) {
        String inputFileName = "filein.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String word;
            while ((word = reader.readLine()) != null) {
                String wordReverse = word;
                StringBuffer buffer = new StringBuffer(wordReverse);
                buffer.reverse();
                String data = buffer.toString();

                if (wordReverse.equalsIgnoreCase(data)) {

                    System.out.println(word + " Полиндром");


                    String outputFileName = "fileout.txt";
                    String[] array = { word };

                    try (BufferedWriter writter = new BufferedWriter(new FileWriter(outputFileName))) {
                        for (String value : array) {
                            writter.write(word + "\n");
                        }
                    }

                } else {
                    System.out.println(word + " Не полиндром");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}