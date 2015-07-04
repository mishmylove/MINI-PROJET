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
    String insertQuery = " INSERT INTO `post`( `titre`, `text`, `dateCreation`, `gouvernorat`, `rubrique`, `nature`, `type`, `prix`, `user_id`) VALUES (?,?,?,?,?,?,?,?,?)";
    String updateQuery = " UPDATE `post` SET `titre`= ?,`text`= ?,`dateCreation`= ?,`gouvernorat`= ?,`rubrique`= ?,`nature`= ?,`type`= ?,`prix`= ? WHERE id = ?";
    String deleteQuery = " DELETE FROM `post` WHERE id = ?";

    //String selectAllQuery = "select * from  post ;";
    String selectAllQuery = "select post.id, titre, text , dateCreation, gouvernorat, rubrique, nature, post.type, prix, user_id, user.mail from post join user where post.user_id=user.id";
    String selectByMail = "select * from  post where mail = ? and password = ? ;";

    
        
    String searchQuery = "select post.id, titre, text , dateCreation, gouvernorat, rubrique, nature, post.type, prix, user_id, user.mail from post join user where titre LIKE ?  "
            + "and gouvernorat LIKE ? "
            + " and rubrique LIKE ? "
            + " and nature LIKE ? "
            + " and post.type LIKE ?"
            + "and prix <= ? and post.user_id=user.id";

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
            
            Post u = new Post(res.getInt("id"), res.getString("titre") , res.getString("text") , res.getString("dateCreation") , res.getString("gouvernorat") , res.getString("rubrique") , res.getString("nature") , res.getString("type") , res.getInt("prix") ,res.getString("mail"));
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
        psUpdate.setString(9, String.valueOf(u.getId()));
        return psUpdate.executeUpdate();
    }

    public ArrayList<Post> searchPost(String titre,String gouvernorat,String rubrique,String nature,String type,int prix) throws SQLException {
        
        
        
        ArrayList<Post> postList = new ArrayList<Post>();
        
        psSearch = con.prepareStatement(searchQuery);
        
       
        if(titre.equalsIgnoreCase(""))
        psSearch.setString(1, "%");    
        else
        psSearch.setString(1, titre + '%');
        
        if(gouvernorat.equalsIgnoreCase("*"))
        psSearch.setString(2, "%");
        else
        psSearch.setString(2, gouvernorat+ '%');
       
        if(rubrique.equalsIgnoreCase("*"))
        psSearch.setString(3, "%" );
        else
        psSearch.setString(3, rubrique + '%');
       
        if(nature.equalsIgnoreCase("*"))
        psSearch.setString(4, "%" );
        else
        psSearch.setString(4, nature + '%');
        
        if(type.equalsIgnoreCase("*"))
        psSearch.setString(5, "%" );
        else
        psSearch.setString(5, type+ '%' );
        
        psSearch.setInt(6, prix);
          System.out.println(psSearch.toString());
        res = psSearch.executeQuery();

        while (res.next()) {

            Post u = new Post(res.getInt("id"), res.getString("titre") , res.getString("text") , res.getString("dateCreation") , res.getString("gouvernorat") , res.getString("rubrique") , res.getString("nature") , res.getString("type") , res.getInt("prix") ,res.getString("mail"));

            postList.add(u);
        }
        postList.toString();
        return postList;

    }

    public int AddPost(Post u) throws SQLException {
        psInsert = con.prepareStatement(insertQuery);
        psInsert.setString(1, String.valueOf(u.getTitre()));
        psInsert.setString(2, String.valueOf(u.getText()));
        psInsert.setString(3, String.valueOf(u.getDateCreation()));
        psInsert.setString(4, String.valueOf(u.getGouvernorat()));
        psInsert.setString(5, String.valueOf(u.getRubrique()));
        psInsert.setString(6, String.valueOf(u.getNature()));
        psInsert.setString(7, String.valueOf(u.getType()));
        psInsert.setString(8, String.valueOf(u.getPrix()));
        psInsert.setString(9, String.valueOf(u.getUser_id()));
        return psInsert.executeUpdate();
    }

    
    
    
    
    
    
}
