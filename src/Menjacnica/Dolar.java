package Menjacnica;

public class Dolar extends Valuta {
    public Dolar(String naziv, String simbol, double kurs) {
        super("Dolar", "USD", kurs);
    }

    public void postaviNoviKurs (double novi_kurs) {
        setKurs(novi_kurs);
    }
}
