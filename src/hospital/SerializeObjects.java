package hospital;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

//класс, который читает и записывает объекты
public class SerializeObjects{   

    
    
    public void serializeDoctor (ArrayList<Doctors> doctors){
        try{
            FileOutputStream fileOut = new FileOutputStream("Doctor.qx");
            ObjectOutputStream oos = new ObjectOutputStream (fileOut);
            oos.writeObject(doctors);
            oos.close();
            fileOut.close();
        }
        catch(Exception e){
            e.printStackTrace();
      }        
    }   
    
    public ArrayList<Doctors> parsingDoctor(){
        ArrayList<Doctors> doctors = new ArrayList<Doctors>();
        try{
            FileInputStream filein = new FileInputStream("Doctor.qx");
            ObjectInputStream input = new ObjectInputStream(filein);
            doctors = (ArrayList<Doctors>)input.readObject();
            input.close();
            filein.close();
        } catch(Exception ex ) {
            ex.printStackTrace();
        }    
        return doctors;
    }
    
    
    public void serializeTreatments (ArrayList<Treatments> treatments){
        try{
            FileOutputStream fileOut = new FileOutputStream("Treatments.qx");
            ObjectOutputStream oos = new ObjectOutputStream (fileOut);
            oos.writeObject(treatments);
            oos.close();
            fileOut.close();
        }
        catch(Exception e){
            e.printStackTrace();
      }        
    }   
    
    public ArrayList<Treatments> parsingTreatments(){
        ArrayList<Treatments> treatments = new ArrayList<Treatments>();
        try{
            FileInputStream filein = new FileInputStream("Treatments.qx");
            ObjectInputStream input = new ObjectInputStream(filein);
            treatments = (ArrayList<Treatments>)input.readObject();
            input.close();
            filein.close();
        } catch(Exception ex ) {
            ex.printStackTrace();
        }    
        return treatments;
    }
    
}