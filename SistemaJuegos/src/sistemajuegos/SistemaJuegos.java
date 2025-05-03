
package sistemajuegos;


public class SistemaJuegos {

    
    public static void main(String[] args) {
       Consola unaConsola = new Consola("UnaConsola");
       Plataforma p = new Plataforma("PC");
       p.cargar("Aventura");
       unaConsola.cargar("Aventura");
    }
    
}
