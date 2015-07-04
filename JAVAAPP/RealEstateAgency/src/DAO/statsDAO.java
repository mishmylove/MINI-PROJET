/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Tools.DBcon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import Entite.top;
import java.sql.SQLException;
/**
 *
 * @author halloul
 */
public class statsDAO {
    
    static Connection con = DBcon.getInstance();
    static Statement ste;
   
    //String top5GouvernoratQuery = "select count(*) as top , g.nom from post g , post p where g.id=p.gouvernorat group by g.nom order by top DESC limit 5 ";
String top5GouvernoratQuery = "select count(*) as top , gouvernorat as nom from post group by gouvernorat order by top DESC limit 5";
PreparedStatement pstop5Gouvernorat;
String top5UserQuery = "select count(*) as top , user.mail as nom from post join user where post.user_id=user.id group by post.user_id order by top DESC limit 5";
PreparedStatement pstop5User;

String totalUserQuery = "select count(*) as totalUser from user ";
PreparedStatement pstotalUser;

String totalPostQuery = "select count(*) as totalPost from post ";
PreparedStatement pstotalPost;
    
    ResultSet res;
    
    
    public ArrayList<top> getTop5Gouvernorat() throws SQLException{
     ArrayList<top> top5List = new ArrayList<top>();
        pstop5Gouvernorat = con.prepareStatement(top5GouvernoratQuery);

        res = pstop5Gouvernorat.executeQuery();
        while (res.next()) {
            top5List.add(new top(res.getInt("top"),res.getString("nom")));
        }
        return top5List;
    }
    
    
     public ArrayList<top> getTop5User() throws SQLException{
     ArrayList<top> top5List = new ArrayList<top>();
        pstop5User = con.prepareStatement(top5UserQuery);

        res = pstop5User.executeQuery();
        while (res.next()) {
            top5List.add(new top(res.getInt("top"),res.getString("nom")));
        }
        return top5List;
    }
     
     
     public int getTotalUser() throws SQLException{
        pstotalUser = con.prepareStatement(totalUserQuery);
        res = pstotalUser.executeQuery();
        if (!res.next()) {
            return 0;
        }
        return   res.getInt("totalUser");
    }
     
     public int getTotalPost() throws SQLException{
        pstotalPost = con.prepareStatement(totalPostQuery);
        res = pstotalPost.executeQuery();
        if (!res.next()) {
            return 0;
        }
        return   res.getInt("totalPost");
    }
    
    
    
    
    
    
}
