/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlers;

/**
 *
 * @author khaln
 */
import Entities.Moniteur;
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
public class CtrlMoniteur {
    private Connection cnx;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public CtrlMoniteur(){
        cnx =  ConnexionBDD.getCnx();
    }
    
    public String getNomMoniteurById(int idMoniteur){
        String nomMoniteur="";
        try {
            ps = cnx.prepareStatement("select nom from moniteur where CodeMoniteur =?");
            ps.setInt(1, idMoniteur);
            rs = ps.executeQuery();
            rs.next();
            nomMoniteur= rs.getString(1);
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlEleve.class.getName()).log(Level.SEVERE, null, ex);
        }
         return nomMoniteur;
       
 }
    public ArrayList<String> getAllNomMoniteur(){
        ArrayList<String>lesNomsMoniteurs= new ArrayList<>();
        try {
            ps = cnx.prepareStatement("select nom from moniteur ");
            rs = ps.executeQuery();
            while(rs.next()){
                lesNomsMoniteurs.add(rs.getString("nom"));
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlEleve.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesNomsMoniteurs;
    }
    
    public int getIdMoniteurByNom(String nomMoniteur){
        int idMoniteur=0;
        try {
            ps = cnx.prepareStatement("select CodeMoniteur from moniteur where nom =?");
            ps.setString(1, nomMoniteur);
            rs = ps.executeQuery();
            rs.next();
            idMoniteur= rs.getInt(1);
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlEleve.class.getName()).log(Level.SEVERE, null, ex);
        }
         return idMoniteur;
    }

    public void AjoutMoniteur(int CodeMoniteur, String Nom, String Prenom, int sexe, String datenaissance, String adresse, String codepostal, String ville, String telephone){
        try {
            ps = cnx.prepareStatement("Insert into moniteur VALUES(?,?,?,?,?,?,?,?,?)");
            ps.setInt(1,CodeMoniteur);
            ps.setString(2, Nom);
            ps.setString(3, Prenom);
            ps.setInt(4, sexe);
            ps.setString(5, datenaissance);
            ps.setString(6, adresse);
            ps.setString(7, codepostal);
            ps.setString(8, ville);
            ps.setString(9, telephone);
            
            
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlMoniteur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
   
