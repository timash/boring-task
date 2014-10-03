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
    



   /* public void setIdDoctor(int id_goods){
        this.id_goods = id_goods;
    }
    
    public void setNamegood(String name){
        this.namegood = namegood;
    }
    
    public void setAmountgood(int amountgood){
        this.amountgood = amountgood;
    }
    
    public void setCostgood(float costgood){
        this.costgood = costgood;
    }
    
    public void setManufacturer (String manufacturer){
        this.manufacturer = manufacturer;
    }
    
    public int getIdGoods (){
        return this.id_goods;
    }
    
    public String getNamegood(){
        return this.namegood;
    }
    
    public float getCostgood(){
        return this.costgood;
    }
    
    public String getManufacturer(){
        return this.manufacturer;
    }
    */
}