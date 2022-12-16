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
    
     public User(int unId, String unNom,String unPrenom,String unStatut)
    {
        idUser =unId;
        nomUser = unNom;
        prenomUser = unPrenom;
        statutUser = unStatut;
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

}
