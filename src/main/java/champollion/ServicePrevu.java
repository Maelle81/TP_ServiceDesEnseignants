package champollion;

public class ServicePrevu {
	    
    public int volumeCM;
    public int volumeTD;
    public int volumeTP;
    private UE ue;
    private Enseignant enseignant;

    public ServicePrevu(int volumeCM, int volumeTD, int volumeTP, UE ue, Enseignant enseignant) {
        this.volumeCM = volumeCM;
        this.volumeTD = volumeTD;
        this.volumeTP = volumeTP;
        this.ue = ue;
        this.enseignant = enseignant;
    }     

    public int getVolumeCM() {
        return volumeCM;
    }

    public int getVolumeTD() {
        return volumeTD;
    }

    public int getVolumeTP() {
        return volumeTP;
    }

    public UE getUe() {
        return ue;
    }

    public Enseignant getEnseignant() {
        return enseignant;
    }

    
    
}
