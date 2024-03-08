package controllers;

import repositories.TheatherFileHandler;
import views.UsersView;
import models.Users;

public class UsersController {
    public static void Login(){
        Users korisnik = UsersView.Login();


    }
}
