
package sistemaempleados;

public class EmpleadoPorHoras extends Empleado {
    private float horasTrabajadas;
    private float tarifaPorHora;

    public EmpleadoPorHoras(float horasTrabajadas, float tarifaPorHora, String nombre, String apellido, String legajo) {
        super(nombre, apellido, legajo);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public float calcularSalario() {
        return horasTrabajadas * tarifaPorHora;
    }

   
    
}
