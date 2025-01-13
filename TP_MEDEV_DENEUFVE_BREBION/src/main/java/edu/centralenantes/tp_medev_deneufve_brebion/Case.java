/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.centralenantes.tp_medev_deneufve_brebion;

/**
 *
 * @author benja
 */
public class Case {
    private int x;
    private int y;

    /**
     * Constructeur pour créer un point avec des coordonnées spécifiques.
     * 
     * @param x la coordonnée x du point
     * @param y la coordonnée y du point
     */
    public Case(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Définit la coordonnée x du point.
     * 
     * @param x la nouvelle coordonnée x
     */
    public void setx(int x) {
        this.x = x;
    }
    
    /**
     * Définit la coordonnée y du point.
     * 
     * @param y la nouvelle coordonnée y
     */
    public void sety(int y) {
        this.y = y;
    }

    /**
     * Obtient la coordonnée x du point.
     * 
     * @return la coordonnée x
     */
    public int getx() {
        return x;
    }

    /**
     * Obtient la coordonnée y du point.
     * 
     * @return la coordonnée y
     */
    public int gety() {
        return y;
    }

    /**
     * Définit la position du point avec de nouvelles coordonnées.
     * 
     * @param x la nouvelle coordonnée x
     * @param y la nouvelle coordonnée y
     */
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Translate le point selon un déplacement donné.
     * 
     * @param dx le déplacement sur l'axe x
     * @param dy le déplacement sur l'axe y
     */
    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }

    /**
     * Affiche les coordonnées du point.
     */
    public void affiche() {
        System.out.println("x= " + x + " y= " + y); 
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Case other = (Case) obj;
        if (this.x != other.x) {
            return false;
        }
        return this.y == other.y;
    }

}