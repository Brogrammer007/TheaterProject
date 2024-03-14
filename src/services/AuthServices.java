package services;

import repositories.UserRepository;

import models.Users;
public class AuthServices {
    private UserRepository userRepository;

    public AuthServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void checkLogin(Users korisnik) {
        int d = userRepository.checkLoginFromJson(korisnik);
        if (d < 1) {
            System.out.println("Netacno korisnicko ime ili lozinka");
            korisnik = null;
        } else {
            korisnik.setDozvole(d);
        }
    }

    public void checkSignup(Users korisnik) {
        int d = userRepository.checkLoginFromJson(korisnik);
        if (d > -1) {
            System.out.println("Vec postoji korisnik sa tim username-om.");
            korisnik = null;
        } else {
            korisnik.setDozvole(1);
            userRepository.writeKorisnikToJson(korisnik);
            System.out.println("Uspesno registrovan korisnik");
        }
    }
}
