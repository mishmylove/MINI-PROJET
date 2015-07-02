/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAO.UserDAO;
import Entite.User;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author halloul
 */
public class UserService {

    
        UserDAO uDAO = new UserDAO();
    

    public ArrayList<User> getUserList() {
            try {
                return uDAO.getUserList();
            } catch (SQLException ex) {
                Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
    }

     public User loginByMail(String mail,String password){
     
            try {
                return uDAO.loginByMail(mail, password);
            } catch (SQLException ex) {
                Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
     }
}
