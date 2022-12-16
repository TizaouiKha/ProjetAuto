/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlers;

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
public class CtrlCategorie {
    private Connection cnx;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public CtrlCategorie(){
        cnx =  ConnexionBDD.getCnx();
    }
    
    public int getIdCategorieByLibelle(String libelle){
        int idCategorie=0;
        try {
            ps = cnx.prepareStatement("select CodeCategorie from categorie where Libelle =?");
            ps.setString(1, libelle);
            rs = ps.executeQuery();
            rs.next();
            idCategorie= rs.getInt(1);
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlEleve.class.getName()).log(Level.SEVERE, null, ex);
        }
         return idCategorie;
       
    }
    public ArrayList<String> getAllLibelleCategorie(){
        ArrayList<String> lesCategories = new ArrayList<>();
        try {
            ps = cnx.prepareStatement("select libelle from categorie ");
            rs = ps.executeQuery();
            while(rs.next()){
                lesCategories.add(rs.getString(1));
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlEleve.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesCategories;
    }
     public String getLibelleCategorieById(int idCategorie){
        String libelle="";
        try {
            ps = cnx.prepareStatement("select Libelle from categorie where CodeCategorie =?");
            ps.setInt(1, idCategorie);
            rs = ps.executeQuery();
            rs.next();
            libelle= rs.getString(1);
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlEleve.class.getName()).log(Level.SEVERE, null, ex);
        }
         return libelle;
       
    }
}