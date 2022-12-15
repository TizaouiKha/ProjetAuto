/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlers;

import Entities.Leçon;
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
public class CtrlLeçon {
    private Connection cnx;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public CtrlLeçon(){
        cnx = ConnexionBDD.getCnx();
    }
    
    public ArrayList<Leçon> getAllLeçonByIdEleve(int idEleve){
         ArrayList<Leçon>lesLeçons= new ArrayList<>();
        try {
            ps= cnx.prepareStatement("SELECT CodeLecon, MONTH(Date) AS mois, DAY(Date) as jour, Heure , moniteur.Nom as nomMoniteur, eleve.Nom as nomEleve, Immatriculation FROM lecon join eleve on lecon.CodeEleve = eleve.CodeEleve join moniteur on lecon.CodeMoniteur = moniteur.CodeMoniteur WHERE lecon.CodeEleve =?;");
            ps.setInt(1, idEleve);
            rs= ps.executeQuery();
            while(rs.next()){
                Leçon leçon = new Leçon(rs.getInt("CodeLecon"), rs.getString("mois"), rs.getString("jour"), rs.getString("Heure"), rs.getString("nomMoniteur"), rs.getString("nomEleve"), rs.getString("Immatriculation"));
                lesLeçons.add(leçon);
            }   
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlLeçon.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesLeçons;
    }
}
    

