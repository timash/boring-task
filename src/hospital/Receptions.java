package hospital;
import java.io.Serializable;


 
public class Receptions implements Serializable { 
    int id_reception;
    int id_doctor;
    int id_card;
    int id_course;
    String name_doctor;
    String surname_doctor;
    String name_patient;
    String surname_patient;
    String diagnosis;
    String date;

    public Receptions() {
    }

    
    
    public Receptions(int id_reception, int id_doctor, int id_card, int id_course, String name_doctor, String surname_doctor, String name_patient, String surname_patient, String diagnosis, String date) {
        this.id_reception = id_reception;
        this.id_doctor = id_doctor;
        this.id_card = id_card;
        this.id_course = id_course;
        this.name_doctor = name_doctor;
        this.surname_doctor = surname_doctor;
        this.name_patient = name_patient;
        this.surname_patient = surname_patient;
        this.diagnosis = diagnosis;
        this.date = date;
    }
    
}

