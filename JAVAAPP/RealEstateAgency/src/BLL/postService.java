/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAO.postDAO;
import Entite.Post;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author halloul
 */
public class postService {

    postDAO pDAO = new postDAO();

    public ArrayList<Post> getPostList() {
        try {
            return pDAO.getPostList();
        } catch (SQLException ex) {
            Logger.getLogger(postService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public int deletePost(Post u) {
        try {
            return pDAO.deletePost(u);
        } catch (SQLException ex) {
            Logger.getLogger(postService.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public int updatePost(Post u) {

        try {
            return pDAO.updatePost(u);
        } catch (SQLException ex) {
            Logger.getLogger(postService.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }

    }

    public ArrayList<Post> searchPost(String titre, String gouvernorat, String rubrique, String nature, String type, int prix)  {

        try {
            return pDAO.searchPost( titre,  gouvernorat,  rubrique,  nature,  type,  prix);
        } catch (SQLException ex) {
            Logger.getLogger(postService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public int AddPost(Post u) {
        try {
            return pDAO.AddPost(u);
        } catch (SQLException ex) {
            Logger.getLogger(postService.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

}
