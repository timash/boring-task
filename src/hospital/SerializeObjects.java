package hospital;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

//класс, который читает и записывает объекты
public class SerializeObjects{   

    /*метод который сохраняет объект в файл, каждый объект это и есть отдельная 
    таблица в данном случае это таблица "Докторы"*/
    
    public void serializeDoctor (int id_doctor, String Name, String Surname, String Specialization){
        
        Doctors doctor = new Doctors(id_doctor, Name, Surname,Specialization);
      //  Сделаю в дальнейшем, чтобы отдельная таблица была в своем листе
        //ArrayList<Doctors> doc = new ArrayList<Doctors>();
       // doc.add(doctor);
        try{
            FileOutputStream fileOut = new FileOutputStream("Doctor.qx");//запись в типизированный файл объекта
            ObjectOutputStream oos = new ObjectOutputStream (fileOut);
            oos.writeObject (doctor);
        }
        catch(Exception e){
            e.printStackTrace();
      }        
    }   
    
    //чтение уже записанного объекта и вывод в консоль для примера
    public void parsingDoctor(){
        try{
            FileInputStream localFileInputStream = new FileInputStream("Doctor.qx");//чтение из типизированного файла
            ObjectInputStream localObjectInputStream = new ObjectInputStream(localFileInputStream);
            

            Doctors doctor = (Doctors)localObjectInputStream.readObject();
                       

            //Вывод в консоль для примера работы с  типизаированным файлом
            System.out.println("ИД доктора:");
            System.out.println(doctor.id_doctor);
            
            System.out.println("Имя доктора:");
            System.out.println(doctor.Name);
            
            System.out.println("Фамилия доктора:");
            System.out.println(doctor.Surname);
            
            System.out.println("Специализация доктора:");
            System.out.println(doctor.Specialization);
        } catch(Exception ex ) {
            ex.printStackTrace();
        }        
    }
    
    //Дальнейшие объекты аналогично читаем и записываем
    public void serializeReceptions (int id_reception, int id_doctor, int id_card, int id_course, String name_doctor, String surname_doctor, String name_patient, String surname_patient, String diagnosis, String date){
        
        Receptions receptions = new Receptions(id_reception, id_doctor, id_card, id_course, name_doctor, surname_doctor, name_patient, surname_patient, diagnosis, date);
     
        try{
            FileOutputStream fileOut = new FileOutputStream("Reception.qx");
            ObjectOutputStream oos = new ObjectOutputStream (fileOut);
            oos.writeObject (receptions);
        }
        catch(Exception e){
            e.printStackTrace();
      }        
    }   
    
    public void parsingReceptions(){
        try{
            FileInputStream localFileInputStream = new FileInputStream("Reception.qx");
            ObjectInputStream localObjectInputStream = new ObjectInputStream(localFileInputStream);
            Receptions receptions = (Receptions)localObjectInputStream.readObject();
                      

            System.out.println(receptions.name_doctor);
            System.out.println(receptions.surname_doctor); 
            System.out.println(receptions.name_patient);
        } catch(Exception ex ) {
            ex.printStackTrace();
        }        
    }
    
      public void serializeTreatments(int id_treatments, String diagnosis, String medicines){
        
        Treatments treatments = new Treatments(id_treatments, diagnosis, medicines);
        
        try{
            FileOutputStream fileOut = new FileOutputStream("Treatments.qx");
            ObjectOutputStream oos = new ObjectOutputStream (fileOut);
            oos.writeObject (treatments);
        }
        catch(Exception e){
            e.printStackTrace();
      }        
    }   
    
    public void parsingTreatments(){
        try{
            FileInputStream localFileInputStream = new FileInputStream("Treatments.qx");
            ObjectInputStream localObjectInputStream = new ObjectInputStream(localFileInputStream);
            Treatments treatments = (Treatments)localObjectInputStream.readObject();
                       
            System.out.println(treatments.id_treatments);
            System.out.println(treatments.medicines); 
        } catch(Exception ex ) {
            ex.printStackTrace();
        }        
    }
    
    public void serializePatient_card (int id_card, int id_patient, String Name, String Surname, String blood, String birth){
        
        Patient_card patient_card = new Patient_card(id_card, id_patient, Name, Surname, blood, birth);
        
        try{
            FileOutputStream fileOut = new FileOutputStream("Patient_card.qx");
            ObjectOutputStream oos = new ObjectOutputStream (fileOut);
            oos.writeObject (patient_card);
        }
        catch(Exception e){
            e.printStackTrace();
      }        
    }   
    
    public void parsingPatient_card(){
        try{
            FileInputStream localFileInputStream = new FileInputStream("Patient_card.qx");
            ObjectInputStream localObjectInputStream = new ObjectInputStream(localFileInputStream);
            Patient_card patient_card = (Patient_card)localObjectInputStream.readObject();
                  
            System.out.println(patient_card.Name);
            System.out.println(patient_card.Surname); 
            System.out.println(patient_card.birth);
        } catch(Exception ex ) {
            ex.printStackTrace();
        }        
    }
    
    public void serializePatients (int id_card, int id_patient, String Name, String Surname, String blood, String birth){
        
        Patients patients = new Patients(id_patient, Name, Surname, birth, blood);
        
        try{
            FileOutputStream fileOut = new FileOutputStream("Patients.qx");
            ObjectOutputStream oos = new ObjectOutputStream (fileOut);
            oos.writeObject(patients);
        }
        catch(Exception e){
            e.printStackTrace();
      }        
    }   
    
    public void parsingPatients(){
        try{
            FileInputStream localFileInputStream = new FileInputStream("Patients.qx");
            ObjectInputStream localObjectInputStream = new ObjectInputStream(localFileInputStream);
         
            Patients patients = (Patients)localObjectInputStream.readObject();
              
            System.out.println(patients.Name);
            System.out.println(patients.Surname); 
            System.out.println(patients.phone);
        } catch(Exception ex ) {
            ex.printStackTrace();
        }        
    }
    
}