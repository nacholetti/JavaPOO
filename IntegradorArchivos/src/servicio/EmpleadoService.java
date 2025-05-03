
package servicio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import modelo.Empleado;
import modelo.Sector;


public class EmpleadoService {
    
    
    public static void hardcodearEmpelados(List<Empleado> lista){
        
        lista.add(new Empleado(20.0000, Sector.VENTAS, 41258904, "Jose"));
        lista.add(new Empleado(60.0000, Sector.RRHH, 11464646, "Miguel"));
        lista.add(new Empleado(90.0000, Sector.SISTEMAS, 21489844, "Rocio"));
        lista.add(new Empleado(500.000, Sector.CONTABLE, 31584694, "Margot"));
    }
    
    
    public static void listarEmpleados(List<Empleado> lista){
        System.out.println("Listar empleados");
        
        for(Empleado e :lista){
            System.out.println(e);
        }
        
    }
    
    public static void guardarEmpleadosCSV(List<? extends Empleado> lista, String path){
        File archivo = new File(path);
        
        try(BufferedWriter bw  = new BufferedWriter(new FileWriter(archivo))){
            bw.write("sueldo,sector,dni,nombre");
            for(Empleado e: lista){
                bw.write(e.toCSV()+ "\n");
            }
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        
    }
    
    
    public static List<Empleado> cargarEmpleadosCSV(String path){
        
        List<Empleado> toReturn = new ArrayList<>();
        File archivo = new File(path);
        
        try(BufferedReader br = new BufferedReader(new FileReader(archivo))){
            String linea;
            br.readLine();
            while((linea =  br.readLine()) != null){
                if(linea.endsWith("\n")){
                linea = linea.substring(linea.length() -1);
                }
                
                String [] values = linea.split(",");
                if(values.length == 4){
                    int dni  = Integer.parseInt(values[0]);
                    String nombre = values[1];
                    double sueldo = Double.parseDouble(values[2]);
                    Sector sector = Sector.valueOf(values[3]);
                    
                    Empleado e = new Empleado(sueldo, sector, dni, nombre);
                    
                    toReturn.add(e);
                    
                    
                }
                
               
            }
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
         return toReturn;
    }
}
