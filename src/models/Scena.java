package models;

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
}
