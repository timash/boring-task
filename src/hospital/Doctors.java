package hospital;

import java.io.Serializable;

public class Doctors implements Serializable {
    int id_doctor;
    String Name;
    String Surname;
    String Specialization;
    
    public Doctors(){
    
    }
   

    public Doctors(int id_doctor, String Name, String Surname,String Specialization) {
        this.id_doctor = id_doctor;
        this.Name = Name;
        this.Surname= Surname;
        this.Specialization = Specialization;
    }
    

   @Override
   public String toString(){
           return "id_doctors = "+ this.id_doctor + ", name = " + this.Name + ", surname = " + this.Surname + ", specialization = " + this.Specialization;
   }
}