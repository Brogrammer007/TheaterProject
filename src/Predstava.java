import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Predstava implements Serializable {
    private static int brojac = 0;
    private int id;
    private String naziv;
    private TipPredstave TipPredstave;
    private String reziser;
    private ArrayList<String> glumci;
    private int trajanje;
    private String produkcija;
    private int godina;
    private String opis;




    public Predstava(int id, String naziv, TipPredstave tip, String reziser, ArrayList<String> glumci, int trajanje, String produkcija, int godina, String opis){
        this.id = generateId();
        this.naziv = naziv;
        this.TipPredstave = tip;
        this.reziser = reziser;
        this.glumci = glumci;
        this.trajanje = trajanje;
        this.produkcija = produkcija;
        this.godina = godina;
        this.opis = opis;
    }

    public static int generateId() {
        return ++brojac;
    }
    public static int getBrojac() {
        return brojac;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv(){
        return naziv;
    }
    public void setNaziv(String naziv){
        this.naziv = naziv;
    }

    public TipPredstave getTipPredstave() {
        return TipPredstave;
    }

    public void setTipPredstave(TipPredstave tipPredstave) {
        TipPredstave = tipPredstave;
    }

    public String getReziser(){
        return reziser;
    }

    public void setReziser(String reziser) {
        this.reziser = reziser;
    }

    public ArrayList<String> getGlumci(){
        return glumci;
    }

    public void setGlumci(ArrayList<String> glumci) {
        this.glumci = glumci;
    }

    public int getTrajanje() {
        return trajanje;
    }
    public void setTrajanje(int trajanje) {
        this.trajanje = trajanje;
    }


    public String getProdukcija() {
        return produkcija;
    }
    public void setProdukcija(String produkcija) {
        this.produkcija = produkcija;
    }

    public int getGodina() {
        return godina;
    }
    public void setGodina(int godina) {
        this.godina = godina;
    }

    public String getOpis() {
        return opis;
    }
    public void setOpis(String opis) {
        this.opis = opis;
    }


    public String toString() {
        return  "Predstava{" +
                "id='" + id + '\'' +
                "naziv='" + naziv + '\'' +
                ", tip=" + TipPredstave + '\''+
                ", reziser='" + reziser + '\'' +
                ", glumci=" + glumci +
                ", trajanje=" + trajanje +
                ", produkcija='" + produkcija + '\'' +
                ", godina=" + godina +
                ", opis='" + opis + '\'' +"\n"  +
                '}';
    }

}



