/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tools;

import Entities.Lecon;
import Entities.Vehicule;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ModelJTable extends AbstractTableModel {
    private String[] colonnes;
    private Object[][] lignes;

    @Override
    public String getColumnName(int column) {
        return colonnes[column];
    }

    @Override
    public int getRowCount() {
        return lignes.length;
    }

    @Override
    public int getColumnCount() {
        return colonnes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return lignes[rowIndex][columnIndex];
    }

    @Override
    public void setValueAt(Object value, int row, int column) {
        lignes[row][column] = value;
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return column == 3 ;
 }
    public void loadDatasLeconsByMoniteurAndByEleve(ArrayList<Lecon> lesLecons){
        colonnes = new String[]{"Numéro", "Mois","Jour","Heure","Nom moniteur","Nom eleve", "Immatriculation"};
        lignes = new Object[lesLecons.size()][7];
        int i = 0;
        for (Lecon lecon : lesLecons)
        {
            lignes[i][0] = lecon.getIdLecon();
            lignes[i][1] = lecon.getMois();
            lignes[i][2] = lecon.getJour();
            lignes[i][3] = lecon.getHeure();
            lignes[i][4] = lecon.getNomMoniteur();
            lignes[i][5] = lecon.getNomEleve();
            lignes[i][6] = lecon.getImmatriculation();
            i++;
        }
        fireTableChanged(null);
    }
    public void loadDatasVehicule(ArrayList<Vehicule>lesVehicules){
        colonnes = new String[]{"Immatriculation", "Marque","Modele","Annee","CodeCategorie"};
        lignes = new Object[lesVehicules.size()][5];
        int i = 0;
        for (Vehicule vehicule : lesVehicules )
        {
            lignes[i][0] = vehicule.getImmatriculation();
            lignes[i][1] = vehicule.getMarque();
            lignes[i][2] = vehicule.getModele();
            lignes[i][3] = vehicule.getAnnee();
            lignes[i][4] = vehicule.getIdCategorie();
            i++;
        }
        fireTableChanged(null);
    }
    public void loadDatasPlanningEleve(ArrayList<Lecon>lesLecons){
        colonnes = new String[]{"Mois", "Date", "Heure","Type Permis", "Nom Moniteur", "Immatriculation"};
        lignes = new Object[lesLecons.size()][6];
        int i = 0;
        for(Lecon lecon : lesLecons){
            lignes[i][0]= lecon.getMois();
            lignes[i][1]= lecon.getDate();
            lignes[i][2]= lecon.getHeure();
            lignes[i][3]= lecon.getLibelleCategorie();
            lignes[i][4]= lecon.getNomMoniteur();
            lignes[i][5]= lecon.getImmatriculation();
            i++;
        }
        fireTableChanged(null);
    }
}