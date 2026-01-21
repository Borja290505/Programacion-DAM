package Vista;
import Modelo.*;

import java.time.LocalDate;

public class DemoCentroEducativo {
    CentroEducativo centroEducativo = new CentroEducativo("Segundo Chomon");
    LocalDate fechap1 = LocalDate.of(2025,9,13);
    LocalDate fechap2 = LocalDate.of(2025,9,12);
    LocalDate fechapa1 = LocalDate.of(2024,9,12);
    LocalDate fechapa2 = LocalDate.of(2023,9,12);
    Profesor p1 = new Profesor("Borja",10.0,1200.3,fechap1,"123456789r","Ros Perez","Mates",40);
    Profesor p2 = new Profesor("Borjaaaaaaa",10.0,1200.3,fechap2,"123456789r","Ros Perez","Lengua",40);
    PersonalAdministrativo pa1 = new PersonalAdministrativo("Adrian", 40.0, 1400.0, fechapa1,"1234567899p","Santiago Segura","Secretaria",5);
    PersonalAdministrativo pa2 = new PersonalAdministrativo("Adrian", 40.0, 1400.0, fechapa2,"1234567899p","Santiago Segura","Secretaria",5);
}
