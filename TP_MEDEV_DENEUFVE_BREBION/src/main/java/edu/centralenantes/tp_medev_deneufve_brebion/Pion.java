/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.centralenantes.tp_medev_deneufve_brebion;

/**
 *
 * @author benja
 */
public class Pion {
    private boolean blanc;
    private Case c;

    public Pion() {
        this.blanc = false;
        this.c = new Case(0,0);
    }

    public Pion(boolean estDame, boolean blanc, Case c) {
        this.blanc = blanc;
        this.c = c;
    }

    public boolean isBlanc() {
        return blanc;
    }

    public Case getCase() {
        return c;
    }
    
    public void setBlanc(boolean blanc) {
        this.blanc = blanc;
    }

    public void setCase(Case c) {
        this.c = c;
    }
    
    public void avancer(){
        
    }
    
    public void manger(Pion p){
        
    }
    
}
