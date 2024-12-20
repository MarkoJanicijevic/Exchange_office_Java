package Menjacnica;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite iznos koji zelite da konvertujete: ");
        double iznos = s.nextDouble();
        Valuta d = new Dolar("Dolar", "USD", 100);
        Valuta e = new Euro("Euro", "EUR", 117);
        System.out.println("Konvertovano u dinare iz dolara: " + d.konvertujUDinare(iznos));
        System.out.println("Konvertovano u dinare iz eura: " + e.konvertujUDinare(iznos));
        System.out.println("Unesite novi kurs za dolar: ");
        double novi_dolar = s.nextDouble();
        System.out.println("Unesite novi kurs za euro: ");
        double novi_euro = s.nextDouble();

        System.out.println(d);
        System.out.println(e);


    }

}
