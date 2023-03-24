/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author khali
 */
public class User {
    private int idUser;
    private String nomUser;
    private String prenomUser;
    private String statutUser;
    private int codeEleve;
    private int codeMoniteur;
    private String login;
    private String mdp;
    
     public User eleve(int unId, String unNom,String unPrenom,String unLogin, String unMdp,String unStatut, int unCodeEleve)
    {
        idUser =unId;
        nomUser = unNom;
        prenomUser = unPrenom;
        statutUser = unStatut;
        codeEleve = unCodeEleve;
        login = unLogin;
        mdp = unMdp;
        return this;
    }
     public User moniteur(int unId, String unNom,String unPrenom,String unLogin, String unMdp,String unStatut, int unCodeMoniteur)
    {
        idUser =unId;
        nomUser = unNom;
        prenomUser = unPrenom;
        statutUser = unStatut;
        codeMoniteur = unCodeMoniteur;
        login = unLogin;
        mdp = unMdp;
        return this;
    }
     public User admin(int unId, String unNom,String unPrenom,String unLogin, String unMdp,String unStatut)
    {
        idUser =unId;
        nomUser = unNom;
        prenomUser = unPrenom;
        statutUser = unStatut;
        login = unLogin;
        mdp = unMdp;
        return this;
    }
    public int getIdUser() {
        return idUser;
    }

    public String getNomUser() {
        return nomUser;
    }

    public String getStatutUser() {
        return statutUser;
    }

    public String getPrenomUser() {
        return prenomUser;
    }

    /**
     * @return the codeEleve
     */
    public int getCodeEleve() {
        return codeEleve;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the mdp
     */
    public String getMdp() {
        return mdp;
    }

    /**
     * @param mdp the mdp to set
     */
    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    /**
     * @return the codeMoniteur
     */
    public int getCodeMoniteur() {
        return codeMoniteur;
    }

}
