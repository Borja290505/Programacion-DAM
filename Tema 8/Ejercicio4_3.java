import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduceme una frase");
        String frase = sc.nextLine();
        Pattern pattern = Pattern.compile("\\b[A-Z][A-Za-z]*\\b");
        Matcher matcher = pattern.matcher(frase);
        List<String> palabras = new ArrayList<>();
        while(matcher.find()){
            palabras.add(matcher.group());
        }
        System.out.println("Palabras que empizan por mayuscula: " + palabras);

    }
}
