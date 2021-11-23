/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package champollion;
import java.util.*;
/**
 *
 * @author Maell
 */
public class Intervention {
    
    //Attributs
    public Date date;
    public int duree;
    public boolean annulee =false;
    private int heureDebut;

    //Constructeur
    public Intervention(Date date, int duree, int heureDebut) {
        this.date = date;
        this.duree = duree;
        this.heureDebut = heureDebut;
    }
    
    //Getter
    public Date getDate() {
        return date;
    }

    public int getDuree() {
        return duree;
    }

    public boolean isAnnulee() {
        return annulee;
    }

    public int getHeureDebut() {
        return heureDebut;
    }
    
    
}
