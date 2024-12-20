package Menjacnica;

//Definisati hijerarhiju klasa koje predstavljaju razlicite valute u menjacnici.
//Osnovna Klasa: Valuta
//promenljive: naziv , simbol, i kurs.
//Konstruktor: Postavlja vrednosti za naziv, simbol i kurs valute.
//        Metoda: konvertujUdinare(iznos), koja konvertuje zadati iznos u dinare koristeci trenutni kurs valute.
//Dolar:
//Nasledjuje klasu Valuta.
//        Konstruktor: Postavlja vrednosti za naziv "Dolar", simbol "USD", i trenutni kurs prema dinarima.
//Dodatna Metoda: postaviKursNovi(kurs), koja postavlja novi kurs dolara.
//Euro:
//Nasledjuje klasu Valuta.
//        Konstruktor: Postavlja vrednosti za naziv "Euro", simbol "EUR", i trenutni kurs prema dinarima.
//Dodatna Metoda: postaviKursNovi(kurs: number), koja postavlja novi kurs evra.
//Napisati glavni program koji kreira objekte za dolar i evro, postavlja njihove kurseve, i vrsi konverziju odredjenih iznosa iz jedne valute u drugu.
//Dodatni zadatak:
//Implementirati klasu Osoba koja ima ime, prezime, god rodjenja i metodu za predstavljanje, zatim kreirati klasu Student koja nasledjuje klasu Osoba i dodaje svoje specificne atribute, poput liste predmeta, broja indeksa i proseka ocena. Klasa Student dodaje i metodu za dodavanja predmeta, prikaza proseka i overide-uje metodu koja vraca opis, cineci je prilagodjenom za studente. Takodje, dodati metodu koja ispisPredmeta(), koja ispisuje sve predmete koje student slusa.
//Lista predmeta sadrzi elemente tipa Predmet. Klasa Predmet sadrzi ime predmeta, broj ESPB-a i ime profesora i metod koji vraca opis predmeta.
//U main-u kreirati studenta i pozvati metode koje su implementirane

public class Valuta {
    private String naziv;
    private String simbol;
    private double kurs;

    public Valuta(String naziv, String simbol, double kurs) {
        this.naziv = naziv;
        this.simbol = simbol;
        this.kurs = kurs;
    }

    public double konvertujUDinare (double iznos) {
        return iznos * kurs;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getSimbol() {
        return simbol;
    }

    public void setSimbol(String simbol) {
        this.simbol = simbol;
    }

    public double getKurs() {
        return kurs;
    }

    public void setKurs(double kurs) {
        this.kurs = kurs;
    }

    public String toString () {
        return "Naziv valute: " + getNaziv()+ " (" + getSimbol() + ") - Kurs: " + getKurs();
    }
}
