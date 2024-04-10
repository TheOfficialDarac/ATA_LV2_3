public class Osoba {

    //#region Propertires

    String ime, prezime, oib, dob, adresa = "";
    //#endregion

    //#region Constructors

    public Osoba() {
        ime = "";
        prezime = "";
        oib = "";
        dob= "";
        adresa= "";
    }

    public Osoba(String i, String p, String o, String a, String dob) {

        do {
            if(!ProvjeraString(i)) {
                System.out.println("Neispravan unos imena, trenutna vrijednost: " + i);
                System.out.print("Unesite novo ime: ");
                i = System.console().readLine();
            } else break;
        } while(true);

        do {
            if(!ProvjeraString(p)) {
                System.out.println("Neispravan unos prezimena, trenutna vrijednost: " + i);
                System.out.print("Unesite novo prezime: ");
                p = System.console().readLine();
            } else break;
        } while(true);
        this.ime = i;
        this.prezime = p;
        this.oib = o;
        this.adresa = a;
        this.dob = dob;
    }
    //#endregion

    //#region Methods

    public void AzurirajAdresu(String a) {
        if(a != null && !a.isEmpty())
            adresa = a;
        else System.out.println("Pogresan unos adrese!");
    }

    public void ProvjeraOIB() {
        try {
            long l = Long.parseLong(oib);
            if(l < 0) {
                System.out.println("OIB ne smije biti negativan broj!");
                return;
            }
        } catch(NumberFormatException nfe){
            System.out.println("OIB mora sadržavati samo znamenke!");
            return;
        }

        if( oib.length()!=11) {
            System.out.println("OIB mora sadržavati 11 znamenaka!");
            return;
        }
        else {
            System.out.println("OIB je ispravnog formata.");
        }
    }

    public void ProvjeraDatuma() {
        String[] arr = dob.split("[.]");

        try {
            if(Integer.parseInt(arr[0]) > 31) {
                System.out.println("Neispravan unos datuma");
                throw new Exception();
            }

            if(Integer.parseInt(arr[1]) > 12) {
                System.out.println("Neispravan unos mjeseca");
                throw new Exception();
            }

            if(Integer.parseInt(arr[2]) < 1900) {
                System.out.println("Neispravan unos godine");
                throw new Exception();
            }
        }
        catch(Exception e) {
            System.out.println("Neispravan unos datuma rodenja");
        }
    }

    public void Ispis() {
        System.out.println("Ime: " +ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("OIB: " + oib);
    }

    public boolean ProvjeraString(String toTest) {
        if(toTest == null || toTest.trim().isEmpty())
        {
            return false;
        }

        for (char c : toTest.toCharArray()) {
            if (Character.isDigit(c)) {
                return false;
            }
        }

        return true;
    }
    //#endregion
}
