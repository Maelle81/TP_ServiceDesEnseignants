package champollion;

public class UE {
    private final String myIntitule;
    public int heuresCM;
    public int heuresTD;
    public int heuresTP;

    public UE(String myIntitule, int heuresCM, int heuresTD, int heuresTP) {
        this.myIntitule = myIntitule;
        this.heuresCM = heuresCM;
        this.heuresTD = heuresTD;
        this.heuresTP = heuresTP;
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
    
    

    
}
