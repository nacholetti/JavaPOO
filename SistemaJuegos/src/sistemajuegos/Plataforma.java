
package sistemajuegos;


public class Plataforma {
   private String nombre;

    public Plataforma(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void cargar(String nombreJuego){
        
        nombre = nombreJuego;
        System.out.println("Cargando....." + nombreJuego + " en " + nombre);
    }
}
