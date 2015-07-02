/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entite.User;
import Tools.DBcon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author halloul
 */
public class UserDAO {

    static Connection con = DBcon.getInstance();
    static Statement ste;
    String insertQuery = " insert into user (nom, prenom, age)" + " values (?, ?, ?)";
    String updateQuery = " insert into user (nom, prenom, age)" + " values (?, ?, ?)";
    String deleteQuery = " DELETE FROM `user` WHERE id = ?";
    
    String selectAllQuery = "select * from  user ;";
    String selectByMail = "select * from  user where mail = ? and password = ? ;";
    
    PreparedStatement psInsert;
    PreparedStatement psUpdate;
    PreparedStatement psDelete;
    PreparedStatement psSelectAll;
    PreparedStatement psSelectByMail;

    ResultSet res;
    /**
     * getUserList
     * @return user list 
     * @throws SQLException 
     */
    public ArrayList<User> getUserList() throws SQLException {
        ArrayList<User> userList = new ArrayList<User>();
        psSelectAll = con.prepareStatement(selectAllQuery);

        res = psSelectAll.executeQuery();
        while (res.next()) {

            User u = new User(res.getInt("id"), res.getString("nom"), res.getString("prenom"), res.getString("mail"), res.getString("password"), res.getString("adresse"), res.getString("telephone"), res.getString("type"));

            userList.add(u);
        }
        userList.toString();
        return userList;
    }
    /**
     * loginByMail
     * @param mail
     * @param password
     * @return user if exists else null
     * @throws SQLException 
     */
      public User loginByMail(String mail,String password) throws SQLException {
       
        psSelectByMail = con.prepareStatement(selectByMail);
        psSelectByMail.setString(1, mail);
        psSelectByMail.setString(2, password);
        res = psSelectByMail.executeQuery();
 
        if(!res.next()) 
        return null;
        else{
            return new User(res.getInt("id"), res.getString("nom"), res.getString("prenom"), res.getString("mail"), res.getString("password"), res.getString("adresse"), res.getString("telephone"), res.getString("type"));
        }
        
    }
     /**
      * deleteUser
      * @param u user 
      * @return 1 if deleted succ else return 0 
      * @throws SQLException 
      */ 
    public int deleteUser(User u) throws SQLException {
        psDelete = con.prepareStatement(deleteQuery);
        psDelete.setString(1, String.valueOf(u.getId()));
        return psDelete.executeUpdate();
        
    }  

    public int AddUser(User u) throws SQLException {

        return 0;
    }

    
    
    
    
}
