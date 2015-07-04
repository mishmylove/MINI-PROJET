/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entite;

import java.io.Serializable;

/**
 *
 * @author halloul
 */

public class Post implements Serializable {
   
    
    private Integer id;
  
    private String titre;
 
    private String text;
 
    private String dateCreation;
  
  
    private String gouvernorat;

    private String rubrique;


    private String nature;
   

    private String type;
  
    private int prix;
  
    private Integer user_id;
    
    private String userMail;

    public Post() {
    }

    public Post(Integer id) {
        this.id = id;
    }

    public Post(Integer id, String titre, String text, String dateCreation, String gouvernorat, String rubrique, String nature, String type, int prix, Integer user_id) {
        this.id = id;
        this.titre = titre;
        this.text = text;
        this.dateCreation = dateCreation;
        this.gouvernorat = gouvernorat;
        this.rubrique = rubrique;
        this.nature = nature;
        this.type = type;
        this.prix = prix;
        this.user_id = user_id;
    }
    
    public Post(Integer id, String titre, String text, String dateCreation, String gouvernorat, String rubrique, String nature, String type, int prix, String userMail) {
        this.id = id;
        this.titre = titre;
        this.text = text;
        this.dateCreation = dateCreation;
        this.gouvernorat = gouvernorat;
        this.rubrique = rubrique;
        this.nature = nature;
        this.type = type;
        this.prix = prix;
        this.userMail = userMail;
    }
    
      public Post(Integer id, String titre, String text, String dateCreation, String gouvernorat, String rubrique, String nature, String type, int prix) {
        this.id = id;
        this.titre = titre;
        this.text = text;
        this.dateCreation = dateCreation;
        this.gouvernorat = gouvernorat;
        this.rubrique = rubrique;
        this.nature = nature;
        this.type = type;
        this.prix = prix;
       
    }
    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getGouvernorat() {
        return gouvernorat;
    }

    public void setGouvernorat(String gouvernorat) {
        this.gouvernorat = gouvernorat;
    }

    public String getRubrique() {
        return rubrique;
    }

    public void setRubrique(String rubrique) {
        this.rubrique = rubrique;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Post)) {
            return false;
        }
        Post other = (Post) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entite.Post[ id=" + id + " ]";
    }
    
}
