import java.util.ArrayList;
import java.util.List;
public class Menadzer extends Korisnik {
    private List<Predstava> predstave;

    public Menadzer(String username, String password, String ime, String prezime){
        super(username, password, ime, prezime);
        this.predstave = new ArrayList<>();
    }

    //getter i setter
    public List<Predstava> getPredstave(){
        return predstave;
    }

    public void setPredstave(Predstava predstava){
        predstave.add(predstava);
    }
}
