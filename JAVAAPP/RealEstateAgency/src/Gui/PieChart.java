package Gui;

import Tools.DBcon;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
public class PieChart extends JFrame{
    DefaultPieDataset dataset;//Dataset qui va contenir les Données
    JFreeChart graphe;        //Graphe
    ChartPanel cp;            //Panel
    public PieChart() throws SQLException {
         Connection con = DBcon.getInstance();
         String sql = "select count(*) as top , g.nom from gouvernorat g , post p where g.id=p.gouvernorat group by g.nom order by top DESC ";

        Statement ste  = con.prepareStatement(sql);
        ArrayList<top> topG = new ArrayList<>();
        top t;
        int nb;
        String nom;



	  ResultSet res;
	 
          res = ste.executeQuery(sql);
          while(res.next() && res.getRow()<6)
          {
            nb = res.getInt("top");
            nom = res.getString("nom");
            t = new top(nb,nom);
            topG.add(t);
          }

        DefaultPieDataset dataset;//Dataset qui va contenir les Données
        JFreeChart graphe;        //Graphe
        ChartPanel cp;
        dataset = new DefaultPieDataset();
//Statique
        //for(int i=0;i<5;i++)
        
        dataset.setValue(topG.get(0).element,topG.get(0).nb );
                dataset.setValue(topG.get(1).element,topG.get(1).nb );
                        dataset.setValue(topG.get(2).element,topG.get(2).nb );
                                dataset.setValue(topG.get(3).element,topG.get(3).nb );



        
graphe = ChartFactory.createPieChart3D("Exemple Camemberg", dataset,true ,true ,false);
        cp = new ChartPanel(graphe);
        this.add(cp);
    }
	 public static void main (String args[]) throws SQLException{
        PieChart pchart = new PieChart();
        pchart.setVisible(true);

    }
}

