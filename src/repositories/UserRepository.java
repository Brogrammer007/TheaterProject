package repositories;

import models.Users;

public class UserRepository {
    private TheatherFileHandler baza;
    String path = "";

    public UserRepository(String path) {
        this.path = path;
    }

    public int checkLoginFromJson(Users korisnik) {
        return baza.checkLoginFromJson(korisnik);
    }

    public void writeKorisnikToJson(Users korisnik) {
        baza.writeKorisnikToJson(korisnik);
    }

}
