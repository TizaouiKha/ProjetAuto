/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlers;

/**
 *
 * @author khaln
 */
import Entities.Vehicule;
import Tools.ConnexionBDD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author khaln
 */
public class CtrlVehicule{
    private Connection cnx;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public CtrlVehicule(){
        cnx =  ConnexionBDD.getCnx();
    }
    public void AjoutVehicule(String immatriculation, String marque, String modele, int annee, int idCategorie){
        try {
            ps = cnx.prepareStatement("Insert into vehicule VALUES(?,?,?,?,?)");
            ps.setString(1,immatriculation);
            ps.setString(2, marque);
            ps.setString(3, modele);
            ps.setInt(4, annee);
            ps.setInt(5, idCategorie);            
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlVehicule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Vehicule> getAllVehicule(){
        ArrayList<Vehicule> lesVehicules = new ArrayList<>();
        try {
            ps= cnx.prepareStatement("SELECT Immatriculation, Marque ,Modele, Annee, CodeCategorie From vehicule");
            rs = ps.executeQuery();
            while(rs.next()){
                Vehicule vehicule = new Vehicule(rs.getString("Immatriculation"), rs.getString("Marque"), rs.getString("Modele"), rs.getInt("Annee"), rs.getInt("CodeCategorie"));
                lesVehicules.add(vehicule);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CtrlVehicule.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesVehicules;
    }
    public Vehicule getVehiculeByImmatriculation(String immatriculation){
        Vehicule vehicule = null;
        try {
            ps = cnx.prepareStatement("select  Immatriculation, Marque ,Modele, Annee, CodeCategorie From vehicule where Immatriculation =?");
            ps.setString(1, immatriculation);
            rs= ps.executeQuery();
            rs.next();
            vehicule = new Vehicule(rs.getString("immatriculation"), rs.getString("Marque"), rs.getString("Modele"), rs.getInt("Annee"), rs.getInt("CodeCategorie"));
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlVehicule.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vehicule;
        }
    
    public void UpdateVehicule(String ancImmatriculation,String nouvImmatriculation, String marque , String modele, int annee, int idCategorie){
        try {
            ps = cnx.prepareStatement("Update vehicule set Immatriculation = ?, Marque =?, Modele= ?, Annee= ?, CodeCategorie = ? where Immatriculation =?");
            ps.setString(1,nouvImmatriculation);
            ps.setString(2, marque);
            ps.setString(3, modele);
            ps.setInt(4, annee);
            ps.setInt(5, idCategorie);  
            ps.setString(6, ancImmatriculation);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlVehicule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList<Vehicule> getVehiculesByCategorie(int categorie){
        ArrayList<Vehicule>lesVehicules= new ArrayList<>();
        try {
            ps= cnx.prepareStatement("Select * from vehicule where CodeCategorie = ? ");
            ps.setInt(1, categorie);
            rs=ps.executeQuery();
            while(rs.next()){
                Vehicule vehicule = new Vehicule(rs.getString("Immatriculation"), rs.getString("Marque"), rs.getString("Modele"), rs.getInt("Annee"), rs.getInt("CodeCategorie"));
                lesVehicules.add(vehicule);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlVehicule.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesVehicules;
    }
    public String getImmatriculationByModele(String modele){
        String immatriculation = "";
        try {
            ps=cnx.prepareStatement("Select Immatriculation from vehicule where Modele = ?");    
            ps.setString(1, modele);
            rs=ps.executeQuery();
            rs.next();
            immatriculation = rs.getString(1);
        } catch (SQLException ex) {
            Logger.getLogger(CtrlVehicule.class.getName()).log(Level.SEVERE, null, ex);
        }
        return immatriculation;
    }
}