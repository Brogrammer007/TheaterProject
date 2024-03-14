package models;

public class Users {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getDozvole() {
        return dozvole;
    }

    public void setDozvole(int dozvole) {
        this.dozvole = dozvole;
    }

    private int dozvole = 0;
    public Users(String username, String password, int dozvole){
        this.username = username;
        this.password = password;
        this.dozvole = dozvole;
    }
    public Users(String username, String password){
        this.username = username;
        this.password = password;
        this.dozvole = 1;
    }

}
