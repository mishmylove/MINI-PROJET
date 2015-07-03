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

    public User loginByMail(String mail, String password) {

        try {
            return uDAO.loginByMail(mail, password);
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public int deleteUser(User u) {
        try {
            return uDAO.deleteUser(u);
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public int updateUser(User u) {

        try {
            return uDAO.updateUser(u);
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }

    }

    public ArrayList<User> searchUser(String filter, String text)  {
        try {
            return uDAO.searchUser(filter, text);
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public int AddUser(User u) {
        try {
            return uDAO.AddUser(u);
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

}
