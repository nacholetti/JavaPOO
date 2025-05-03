
 
package sistemaempleados;


public class EmpleadoSalariado extends Empleado {
    private float salarioMensual;

    public EmpleadoSalariado(float salarioMensual, String nombre, String apellido, String legajo) {
        super(nombre, apellido, legajo);
        this.salarioMensual = salarioMensual;
    }

    @Override
    public float calcularSalario() {
        return salarioMensual;
    }
    
    
    
    
}
