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
    
    @Override
    public String toString(){
           return "id_treatments = "+ this.id_treatments + ", diagnosis = " + this.diagnosis + ", medicines = " + this.medicines;
   }
}
