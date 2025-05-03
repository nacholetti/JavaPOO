
package sistemaempleados;

import java.util.ArrayList;

public class SistemaEmpleados {

  
    public static void main(String[] args) {
      EmpleadoPorHoras EmpleadoHoras = new EmpleadoPorHoras(200, 200, "Ignacio", "Lettini", "8514");
      EmpleadoSalariado EmpleadoSal = new EmpleadoSalariado(250250, "Josefina", "Louzan", "2416");
      ArrayList<Empleado> empleados = new  ArrayList<>();
      
      empleados.add(EmpleadoHoras);
      empleados.add(EmpleadoSal);
      
      for(Empleado e: empleados){
          e.mostrarInformacion();
          System.out.println(e.calcularSalario());
      }
      
    }
    
}
