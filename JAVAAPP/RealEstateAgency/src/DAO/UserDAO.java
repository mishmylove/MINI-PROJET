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
    String insertQuery = " INSERT INTO `user`(`nom`, `prenom`, `mail`, `password`, `adresse`, `telephone`, `type`) VALUES (?,?,?,?,?,?,?)";
    String updateQuery = " UPDATE `user` SET `nom`= ?,`prenom`= ?,`mail`= ?,`password`= ?,`adresse`= ?,`telephone`= ?,`type`= ? WHERE id = ?";
    String deleteQuery = " DELETE FROM `user` WHERE id = ?";

    String selectAllQuery = "select * from  user ;";
    String selectByMail = "select * from  user where mail = ? and password = ? ;";

    String searchQuery = "select * from  user where {{columnName}} LIKE ?  ;";

    PreparedStatement psInsert;
    PreparedStatement psUpdate;
    PreparedStatement psDelete;
    PreparedStatement psSelectAll;
    PreparedStatement psSelectByMail;
    PreparedStatement psSearch;

    ResultSet res;

    /**
     * getUserList
     *
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
     *
     * @param mail
     * @param password
     * @return user if exists else null
     * @throws SQLException
     */
    public User loginByMail(String mail, String password) throws SQLException {

        psSelectByMail = con.prepareStatement(selectByMail);
        psSelectByMail.setString(1, mail);
        psSelectByMail.setString(2, password);
        res = psSelectByMail.executeQuery();

        if (!res.next()) {
            return null;
        } else {
            return new User(res.getInt("id"), res.getString("nom"), res.getString("prenom"), res.getString("mail"), res.getString("password"), res.getString("adresse"), res.getString("telephone"), res.getString("type"));
        }

    }

    /**
     * deleteUser
     *
     * @param u user
     * @return 1 if deleted succ else return 0
     * @throws SQLException
     */
    public int deleteUser(User u) throws SQLException {
        psDelete = con.prepareStatement(deleteQuery);
        psDelete.setString(1, String.valueOf(u.getId()));
        return psDelete.executeUpdate();

    }

    /**
     * updateUser
     *
     * @param u
     * @return
     * @throws SQLException
     */
    public int updateUser(User u) throws SQLException {
        psUpdate = con.prepareStatement(updateQuery);
        psUpdate.setString(1, String.valueOf(u.getNom()));
        psUpdate.setString(2, String.valueOf(u.getPrenom()));
        psUpdate.setString(3, String.valueOf(u.getMail()));
        psUpdate.setString(4, String.valueOf(u.getPassword()));
        psUpdate.setString(5, String.valueOf(u.getAdresse()));
        psUpdate.setString(6, String.valueOf(u.getTelephone()));
        psUpdate.setString(7, String.valueOf(u.getUserType()));
        psUpdate.setString(8, String.valueOf(u.getId()));
        return psUpdate.executeUpdate();
    }

    public ArrayList<User> searchUser(String filter, String text) throws SQLException {
        ArrayList<User> userList = new ArrayList<User>();

        String preparedQuery = searchQuery.replace("{{columnName}}", filter);
        psSearch = con.prepareStatement(preparedQuery);
        psSearch.setString(1, text + '%');

        res = psSearch.executeQuery();

        while (res.next()) {

            User u = new User(res.getInt("id"), res.getString("nom"), res.getString("prenom"), res.getString("mail"), res.getString("password"), res.getString("adresse"), res.getString("telephone"), res.getString("type"));

            userList.add(u);
        }
        userList.toString();
        return userList;

    }

    public int AddUser(User u) throws SQLException {
        psInsert = con.prepareStatement(insertQuery);
        psInsert.setString(1, String.valueOf(u.getNom()));
        psInsert.setString(2, String.valueOf(u.getPrenom()));
        psInsert.setString(3, String.valueOf(u.getMail()));
        psInsert.setString(4, String.valueOf(u.getPassword()));
        psInsert.setString(5, String.valueOf(u.getAdresse()));
        psInsert.setString(6, String.valueOf(u.getTelephone()));
        psInsert.setString(7, String.valueOf(u.getUserType()));
        return psInsert.executeUpdate();
    }

}
