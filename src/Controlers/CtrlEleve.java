/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlers;

import Entities.Eleve;
import Tools.ConnexionBDD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author khaln
 */
public class CtrlEleve {
    private Connection cnx;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public CtrlEleve(){
        cnx =  ConnexionBDD.getCnx();
    }
    
    public String getNomEleveById(int idEleve){
        String nomEleve="";
        try {
            ps = cnx.prepareStatement("select nom from eleve where CodeEleve =?");
            ps.setInt(1, idEleve);
            rs = ps.executeQuery();
            rs.next();
            nomEleve= rs.getString(1);
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlEleve.class.getName()).log(Level.SEVERE, null, ex);
        }
         return nomEleve;
       
    }
    public int getIdEleveByNom(String nomEleve){
        int idEleve=0;
        try {
            ps = cnx.prepareStatement("select CodeEleve from eleve where nom =?");
            ps.setString(1, nomEleve);
            rs = ps.executeQuery();
            rs.next();
            idEleve= rs.getInt(1);
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlEleve.class.getName()).log(Level.SEVERE, null, ex);
        }
         return idEleve;
    }
    public Eleve getEleveById(int idEleve){
        Eleve eleve = null;
        try {
            ps = cnx.prepareStatement("select CodeEleve, Nom, Prenom, Sexe, DateDeNaissance, Adresse1, CodePostal, Ville, Telephone from eleve where CodeEleve =?");
            ps.setInt(1, idEleve);
            rs = ps.executeQuery();
            rs.next();
            eleve = new Eleve(rs.getInt("CodeEleve"), rs.getString("Nom"), rs.getString("Prenom"), rs.getInt("Sexe"), rs.getString("DateDeNaissance"), rs.getString("Adresse1"), rs.getString("CodePostal"), rs.getString("Ville"), rs.getString("Telephone"));
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlEleve.class.getName()).log(Level.SEVERE, null, ex);
        }
        return eleve;
    }
    
    public void updateEleve(String nom, String prenom, int sexe, Date dateDeNaissance, String adresse1, String codePostal, String ville, String telephone, int CodeEleve){
        try {
            ps = cnx.prepareStatement("Update eleve set Nom =?, Prenom = ?, Sexe = ?, DateDeNaissance = ?, Adresse1 = ?, CodePostal = ?, Ville = ?, Telephone = ? where CodeEleve=?");
            ps.setString(1, nom);
            ps.setString(2, prenom);
            ps.setInt(3, sexe);
            ps.setDate(4, new java.sql.Date(dateDeNaissance.getTime()));
            ps.setString(5, adresse1);
            ps.setString(6, codePostal);
            ps.setString(7, ville);
            ps.setString(8, telephone);
            ps.setInt(9, CodeEleve);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlEleve.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList<String> getAllNomEleve(){
        ArrayList<String>lesNomsEleve = new ArrayList<>();
        try {
            ps = cnx.prepareStatement("select Nom  from eleve order by Nom ");
            rs = ps.executeQuery();
            while(rs.next()){
                lesNomsEleve.add(rs.getString(1));
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlEleve.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesNomsEleve;
    }
    public ArrayList<String> getAllNomEleveByIdMoniteur(int idMoniteur){
        ArrayList<String>lesNomsEleve = new ArrayList<>();
        try {
            ps = cnx.prepareStatement("select DISTINCT(Nom)  from eleve join lecon on eleve.CodeELeve = lecon.CodeEleve where lecon.CodeMoniteur = ? order by Nom; ");
            ps.setInt(1, idMoniteur);
            rs = ps.executeQuery();
            while(rs.next()){
                lesNomsEleve.add(rs.getString(1));
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlEleve.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesNomsEleve;
    }
}
