
package modelo;

import java.io.Serializable;


public class Empleado extends Persona implements Serializable{
    public static final long serialVersionUID = 1L;
    private double sueldo;
    private Sector sector;

    public Empleado(double sueldo, Sector sector, int dni, String nombre) {
        super(dni, nombre);
        this.sueldo = sueldo;
        this.sector = sector;
    }

    
 
    
    
    
    
    @Override
    public String toCSV() {
       return getDni() + "," + getNombre() + "," + sueldo + "," + sector.toString();
    }

    @Override
    public String toString() {
        return "Empleado{" + "sueldo=" + sueldo + ", sector=" + sector + '}';
    }

   
   
}
