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
    public boolean annulee  =false;
    private final int heureDebut;
    private final TypeIntervention type;
    private final Salle salle;
    private UE ue;
            
    //Constructeur

    public Intervention(Date date, int duree, int heureDebut, TypeIntervention type, Salle salle, UE ue) {
        this.date = date;
        this.duree = duree;
        this.heureDebut = heureDebut;
        this.type = type;
        this.salle = salle;
        this.ue = ue;
    }

    public Intervention(TypeIntervention type, UE ue, int duree) {
        this.date = new Date("30/11/2001");
        this.duree= duree;
        this.heureDebut = 9;
        this.type = type;
        this.salle = new Salle("019", 36);
        this.ue = ue;
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

    public TypeIntervention getType() {
        return type;
    }

    public UE getUe() {
        return ue;
    }

   
    
    
}
