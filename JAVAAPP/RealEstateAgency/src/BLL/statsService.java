/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;
import DAO.statsDAO;
import Entite.top;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author halloul
 */
public class statsService {
    
    statsDAO sDAO = new statsDAO();
   
    
    
    
    public ArrayList<top> getTop5Gouvernorat(){
        try {
            
             return sDAO.getTop5Gouvernorat();
             
        } catch (SQLException ex) {
            Logger.getLogger(statsService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    
    
    
    
    
}
