package champollion;

public class UE {
    private final String myIntitule;
    public int heuresCM;
    public int heuresTD;
    public int heuresTP;
    private Enseignant enseignant;
    private Intervention intervention;

    public UE(String myIntitule) {
        this.myIntitule = myIntitule;
        
    }
    
    public String getIntitule() {
        return myIntitule;
    }

    public int getHeuresCM() {
        return heuresCM;
    }

    public int getHeuresTD() {
        return heuresTD;
    }

    public int getHeuresTP() {
        return heuresTP;
    }

    public Enseignant getEnseignant() {
        return enseignant;
    }

    public Intervention getIntervention() {
        return intervention;
    }
    
    public void setHeuresCM(int heuresCM) {
        this.heuresCM = heuresCM;
    }

    public void setHeuresTD(int heuresTD) {
        this.heuresTD = heuresTD;
    }

    public void setHeuresTP(int heuresTP) {
        this.heuresTP = heuresTP;
    }
    
    

    
}
