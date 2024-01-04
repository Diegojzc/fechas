package fechasTokio;

import jdk.swing.interop.SwingInterOpUtils;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


       //TODO localDate


        LocalDate hoy = LocalDate.now();
        LocalDate pasado = LocalDate.of(2010,05,12);
        LocalDate date = LocalDate.of(2023,1,19);
        LocalDate manana = LocalDate.parse("20,02,2023",DateTimeFormatter.ofPattern("dd,MM,yyyy"));
        System.out.println(manana);
        System.out.println(manana.format(DateTimeFormatter.ofPattern("yyyy/MM/dd")));


        DayOfWeek days = DayOfWeek.FRIDAY;
        System.out.println(days.getDisplayName(TextStyle.SHORT_STANDALONE,new Locale("Es", "es")));

        Period periodo = Period.of(1,5,0);
        Period periodo2 = Period.of(2,5,0);

        System.out.println(periodo.getMonths());





        System.out.print("Introducir fecha:");

        try {
            String tec = teclado.nextLine();
            LocalDate  ayer = LocalDate.parse(tec, DateTimeFormatter.ofPattern("dd/MM/u"));
            System.out.println(ayer);
        } catch (Exception e){
            System.out.println("formato incorrecto, introduzca fecha nuevamente");
        }







    }

}
