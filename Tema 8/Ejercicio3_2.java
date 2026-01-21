import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio3_2 {
    public static void main(String[] args) {
        String texto = "IES SEGUNDO DE CHOMÓN\n" +
                "C/ Pablo Monguió, 48\n" +
                "44002 Teruel\n" +
                "Teléfono: 978 60 13 21\n" +
                "Fax: 978 60 00 80\n" +
                "Email: iesschteruel@educa.aragon.es\n" +
                "Web: www.iesch.org";
        System.out.println(texto);
        Pattern emailPatter = Pattern.compile("[a-zA-Z0-9.%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
        Pattern cpPatter = Pattern.compile("\\b\\d{5}\\b");
        Pattern tlfPatter = Pattern.compile("[0-9]{3}[0-9]{2}[0-9]{2}[0-9]{2}");
        Pattern webPatter = Pattern.compile("www\\.[a-zA-Z0-9.-]+\\.[a-z]{2,}");


        System.out.println("");
        mostrarCoincidencias("Correo Electronico",emailPatter,texto);
        mostrarCoincidencias("Codigo Postal",cpPatter,texto);
        mostrarCoincidencias("Telefono",tlfPatter,texto);
        mostrarCoincidencias("WEB", webPatter,texto);
    }

    public static void mostrarCoincidencias(String titulo, Pattern pattern, String texto){
        Matcher matcher = pattern.matcher(texto);
        System.out.println(titulo + ": ");
        while (matcher.find()){
            System.out.println(" " + matcher.group());
        }
    }
}
