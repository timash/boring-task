package hospital;
import java.io.Serializable;


public class Treatments implements Serializable {
    int id_treatments;
    String diagnosis;
    String medicines;

    public Treatments() {
    }

    public Treatments(int id_treatments, String diagnosis, String medicines) {
        this.id_treatments = id_treatments;
        this.diagnosis = diagnosis;
        this.medicines = medicines;
    }
    
    
}
