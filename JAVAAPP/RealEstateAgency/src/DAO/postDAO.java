/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entite.Post;
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
public class postDAO {
    
    static Connection con = DBcon.getInstance();
    static Statement ste;
    String insertQuery = " INSERT INTO `post`(`nom`, `prenom`, `mail`, `password`, `adresse`, `telephone`, `type`) VALUES (?,?,?,?,?,?,?)";
    String updateQuery = " UPDATE `post` SET `nom`= ?,`prenom`= ?,`mail`= ?,`password`= ?,`adresse`= ?,`telephone`= ?,`type`= ? WHERE id = ?";
    String deleteQuery = " DELETE FROM `post` WHERE id = ?";

    String selectAllQuery = "select * from  post ;";
    String selectByMail = "select * from  post where mail = ? and password = ? ;";

    String searchQuery = "select * from  post where {{columnName}} LIKE ?  ;";

    PreparedStatement psInsert;
    PreparedStatement psUpdate;
    PreparedStatement psDelete;
    PreparedStatement psSelectAll;
    PreparedStatement psSelectByMail;
    PreparedStatement psSearch;

    ResultSet res;

    /**
     * getPostList
     *
     * @return post list
     * @throws SQLException
     */
    public ArrayList<Post> getPostList() throws SQLException {
        ArrayList<Post> postList = new ArrayList<Post>();
        psSelectAll = con.prepareStatement(selectAllQuery);

        res = psSelectAll.executeQuery();
        while (res.next()) {
            
            Post u = new Post(res.getInt("id"), res.getString("titre") , res.getString("text") , res.getString("dateCreation") , res.getString("gouvernorat") , res.getString("rubrique") , res.getString("nature") , res.getString("type") , res.getFloat("prix") );
            postList.add(u);
        }
        postList.toString();
        return postList;
    }

    

    /**
     * deletePost
     *
     * @param u post
     * @return 1 if deleted succ else return 0
     * @throws SQLException
     */
    public int deletePost(Post u) throws SQLException {
        psDelete = con.prepareStatement(deleteQuery);
        psDelete.setString(1, String.valueOf(u.getId()));
        return psDelete.executeUpdate();

    }

    /**
     * updatePost
     *
     * @param u
     * @return
     * @throws SQLException
     */
    public int updatePost(Post u) throws SQLException {
        psUpdate = con.prepareStatement(updateQuery);
        psUpdate.setString(1, String.valueOf(u.getTitre()));
        psUpdate.setString(2, String.valueOf(u.getText()));
        psUpdate.setString(3, String.valueOf(u.getDateCreation()));
        psUpdate.setString(4, String.valueOf(u.getGouvernorat()));
        psUpdate.setString(5, String.valueOf(u.getRubrique()));
        psUpdate.setString(6, String.valueOf(u.getNature()));
        psUpdate.setString(7, String.valueOf(u.getType()));
        psUpdate.setString(8, String.valueOf(u.getPrix()));
        return psUpdate.executeUpdate();
    }

    public ArrayList<Post> searchPost(String filter, String text) throws SQLException {
        ArrayList<Post> postList = new ArrayList<Post>();

        String preparedQuery = searchQuery.replace("{{columnName}}", filter);
        psSearch = con.prepareStatement(preparedQuery);
        psSearch.setString(1, text + '%');

        res = psSearch.executeQuery();

        while (res.next()) {

            Post u = new Post(res.getInt("id"), res.getString("titre") , res.getString("text") , res.getString("dateCreation") , res.getString("gouvernorat") , res.getString("rubrique") , res.getString("nature") , res.getString("type") , res.getFloat("prix") );

            postList.add(u);
        }
        postList.toString();
        return postList;

    }

    public int AddPost(Post u) throws SQLException {
        psInsert = con.prepareStatement(insertQuery);
        psUpdate.setString(1, String.valueOf(u.getTitre()));
        psUpdate.setString(2, String.valueOf(u.getText()));
        psUpdate.setString(3, String.valueOf(u.getDateCreation()));
        psUpdate.setString(4, String.valueOf(u.getGouvernorat()));
        psUpdate.setString(5, String.valueOf(u.getRubrique()));
        psUpdate.setString(6, String.valueOf(u.getNature()));
        psUpdate.setString(7, String.valueOf(u.getType()));
        psUpdate.setString(8, String.valueOf(u.getPrix()));
        return psInsert.executeUpdate();
    }

    
    
    
    
    
    
}
