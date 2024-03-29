import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
public class Predstava implements Serializable {
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

    public String getNaziv() {
        return naziv;
    }

    public TipPredstave getTipPredstave() {
        return TipPredstave;
    }

    public String getReziser() {
        return reziser;
    }

    public ArrayList<String> getGlumci() {
        return glumci;
    }

    public int getTrajanje() {
        return trajanje;
    }

    public String getProdukcija() {
        return produkcija;
    }

    public int getGodina() {
        return godina;
    }

    public String getOpis() {
        return opis;
    }


    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setTipPredstave(TipPredstave tipPredstave) {
        TipPredstave = tipPredstave;
    }

    public void setReziser(String reziser) {
        this.reziser = reziser;
    }

    public void setGlumci(ArrayList<String> glumci) {
        this.glumci = glumci;
    }

    public void setTrajanje(int trajanje) {
        this.trajanje = trajanje;
    }

    public void setProdukcija(String produkcija) {
        this.produkcija = produkcija;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }


    public String toString() {
        return "Predstava{" +
                "naziv='" + naziv + '\'' +
                ", tip=" + TipPredstave + '\''+
                ", reziser='" + reziser + '\'' +
                ", glumci=" + glumci +
                ", trajanje=" + trajanje +
                ", produkcija='" + produkcija + '\'' +
                ", godina=" + godina +
                ", opis='" + opis + '\'' +
                '}';
    }

}
