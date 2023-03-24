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
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author khaln
 */
public class CtrlLicence {
    private Connection cnx;
    private PreparedStatement ps;
    private ResultSet rs;

    public CtrlLicence(){
        cnx =  ConnexionBDD.getCnx();
    }
    
    public void ajoutLicence( int codeMoniteur, int codeCategorie, Date dateObtention){
        try {
            ps = cnx.prepareStatement("Insert Into licence ( CodeMoniteur, CodeCategorie, DateObtention) Values(?,?,?)");
            ps.setInt(1, codeMoniteur);
            ps.setInt(2, codeCategorie);
            ps.setDate(3, new java.sql.Date(dateObtention.getTime()));            
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlLicence.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
