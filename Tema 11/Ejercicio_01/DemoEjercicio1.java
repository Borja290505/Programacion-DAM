package Ejercicio_01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DemoEjercicio1 {
    public static void main(String[] args) {

        ArrayList<Registro> lista = new ArrayList<>();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\dam1\\Desktop\\DATA.csv"))) {

            String linea;


            boolean primera = true;

            while ((linea = br.readLine()) != null) {

                if (primera) {
                    primera = false;
                    continue;
                }


                String[] p = linea.split(",");



                int id = Integer.parseInt(p[0]);
                String first_name = p[1];
                String last_name = p[2];
                double latitude = Double.parseDouble(p[3]);
                double longitude = Double.parseDouble(p[4]);
                String domain = p[5];
                String email = p[6];
                String country = p[7];
                String ip = p[8];
                LocalDateTime last_login = LocalDateTime.parse(p[9], formato);

                Registro r = new Registro(country,longitude,latitude,last_name,ip,last_login,id,domain,email,first_name);

                lista.add(r);
            }

        } catch (FileNotFoundException e){
            System.out.println("❌ Error al leer el archivo: " + e.getMessage());
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("---- REGISTROS DE FRANCIA (FR) ----");
        for (Registro r : lista) {
            if (r.getCountry().equalsIgnoreCase("FR")) {
                System.out.println(r);
            }
        }



        System.out.println("---- REGISTROS CON EMAIL DE YAHOO ORDENADOS POR NOMBRE ----");
        lista.stream()
                .filter(r -> r.getEmail().toLowerCase().contains("@yahoo"))
                .sorted((a, b) -> a.getFirst_name().compareToIgnoreCase(b.getFirst_name()))
                .forEach(System.out::println);



        System.out.println("---- REGISTROS CON LOGIN ENTRE 2015-11 Y 2017-01 ----");

        LocalDateTime inicio = LocalDateTime.of(2015, 11, 1, 0, 0);
        LocalDateTime fin = LocalDateTime.of(2017, 1, 31, 23, 59);

        lista.stream()
                .filter(r -> {
                    LocalDateTime f = r.getLast_login();
                    return (f.isEqual(inicio) || f.isAfter(inicio)) &&
                            (f.isEqual(fin) || f.isBefore(fin));
                })
                .sorted((a, b) -> b.getLast_login().compareTo(a.getLast_login())) // DESC
                .forEach(System.out::println);

        System.out.println("");
        System.out.println("");
        System.out.println("---- REGISTROS ORDENADOS POR NOMBRE ----");

        lista.stream()
                .filter(r -> r.getFirst_name() != null
                        && r.getFirst_name().regionMatches(true, 0, "A", 0, 1))
                .filter(r -> r.getLast_login() != null)

                .sorted(Comparator.comparing(Registro::getLast_login).reversed())

                .map(r -> r.getFirst_name() + " " + r.getLast_name() + " " + r.getLast_login())
                .forEach(System.out::println);




    }
}