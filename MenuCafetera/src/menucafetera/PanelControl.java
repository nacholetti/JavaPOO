package menucafetera;

public class PanelControl {

    private Cafetera cafetera;

    public PanelControl(Cafetera cafetera) {
        this.cafetera = cafetera;
    }

    public void presionarEncendido() {
        if (cafetera.estaEncendido()) {
            cafetera.apagar();
            System.out.println("La cafetera fue apagada");
        } else {
            cafetera.encender();
            System.out.println("La cafetera fue encendida..");
        }
    }

    public void elegirTamanio(String tamanio) {
        cafetera.seleccionarTamanio(tamanio);
    }

    public void prepararCafe() {
        cafetera.servirCafe();
    }

  
    public void mostrarEstado(){
        System.out.println(cafetera.getEstado());
    }
    
    

}
