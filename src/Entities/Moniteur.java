/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author khaln
 */
public class Moniteur {
    private int idMoniteur;
    private String nomMoniteur;
    private String prenomMoniteur;
    private int sexe;
    private String dateNaissance;
    private String adresse;
    private String codePostal;
    private String ville;
    private String telephone;
    
    public Moniteur() {}
    
    public Moniteur(int unId, String unNom, String unPrenom, int unSexe, String uneDateNaiss, String uneAdresse, String unCodePostal, String uneVille, String unTelephone){
        idMoniteur = unId;
        nomMoniteur=unNom;
        prenomMoniteur=unPrenom;
        sexe = unSexe;
        dateNaissance= uneDateNaiss;
        adresse = uneAdresse;
        codePostal=unCodePostal;
        ville=uneVille;
        telephone=unTelephone;
    }

    /**
     * @return the idMoniteur
     */
    public int getIdMoniteur() {
        return idMoniteur;
    }

    /**
     * @param idMoniteur the idMoniteur to set
     */
    public void setIdMoniteur(int idMoniteur) {
        this.idMoniteur = idMoniteur;
    }

    /**
     * @return the nomMoniteur
     */
    public String getNomMoniteur() {
        return nomMoniteur;
    }

    /**
     * @param nomMoniteur the nomMoniteur to set
     */
    public void setNomMoniteur(String nomMoniteur) {
        this.nomMoniteur = nomMoniteur;
    }

    /**
     * @return the prenomMoniteur
     */
    public String getPrenomMoniteur() {
        return prenomMoniteur;
    }

    /**
     * @param prenomMoniteur the prenomMoniteur to set
     */
    public void setPrenomMoniteur(String prenomMoniteur) {
        this.prenomMoniteur = prenomMoniteur;
    }

    /**
     * @return the sexe
     */
    public int getSexe() {
        return sexe;
    }

    /**
     * @param sexe the sexe to set
     */
    public void setSexe(int sexe) {
        this.sexe = sexe;
    }

    /**
     * @return the dateNaissance
     */
    public String getDateNaissance() {
        return dateNaissance;
    }

    /**
     * @param dateNaissance the dateNaissance to set
     */
    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    /**
     * @return the adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * @param adresse the adresse to set
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * @return the codePostal
     */
    public String getCodePostal() {
        return codePostal;
    }

    /**
     * @param codePostal the codePostal to set
     */
    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    /**
     * @return the ville
     */
    public String getVille() {
        return ville;
    }

    /**
     * @param ville the ville to set
     */
    public void setVille(String ville) {
        this.ville = ville;
    }

    /**
     * @return the telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * @param telephone the telephone to set
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
