/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author khaln
 */
public class Eleve {
    private int idEleve;
    private String nomEleve;
    private String prenomEleve;
    private int sexe;
    private String dateNaissance;
    private String adresse;
    private String codePostal;
    private String ville;
    private String telephone;
    
    public Eleve() {}
    
    public Eleve(int unId, String unNom, String unPrenom, int unSexe, String uneDateNaiss, String uneAdresse, String unCodePostal, String uneVille, String unTelephone){
        idEleve = unId;
        nomEleve=unNom;
        prenomEleve=unPrenom;
        sexe = unSexe;
        dateNaissance= uneDateNaiss;
        adresse = uneAdresse;
        codePostal=unCodePostal;
        ville=uneVille;
        telephone=unTelephone;
    }

    /**
     * @return the idEleve
     */
    public int getIdEleve() {
        return idEleve;
    }

    /**
     * @param idEleve the idEleve to set
     */
    public void setIdEleve(int idEleve) {
        this.idEleve = idEleve;
    }

    /**
     * @return the nomEleve
     */
    public String getNomEleve() {
        return nomEleve;
    }

    /**
     * @param nomEleve the nomEleve to set
     */
    public void setNomEleve(String nomEleve) {
        this.nomEleve = nomEleve;
    }

    /**
     * @return the prenomEleve
     */
    public String getPrenomEleve() {
        return prenomEleve;
    }

    /**
     * @param prenomEleve the prenomEleve to set
     */
    public void setPrenomEleve(String prenomEleve) {
        this.prenomEleve = prenomEleve;
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
