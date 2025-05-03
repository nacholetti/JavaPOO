
package sistemaempleados;


public class Empleado {
    private String nombre;
    private String apellido;
    private String legajo;

    public Empleado(String nombre, String apellido, String legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }
    
    public float calcularSalario(){
        
        return 0.0f;
    }
    
    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre + " " + "Apellido: " + apellido + "legajo: " + legajo );
    }
}
