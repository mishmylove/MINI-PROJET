/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entite;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author halloul
 */
@Entity
@Table(name = "post")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Post.findAll", query = "SELECT p FROM Post p"),
    @NamedQuery(name = "Post.findById", query = "SELECT p FROM Post p WHERE p.id = :id"),
    @NamedQuery(name = "Post.findByTitre", query = "SELECT p FROM Post p WHERE p.titre = :titre"),
    @NamedQuery(name = "Post.findByText", query = "SELECT p FROM Post p WHERE p.text = :text"),
    @NamedQuery(name = "Post.findByDateCreation", query = "SELECT p FROM Post p WHERE p.dateCreation = :dateCreation"),
    @NamedQuery(name = "Post.findByGouvernorat", query = "SELECT p FROM Post p WHERE p.gouvernorat = :gouvernorat"),
    @NamedQuery(name = "Post.findByRubrique", query = "SELECT p FROM Post p WHERE p.rubrique = :rubrique"),
    @NamedQuery(name = "Post.findByNature", query = "SELECT p FROM Post p WHERE p.nature = :nature"),
    @NamedQuery(name = "Post.findByType", query = "SELECT p FROM Post p WHERE p.type = :type"),
    @NamedQuery(name = "Post.findByPrix", query = "SELECT p FROM Post p WHERE p.prix = :prix")})
public class Post implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "titre")
    private String titre;
    @Column(name = "text")
    private String text;
    @Column(name = "dateCreation")
    private String dateCreation;
    @Basic(optional = false)
    @Column(name = "gouvernorat")
    private String gouvernorat;
    @Basic(optional = false)
    @Column(name = "rubrique")
    private String rubrique;
    @Basic(optional = false)
    @Column(name = "nature")
    private String nature;
    @Basic(optional = false)
    @Column(name = "type")
    private String type;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "prix")
    private Float prix;

    public Post() {
    }

    public Post(Integer id) {
        this.id = id;
    }

    public Post(Integer id, String titre, String text, String dateCreation, String gouvernorat, String rubrique, String nature, String type, Float prix) {
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

    public Post(Integer id, String gouvernorat, String rubrique, String nature, String type) {
        this.id = id;
        this.gouvernorat = gouvernorat;
        this.rubrique = rubrique;
        this.nature = nature;
        this.type = type;
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

    public Float getPrix() {
        return prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
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
