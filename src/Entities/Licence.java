/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.util.Date;

/**
 *
 * @author khaln
 */
public class Licence {
    private int idLicence;
    private int codeMoniteur;
    private int codeCategorie;
    private Date dateObtention;

    public Licence(int idLicence, int codeMoniteur, int codeCategorie, Date dateObtention) {
        this.idLicence = idLicence;
        this.codeMoniteur = codeMoniteur;
        this.codeCategorie = codeCategorie;
        this.dateObtention = dateObtention;
    }

    /**
     * @return the idLicence
     */
    public int getIdLicence() {
        return idLicence;
    }

    /**
     * @return the codeMoniteur
     */
    public int getCodeMoniteur() {
        return codeMoniteur;
    }

    /**
     * @return the codeCategorie
     */
    public int getCodeCategorie() {
        return codeCategorie;
    }

    /**
     * @return the dateObtention
     */
    public Date getDateObtention() {
        return dateObtention;
    }
    
}

