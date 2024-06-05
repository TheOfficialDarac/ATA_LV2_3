import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Osoba o1 = new Osoba();
        System.out.println("Ime: " + o1.ime);
        System.out.println("Prezime: " + o1.prezime);
        System.out.println("OIB: " + o1.oib);

        System.out.println("-----------------");
        o1.ime = "Marko"; // definiramo ime objekta o1
        o1.prezime = "Maric"; // definiramo prezime objekta o1
        o1.oib = "01234567891"; // definiramo OIB objekta o1
        o1.dob="11/11/2011";

        System.out.println("Ime: " + o1.ime);
        System.out.println("Prezime: " + o1.prezime);
        System.out.println("OIB: " + o1.oib);
        System.out.println("OIB: " + o1.dob);

        System.out.println("-----------------\n");
        Osoba o2 = new Osoba("Ivan", "Horvat", "98765432100", "Matije Gupca 11 33000 Virovitica", "11.11.1111");
        o2.Ispis();
        o2.AzurirajAdresu("Ilica 111, 10000 Zagreb");
        o2.AzurirajAdresu("");

        o2.dob = "11.11.1911";

        o2.ProvjeraDatuma();

        System.out.println("Provjera stringa " + o2.ProvjeraString(" 12 "));
        o2.Ispis();

        List<Predmet> predmeti = Arrays.asList(
                new Predmet("Osnove Programiranja", 9),
                new Predmet("Objektno Orijentirano Programiranje", 9),
                new Predmet("Osnove Web Programiranja", 9),
                new Predmet("Skriptni Programski jezici", 9),
                new Predmet("Web Programirajne na strani posluzitelja", 9)
        );

//        Z3
        Student s1 = new Student("Sara", "Babic", "80030130193", "Adresa1", "1977-03-03", "0303977385019",predmeti);
        Student s2 = new Student("Josip", "Kovačević", "42548556539", "Adresa1", "2005-05-01", "0105005302095",predmeti);
        Student s3 = new Student("ime1", "prezime1", "68691469811", "Adresa1", "11/11/2011", "0303977385019",predmeti);
        Student s4 = new Student("ime1", "prezime1", "68691469811", "Adresa1", "11/11/2011", "0303977385019",predmeti);
        Student s5 = new Student("ime1", "prezime1", "68691469811", "Adresa1", "11/11/2011", "0303977385019",predmeti);
    }
}