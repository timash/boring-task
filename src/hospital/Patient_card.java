package hospital;

import java.io.Serializable;

public class Patient_card implements Serializable  {
    int id_card;
    int id_patient;
    String Name;
    String Surname;
    String blood;
    String birth;

    public Patient_card() {
    }

    public Patient_card(int id_card, int id_patient, String Name, String Surname, String blood, String birth) {
        this.id_card = id_card;
        this.id_patient = id_patient;
        this.Name = Name;
        this.Surname = Surname;
        this.blood = blood;
        this.birth = birth;
    }
    
    
    
}
