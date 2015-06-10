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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author halloul
 */
@Entity
@Table(name = "post", catalog = "realestatedb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Post.findAll", query = "SELECT p FROM Post p")})
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
    @Column(name = "prix")
    private String prix;
    @JoinColumn(name = "gouvernorat", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Gouvernorat gouvernorat;
    @JoinColumn(name = "nature", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Nature nature;
    @JoinColumn(name = "rubrique", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Rubrique rubrique;
    @JoinColumn(name = "type", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Type type;

    public Post() {
    }

    public Post(Integer id) {
        this.id = id;
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

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public Gouvernorat getGouvernorat() {
        return gouvernorat;
    }

    public void setGouvernorat(Gouvernorat gouvernorat) {
        this.gouvernorat = gouvernorat;
    }

    public Nature getNature() {
        return nature;
    }

    public void setNature(Nature nature) {
        this.nature = nature;
    }

    public Rubrique getRubrique() {
        return rubrique;
    }

    public void setRubrique(Rubrique rubrique) {
        this.rubrique = rubrique;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
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
