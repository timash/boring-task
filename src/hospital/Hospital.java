
package hospital;
import java.util.ArrayList;


public class Hospital {

   
    public static void main(String[] args) {
        SerializeObjects serializer = new SerializeObjects();
        ArrayList<Doctors> doctors = new ArrayList<Doctors>();
        ArrayList<Doctors> exp = new ArrayList<Doctors>();
        doctors.add(new Doctors(1234, "Sergey", "Ivanov", "surgeon"));
        doctors.add(new Doctors(125, "Maxim", "Petyxov", "surgeon"));
        serializer.serializeDoctor(doctors);
        exp = serializer.parsingDoctor();
        
         for (Doctors d: exp)
            System.out.println(d);
    }
   
}
