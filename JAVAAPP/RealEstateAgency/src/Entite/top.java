/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Entite;

/**
 *
 * @author DELL
 */
public class top {
    public int nb;
    public String element;
   

    public top(int nbg, String gov) {
        this.nb= nbg;
        this.element = gov;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public void setNb(int nb) {
        this.nb = nb;
    }

    public String getElement() {
        return element;
    }

    public int getNb() {
        return nb;
    }

}
