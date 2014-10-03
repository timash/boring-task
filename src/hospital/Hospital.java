
package hospital;


public class Hospital {

   
    public static void main(String[] args) {
        SerializeObjects serializeobjects = new SerializeObjects();
        serializeobjects.serializeDoctor(1234, "Сергей","Иванов" , "хирург");
        serializeobjects.parsingDoctor();
    }
    
}
