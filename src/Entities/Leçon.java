/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author khaln
 */
public class Leçon {
    private int idLecon;
    private String mois;
    private String jour;
    private String heure;
    private String nomMoniteur;
    private String nomEleve;
    private String immatriculation;
    private int reglee;
    
    public Leçon() {}
    
    public Leçon(int unId, String unMois, String unJour, String uneHeure, String unNomMoniteur, String unNomEleve, String uneImmatriculation){
        idLecon= unId;
        mois = unMois;
        jour= unJour;
        heure= uneHeure;
        nomMoniteur=unNomMoniteur;
        nomEleve=unNomEleve;
        immatriculation= uneImmatriculation;
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
}
