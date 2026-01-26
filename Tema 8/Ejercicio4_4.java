import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduceme una ip");
        String ip = sc.nextLine();

        Pattern pattern = Pattern.compile("^((25[0-5]|2[0-4]\\d|[01]\\d\\d)\\.){3}" + "(25[0-5]|2[0-4]\\d|[01]\\d\\d)$");
        Matcher buscador = pattern.matcher(ip);

        if (buscador.matches()){
            System.out.println("coincidencia");
            System.out.println(buscador.group());
        }else{
            System.out.println("No coincidencia");
        }

    }
}
