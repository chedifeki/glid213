package tn.iit.simple.auth.app.model;

public class Utilisateur {

    private String nom, prenom, login, mot_de_passe;

    public Utilisateur() {
        this("admin", "admin", "admin", "admin");
    }

    public Utilisateur(String nom, String prenom, String login, String mot_de_passe) {
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.mot_de_passe = mot_de_passe;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPwd() {
        return mot_de_passe;
    }

    public void setMot_de_passe(String mot_de_passe) {
        this.mot_de_passe = mot_de_passe;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", login='" + login + '\'' +
                ", mot_de_passe='" + mot_de_passe + '\'' +
                '}';
    }
}
