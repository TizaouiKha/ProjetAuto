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
}