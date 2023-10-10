import java.util.ArrayList;
import java.util.Objects;
public class Predstava {
    private String naziv;
    private TipPredstave TipPredstave;
    private String reziser;
    private ArrayList<String> glumci;
    private int trajanje;
    private String produkcija;
    private int godina;
    private String opis;

    public Predstava(String naziv, TipPredstave tip, String reziser, ArrayList<String> glumci, int trajanje, String produkcija, int godina, String opis){
        this.naziv = naziv;
        this.TipPredstave = tip;
        this.reziser = reziser;
        this.glumci = glumci;
        this.trajanje = trajanje;
        this.produkcija = produkcija;
        this.godina = godina;
        this.opis = opis;
    }



}
