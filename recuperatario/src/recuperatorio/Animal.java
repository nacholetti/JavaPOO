
package recuperatorio;

import java.util.Objects;


public abstract class Animal {
   private String nombre;
   private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
   
           @Override
    public int hashCode(){
        return Objects.hash(nombre,edad);
    }
    
    /*IMPLEMENTACION DEL EQUALS PARA SABER SI SE REPITEN LOS ATRIBUTOS */
    @Override
    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        }
        if (obj == null){
            return false;
        }
        if(obj instanceof Animal other ){
            return nombre.equals(other.nombre) && edad == other.edad;
        }
        
        return false;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
    
    
}
