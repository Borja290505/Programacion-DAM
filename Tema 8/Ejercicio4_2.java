import java.util.Scanner;
import java.util.regex.Pattern;

public class Ejercicio4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regexTelefo = "[0-9]{3,3}-[0-9]{3,3}-[0-9]{4,4}";
        System.out.println("Introduceme un numero de telefono: ");
        String telefono = sc.nextLine();
        Pattern pattern = Pattern.compile(regexTelefo);
        pattern.matcher(regexTelefo).matches();
        if(pattern.matcher(telefono).matches() == true){
            System.out.println(telefono + ": Valido");
        }else {
            System.out.println(telefono + ": No valido");
        }
    }
}
