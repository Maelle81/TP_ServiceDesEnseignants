/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package champollion;

/**
 *
 * @author Maell
 */
public class Salle {
    
    //Attributs
    public String intitule;
    public int capacite;

    //Constructeur
    public Salle(String intitule, int capacite) {
        this.intitule = intitule;
        this.capacite = capacite;
    }

    //Getters
    public int getCapacite() {
        return capacite;
    }

    public String getIntitule() {
        return intitule;
    }
    
    
}
