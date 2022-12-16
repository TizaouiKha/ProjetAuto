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
}
