/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author khaln
 */
public class ConnexionBDD 
{
    private static Connection cnx;
    public ConnexionBDD() 
    {
        try
        {
            // chargement du pilote
            Class.forName("com.mysql.jdbc.Driver");
            // L'objet connexion à la BDD avec le nom de la base, le user et le password
            cnx = DriverManager.getConnection("jdbc:mysql://localhost/autoecole?serverTimezone="
                    + TimeZone.getDefault().getID(), "root", "");
        }
        catch (ClassNotFoundException ex)
        {
            Logger.getLogger(ConnexionBDD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConnexionBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    public static Connection getCnx() {
        return cnx;
    }
}