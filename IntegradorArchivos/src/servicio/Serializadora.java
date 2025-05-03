
package servicio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import modelo.Empleado;


public class Serializadora {
    public static void serializarEmpleados(List<? extends Empleado> lista, String path) throws FileNotFoundException, IOException{
        
        try(ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(path))){
            salida.writeObject(lista);
        }catch(IOException ex){
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
    }
    
    
    public static List<Empleado>deserializarEmpleados(String path){
        
        List<Empleado>toReturn = null;
        try(ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(path))){
            
            toReturn = (List<Empleado>) entrada.readObject();
        
        
        }catch(IOException | ClassNotFoundException ex){
            
            System.out.println(ex.getMessage());
        }
        
        return toReturn;
    }
        
        
       
    
}
