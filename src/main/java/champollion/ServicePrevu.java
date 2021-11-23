package champollion;

public class ServicePrevu {
	// TODO : implémenter cette classe
    private final UE myUE;
    private final Enseignant myTeacher;
    
    public int volumeCM;
    public int volumeTD;
    public int volumeTP;

    public ServicePrevu(UE myUE, Enseignant myTeacher, int volumeCM, int volumeTD, int volumeTP) {
        this.myUE = myUE;
        this.myTeacher = myTeacher;
        this.volumeCM = volumeCM;
        this.volumeTD = volumeTD;
        this.volumeTP = volumeTP;
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
    
    
}
