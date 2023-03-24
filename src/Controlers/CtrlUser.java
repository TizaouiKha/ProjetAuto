/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlers;

import Entities.User;
import Tools.ConnexionBDD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author khali
 */
public class CtrlUser {
    private Connection cnx;
    private PreparedStatement ps;
    private ResultSet rs;

    public CtrlUser() {
        cnx = ConnexionBDD.getCnx();
    }
    public User VerifierUser(String login, String mdp){
        User monUser = null;
        try {            
            ps = cnx.prepareStatement("SELECT users.idUser, users.nomUser,users.prenomUser,users.loginUser, users.pwdUser, users.statutUser, users.CodeEleve, users.CodeMoniteur from users where users.loginUser=? and users.pwdUser=?");
            ps.setString(1, login);
            ps.setString(2, mdp);
            rs= ps.executeQuery();
            if(rs.next()){
                if(rs.getString("statutUser").equals("eleve")){
                    monUser= new User().eleve(rs.getInt("idUser"), rs.getString("nomUser"), rs.getString("prenomUser"),rs.getString("loginUser"),rs.getString("pwdUser"), rs.getString("statutUser"), rs.getInt("CodeEleve"));
                }
                else if(rs.getString("statutUser").equals("moniteur")){
                    monUser= new User().moniteur(rs.getInt("idUser"), rs.getString("nomUser"), rs.getString("prenomUser"),rs.getString("loginUser"),rs.getString("pwdUser"), rs.getString("statutUser"), rs.getInt("CodeMoniteur"));
                }
                else{
                monUser= new User().admin(rs.getInt("idUser"), rs.getString("nomUser"), rs.getString("prenomUser"),rs.getString("loginUser"),rs.getString("pwdUser"), rs.getString("statutUser"));
                }
            }
            
            rs.close();
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(CtrlUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return monUser;
    }
    public void updateLoginMdpUser(String login, String mdp, int idUser){
        try {
            ps = cnx.prepareStatement("Update users set loginUser = ?, pwduser = ? where idUser = ?");
            ps.setString(1, login);
            ps.setString(2, mdp);
            ps.setInt(3, idUser);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
