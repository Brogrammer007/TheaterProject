package models;

import java.util.ArrayList;
import java.util.List;
public class Biletar extends Korisnik {
    private List<Karta> prodateKarte;

    public Biletar(String username, String password, String ime, String prezime){
        super(username, password, ime, prezime);
        this.prodateKarte = new ArrayList<>();
    }

    //getter i setter
    public List<Karta> getProdateKarte(){
        return prodateKarte;
    }

    public void prodajKartu(Karta karta){
        prodateKarte.add(karta);
    }
}
