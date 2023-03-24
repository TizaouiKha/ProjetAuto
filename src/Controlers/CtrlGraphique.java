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
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author khaln
 */
public class CtrlGraphique {
    private Connection cnx;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public CtrlGraphique(){
        cnx = ConnexionBDD.getCnx();
    }
    
    public HashMap<String,Integer> getDatasGraphiqueEleve(int idEleve)
    {
        HashMap<String, Integer> datas = new HashMap();
        try {
            ps = cnx.prepareStatement("select vehicule.Modele, count(lecon.Immatriculation) as nbLeconVehicule " +
                    "from lecon " +
                    "inner join vehicule on lecon.Immatriculation = vehicule.Immatriculation " +
                    "where lecon.CodeEleve = ? "+
                    "group by vehicule.Modele");
            ps.setInt(1, idEleve);
            rs = ps.executeQuery();
            while(rs.next())
            {
                datas.put(rs.getString("vehicule.Modele"), rs.getInt("nbLeconVehicule"));
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlGraphique.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datas;
    }
     public HashMap<String,Integer> getDatasGraphiqueVehicule(){
         HashMap<String, Integer> datas = new HashMap();
        try {
            ps = cnx.prepareStatement("select vehicule.Modele, count(lecon.Immatriculation) as nbLeconVehicule " +
                    "from lecon " +
                    "inner join vehicule on lecon.Immatriculation = vehicule.Immatriculation " +
                    "group by vehicule.Modele");
            rs = ps.executeQuery();
            while(rs.next())
            {
                datas.put(rs.getString("vehicule.Modele"), rs.getInt("nbLeconVehicule"));
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(CtrlGraphique.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datas;
     }
    
}
