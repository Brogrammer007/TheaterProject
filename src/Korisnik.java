abstract class Korisnik {
    private String username;
    private String password;
    private String ime;
    private String prezime;

    public Korisnik(String username, String password, String ime, String prezime){
        this.username = username;
        this.password = password;
        this.ime = ime;
        this.prezime = prezime;
    }

    //getter i setter
    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }


}
