
package integradorarchivos;

import java.util.ArrayList;
import java.util.List;
import modelo.Empleado;
import servicio.EmpleadoService;

import static config.AppConstans.PATH_CSV;
import static config.AppConstans.PATH_SERIAL;
import java.io.IOException;
import servicio.Serializadora;


public class Test {

    
    public static void main(String[] args) throws IOException {
       
        
        List<Empleado>  empleados = Serializadora.deserializarEmpleados(PATH_SERIAL);
        
        
        Serializadora.serializarEmpleados(empleados, PATH_SERIAL);
       // EmpleadoService.hardcodearEmpelados(empleados);
        
        //EmpleadoService.guardarEmpleadosCSV(empleados, PATH_CSV);
        
        EmpleadoService.listarEmpleados(empleados);
        
        
        
    }
    
}
