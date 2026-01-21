import java.util.Scanner;
import java.util.regex.Pattern;

public class Ejercicio4_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regexContraseña = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@#%&!?$^*._-]).{8,}$";
        System.out.println("Introduce una contraseña");
        String contraseña = sc.nextLine();
        Pattern pattern = Pattern.compile(regexContraseña);
        if(contraseña.matches(regexContraseña)){
            System.out.println(contraseña + ": Es valida");
        }else {
            System.out.println(contraseña + ": No es valido");
        }
    }
}
