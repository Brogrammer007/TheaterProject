import java.util.ArrayList;
import java.util.List;
public class Scena {
    private int identifikator;
    private String naziv;
    private List<String> tipTonskogZapisa;
    private List<TipPredstave> tipPredstave;
    private List<Sediste> sediste;


    public Scena(int identifikator, String naziv){
        this.identifikator = identifikator;
        this.naziv = naziv;
        this.tipPredstave = new ArrayList<>();
        this.tipTonskogZapisa = new ArrayList<>();
        this.sediste = new ArrayList<>();
    }

    public int getIdentifikator() {
        return identifikator;
    }

    public String getNaziv() {
        return naziv;
    }

    public List<String> getTipTonskogZapisa() {
        return tipTonskogZapisa;
    }

    public List<TipPredstave> getTipPredstave() {
        return tipPredstave;
    }

    public List<Sediste> getSediste() {
        return sediste;
    }

    public void setIdentifikator(int identifikator) {
        this.identifikator = identifikator;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setTipTonskogZapisa(List<String> tipTonskogZapisa) {
        this.tipTonskogZapisa = tipTonskogZapisa;
    }

    public void setTipPredstave(List<TipPredstave> tipPredstave) {
        this.tipPredstave = tipPredstave;
    }

    public void setSediste(List<Sediste> sediste) {
        this.sediste = sediste;
    }
    
}
