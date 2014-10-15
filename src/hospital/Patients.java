package hospital;


public class Patients {
   int id_patient;
   String Name;
   String Surname;
   String residence;
   String phone;

    public Patients() {
    }

    public Patients(int id_patient, String Name, String Surname, String residence, String phone) {
        this.id_patient = id_patient;
        this.Name = Name;
        this.Surname = Surname;
        this.residence = residence;
        this.phone = phone;
    }
   
   public String toString(){
           return "id_patient = "+ this.id_patient + ", Name = " + this.Name + ", Surname = " + this.Surname + ", residence = " + this.residence + ",phone = " + this.phone;
   }
    
}
