
package sistemajuegos;


public class Consola extends Plataforma {

    public Consola(String nombre) {
        super(nombre);
    }

    @Override
    public void cargar(String nombreJuego) {
        System.out.println("Insertando cartucho y cargando" + nombreJuego + " en la consola " + getNombre());
    }
    
    
}
