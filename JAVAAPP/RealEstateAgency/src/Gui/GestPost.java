/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GestPost.java
 *
 * Created on 30 juin 2015, 15:10:19
 */
package Gui;

import Entite.Post;
import BLL.postService;
import java.util.ArrayList;
import BLL.postService;
import javax.swing.table.DefaultTableModel;
import Gui.MainGuiBuilder;

/**
 *
 * @author DELL
 */
public class GestPost extends javax.swing.JFrame {

    
    postService pService = new postService();
    Post updatePost ;
    /**
     * Creates new form GestPost
     */
    
    public GestPost(Post u) {
        initComponents();
        getValuesFromTable(u);
        

    }

    public void getValuesFromTable(Post u) {

       id.setText(String.valueOf(u.getId()));
        titre.setText(u.getTitre());
        text.setText(u.getText());
        dateCreation.setText(u.getDateCreation());
        gouvernorat.setSelectedItem(u.getGouvernorat());
        rubrique.setSelectedItem(u.getRubrique());
        nature.setSelectedItem(u.getNature());
        type.setSelectedItem(u.getType());
        prix.setText(String.valueOf(u.getPrix()));
        updatePost=u;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        titre = new javax.swing.JTextField();
        dateCreation = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        gouvernorat = new javax.swing.JComboBox();
        rubrique = new javax.swing.JComboBox();
        nature = new javax.swing.JComboBox();
        type = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        prix = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Titre");

        jLabel2.setText("ID");

        jLabel3.setText("Date creation");

        jLabel4.setText("Text");

        jLabel5.setText("Rubrique");

        jLabel6.setText("Nature");

        jLabel7.setText("Type");

        id.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Gestion Post");

        updateButton.setText("Update");
        updateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateButtonMouseClicked(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(255, 51, 51));
        deleteButton.setText("Supprimer");
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });

        jLabel9.setText("Gouvernorat");

        gouvernorat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ariana", "Béja", "Ben Arous", "Bizerte", "Gabès", "Gafsa", "Jendouba", "Kairouan", "Kasserine", "Kébili", "La Manouba", "Le Kef", "Mahdia", "Médenine", "Monastir", "Nabeul", "Sfax", "Sidi Bouzi", "Siliana", "Sousse", "Tataouine", "Tozeur", "Tunis", "Zaghouan" }));

        rubrique.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Offres", "Demandes" }));

        nature.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Achat", "Location", "Terrain", "Vente" }));

        type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Appartement", "Duplex", "Maison", "Terrain agricole", "Terrain nu" }));

        text.setColumns(20);
        text.setRows(5);
        jScrollPane1.setViewportView(text);

        jLabel10.setText("Prix");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(titre)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(gouvernorat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(dateCreation, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(id)
                                            .addComponent(rubrique, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(nature, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(type, 0, 199, Short.MAX_VALUE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jScrollPane1)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(deleteButton)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(69, 69, 69)
                .addComponent(prix, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(titre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateCreation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gouvernorat)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rubrique, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(340, 507));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        // TODO add your handling code here:
        pService.deletePost(updatePost);
        this.setVisible(false);
        MainGuiBuilder.PostTableUpdate();
    }//GEN-LAST:event_deleteButtonMouseClicked

    private void updateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseClicked
        // TODO add your handling code here:
        
        
        updatePost = new Post(Integer.parseInt(id.getText()), 
                titre.getText() ,
                text.getText(),
                 dateCreation.getText() , 
                 (String)gouvernorat.getSelectedItem() ,
                 (String)rubrique.getSelectedItem() ,
                 (String)nature.getSelectedItem() ,
                 (String)type.getSelectedItem() ,
                 Integer.parseInt(prix.getText()) );
        
        pService.updatePost(updatePost);
        this.setVisible(false);
        MainGuiBuilder.PostTableUpdate();
    }//GEN-LAST:event_updateButtonMouseClicked

  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dateCreation;
    private javax.swing.JButton deleteButton;
    private javax.swing.JComboBox gouvernorat;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox nature;
    private javax.swing.JTextField prix;
    private javax.swing.JComboBox rubrique;
    private javax.swing.JTextArea text;
    private javax.swing.JTextField titre;
    private javax.swing.JComboBox type;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables

}