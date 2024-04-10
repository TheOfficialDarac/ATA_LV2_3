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
    }
}