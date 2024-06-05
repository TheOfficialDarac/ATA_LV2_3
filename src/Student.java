import java.util.List;

public class Student extends Osoba {

    public String jmbag;
    public List<Predmet> listaPredmeta;
    public Student() {
    }

    public Student(String i, String p, String o, String a, String dob, String jmbag, List<Predmet> listaPredmeta) {
        super(i, p, o, a, dob);
        this.jmbag = jmbag;
        this.listaPredmeta = listaPredmeta;
    }
}
