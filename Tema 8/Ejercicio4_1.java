import java.util.Scanner;
import java.util.regex.Pattern;

public class Ejercicio4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String regexEmail = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        System.out.println("Introduceme un correo electronico: ");
        String correo = sc.nextLine();
        Pattern pattern = Pattern.compile(regexEmail);
        pattern.matcher(correo).matches();
        if(pattern.matcher(correo).matches() == true){
            System.out.println(correo + ": Valido");
        }else {
            System.out.println(correo + ": No valido");
        }

    }
}
