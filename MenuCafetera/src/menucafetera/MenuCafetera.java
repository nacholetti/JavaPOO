
package menucafetera;

import java.util.Scanner;


public class MenuCafetera {

 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Cafetera nespresso = new Cafetera();
        PanelControl panel = new PanelControl(nespresso);
        
        int opcion;
        
        do{
            System.out.println("----PANEL DE CONTROL CAFETERA-----");
            System.out.println("1.Encender/Apagar");
            System.out.println("2.Elegir tamaño");
            System.out.println("3.Preparar cafe");
            System.out.println("4.Mostrar estado");
            System.out.println("5.Salir");
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                    panel.presionarEncendido();
                    break;
                case 2:
                    System.out.println("Ingrese el tamaño");
                    String tamanio = sc.next();
                    panel.elegirTamanio(tamanio);
                    break;
                case 3:
                    panel.prepararCafe();
                    break;
                case 4:
                    panel.mostrarEstado();
                    break;
                case 5:
                    System.out.println("Saliendo del panel de control..");
                    break;
                default:
                    System.out.println("Opcion invalida");
                      
            }

        }while(opcion !=0);
        
        sc.close();
    }
    
}
