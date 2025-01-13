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
    
    public Pion() {
        this.blanc = false;
    }

    public Pion(boolean blanc, Case c) {
        this.blanc = blanc;
    }

    public boolean isBlanc() {
        return blanc;
    }
    
    public void setBlanc(boolean blanc) {
        this.blanc = blanc;
    }
    
    public void avancer(){
        
    }
    
    public void manger(Pion p){
        
    }
    
}
