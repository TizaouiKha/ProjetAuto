/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author khaln
 */
public class Lecon {

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }
    private int idLecon;
    private String mois;
    private String date;
    private String jour;
    private String heure;
    private String nomMoniteur;
    private String nomEleve;
    private String immatriculation;
    private String libelleCategorie;
    private int reglee;
    
    public Lecon() {}
    
    public Lecon(int unId, String unMois, String unJour, String uneHeure, String unNomMoniteur, String unNomEleve, String uneImmatriculation){
        idLecon= unId;
        mois = unMois;
        jour= unJour;
        heure= uneHeure;
        nomMoniteur=unNomMoniteur;
        nomEleve=unNomEleve;
        immatriculation= uneImmatriculation;
    }
    public Lecon leconTable(int unId,String unMois, String unJour, String uneHeure, String unNomMoniteur, String unNomEleve, String uneImmatriculation, String unLibelleCategorie){
        idLecon= unId;
        mois=unMois;
        jour= unJour;
        heure= uneHeure;
        nomMoniteur=unNomMoniteur;
        nomEleve=unNomEleve;
        immatriculation= uneImmatriculation;
        libelleCategorie= unLibelleCategorie;
        return this;
    }
    public Lecon(int unId, String unMois, String uneDate,String uneHeure, String unNomMoniteur, String uneImmatriculation, String unLibelleCategorie, int unReglee){
        idLecon= unId;
        mois = unMois;
        date = uneDate;
        heure= uneHeure;
        nomMoniteur=unNomMoniteur;
        immatriculation= uneImmatriculation;
        libelleCategorie = unLibelleCategorie;
    }
    public Lecon( String unMois, String uneDate,String uneHeure, String unNomEleve, String uneImmatriculation, String unLibelleCategorie, int unReglee){
        mois = unMois;
        date = uneDate;
        heure= uneHeure;
        nomEleve=unNomEleve;
        immatriculation= uneImmatriculation;
        libelleCategorie = unLibelleCategorie;
    }
    /**
     * @return the idLecon
     */
    public int getIdLecon() {
        return idLecon;
    }

    /**
     * @return the mois
     */
    public String getMois() {
        return mois;
    }

    /**
     * @return the jour
     */
    public String getJour() {
        return jour;
    }

    /**
     * @return the heure
     */
    public String getHeure() {
        return heure;
    }

    /**
     * @return the nomMoniteur
     */
    public String getNomMoniteur() {
        return nomMoniteur;
    }

    /**
     * @return the nomEleve
     */
    public String getNomEleve() {
        return nomEleve;
    }

    /**
     * @return the immatriculation
     */
    public String getImmatriculation() {
        return immatriculation;
    }

    /**
     * @return the reglee
     */
    public int getReglee() {
        return reglee;
    }

    /**
     * @return the libelleCategorie
     */
    public String getLibelleCategorie() {
        return libelleCategorie;
    }
}
