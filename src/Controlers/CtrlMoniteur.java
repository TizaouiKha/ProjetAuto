/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlers;

/**
 *
 * @author khaln
 */
import Tools.ConnexionBDD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
}