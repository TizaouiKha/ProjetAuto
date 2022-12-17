/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlers;

import Entities.Lecon;
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
public class CtrlLecon {
    private Connection cnx;
    private PreparedStatement ps;
    private ResultSet rs;
    
    
    public CtrlLecon(){
        cnx = ConnexionBDD.getCnx();
    }
    
    public ArrayList<Lecon> getAllLeconByIdEleve(int idEleve){
         ArrayList<Lecon>lesLecons= new ArrayList<>();
        try {
            ps= cnx.prepareStatement("SELECT CodeLecon, MONTH(Date) AS mois, DAY(Date) as jour, Heure , moniteur.Nom as nomMoniteur, eleve.Nom as nomEleve, Immatriculation "
                    + "FROM lecon "
                    + "join eleve on lecon.CodeEleve = eleve.CodeEleve "
                    + "join moniteur on lecon.CodeMoniteur = moniteur.CodeMoniteur "
                    + "WHERE lecon.CodeEleve = ?");
            ps.setInt(1, idEleve);
            rs= ps.executeQuery();
            while(rs.next()){
                Lecon lecon = new Lecon(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
                lesLecons.add(lecon);
            }   
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlLecon.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesLecons;
    }
    public ArrayList<Lecon> getAllLeconByIdMoniteur(int idMoniteur){
         ArrayList<Lecon>lesLecons= new ArrayList<>();
        try {
            ps= cnx.prepareStatement("SELECT CodeLecon, MONTH(Date) AS mois, DAY(Date) as jour, Heure , moniteur.Nom as nomMoniteur, CodeEleve, Immatriculation "
                    + "FROM lecon "
                    + "join moniteur on lecon.CodeMoniteur = moniteur.CodeMoniteur "
                    + "WHERE lecon.CodeMoniteur = ?");
            ps.setInt(1, idMoniteur);
            rs= ps.executeQuery();
            while(rs.next()){
                Lecon lecon = new Lecon(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
                lesLecons.add(lecon);
            }   
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlLecon.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesLecons;
    }
    public ArrayList<Lecon> getAllLeconByIdMoniteurAndByIdEleve(int idMoniteur, int idEleve){
        ArrayList<Lecon>lesLecons = new ArrayList<>();
        try {
            ps= cnx.prepareStatement("SELECT CodeLecon, MONTH(Date) AS mois, DAY(Date) as jour, Heure , moniteur.Nom as nomMoniteur, CodeEleve, Immatriculation"
                    + "FROM lecon "
                    + "join eleve on lecon.CodeEleve = eleve.CodeEleve "
                    + "join moniteur on lecon.CodeMoniteur = moniteur.CodeMoniteur "
                    + "WHERE lecon.CodeMoniteur = ? "
                    + "AND lecon.CodeEleve = ?;");
            ps.setInt(1, idMoniteur);
            ps.setInt(2, idEleve);
            rs= ps.executeQuery();
            while(rs.next()){
                Lecon lecon = new Lecon(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
                lesLecons.add(lecon);
            }   
            ps.close();
            rs.close();
            } catch (SQLException ex) {
            Logger.getLogger(CtrlLecon.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesLecons;
    }
    public ArrayList<Lecon> getAllLeconByIdEleveByTypePermis(int idEleve){
         ArrayList<Lecon>lesLecons= new ArrayList<>();
        try {
            ps= cnx.prepareStatement("""
                                     SELECT lecon.CodeLecon,MONTH(lecon.Date) AS mois, lecon.Date, lecon.Heure , moniteur.Nom as nomMoniteur, lecon.Immatriculation, categorie.Libelle , lecon.Reglee
                                     FROM lecon 
                                     join vehicule on lecon.Immatriculation = vehicule.Immatriculation
                                     join categorie on vehicule.CodeCategorie = categorie.CodeCategorie
                                     join eleve on lecon.CodeEleve = eleve.CodeEleve
                                     join moniteur on lecon.CodeMoniteur = moniteur.CodeMoniteur
                                     WHERE lecon.CodeEleve = ?;""");
            ps.setInt(1, idEleve);
            rs= ps.executeQuery();
            while(rs.next()){
                Lecon lecon = new Lecon(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8));
                lesLecons.add(lecon);
            }   
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlLecon.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesLecons;
    }
}
    

