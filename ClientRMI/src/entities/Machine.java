/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;

public class Machine implements Serializable{
    private static final long serialVersionUID = -6203223276774208098L;
    
    private int id;
    private String ref;
    private String matque;
    private double prix ;
    private Salle salle;

    public Machine() {
    }

    public Machine(String ref, String matque, double prix) {
        this.ref = ref;
        this.matque = matque;
        this.prix = prix;
    }

    public Machine(String ref, String matque, double prix, Salle salle) {
        this.ref = ref;
        this.matque = matque;
        this.prix = prix;
        this.salle = salle;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getMatque() {
        return matque;
    }

    public void setMatque(String matque) {
        this.matque = matque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
    
}
