package Menjacnica;

public class Euro extends Valuta {
    public Euro(String naziv, String simbol, double kurs) {
        super("Euro", "EUR", kurs);
    }

    public void postaviNoviKurs (double novi_kurs) {
        setKurs(novi_kurs);
    }
}
