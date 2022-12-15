/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlers;

import Tools.ConnexionBDD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
}
