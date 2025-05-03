package menucafetera;

/*Atributos:


boolean encendida


String tamañoTaza (valores posibles: "chica", "mediana", "grande")


boolean tazaLlena


Métodos:


void encender(), void apagar()


void seleccionarTamaño(String tamaño)


void servirCafe(): llena la taza si la cafetera está encendida


String getEstado(): devuelve estado actual como String
 */
public class Cafetera {

    private boolean encendida;
    private String tamanioTaza;
    private boolean tazaLlena;

    public Cafetera() {
        this.encendida = false;
        this.tamanioTaza = "chica";
        this.tazaLlena = false;
    }

    public void encender() {
        if (!encendida) {
            encendida = true;
        }
    }

    public void apagar() {
        if (encendida) {
            encendida = false;
        }
    }

    public void seleccionarTamanio(String tamanio) {
        if (tamanioTaza.equalsIgnoreCase("chica")
                || tamanioTaza.equalsIgnoreCase("grande")) {
            tamanioTaza = tamanio;
        }
        System.out.println("Tamaño seleccionado " + tamanioTaza);
    }

    public void servirCafe() {

        if(encendida){
            System.out.println("Taza llena.....");
            tazaLlena = true;
        } else {
            System.out.println("La cafetera esta apagada..");
        }

    }

    public String getEstado(){
        return "Encendida: " + encendida +
               ", Tamaño de taza: " + tamanioTaza +
               ", Taza llena: " + tazaLlena;
    }

    boolean estaEncendido() {
        return encendida;
    }

}
