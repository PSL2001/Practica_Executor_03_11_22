/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_executor_03_11_22;

/**
 *
 * @author usuario
 */
class Coche {
     public enum Size {
        PEQUEÑO,
        MEDIANO,
        GRANDE
    }
    
    public enum Wash {
        NORMAL,
        EXTRA,
        SUPER
    }

    private String nombre;
    private Size size;
    private Wash wash;
    private int tiempoLavado=10;
    
    Coche(String nombre, Size size, Wash wash){
        this.nombre = nombre;
        this.size=size;
        this.wash=wash;

        switch (wash) {
            case SUPER:
                tiempoLavado+=2;
                break;
            case EXTRA:
                tiempoLavado+=4;
                break;
        }
                
        switch (size) {
            case MEDIANO: 
                tiempoLavado+=4;
                break;
            case GRANDE: 
                tiempoLavado+=8;
                break;
        }
    }
    
    public Integer getTiempoLavado() {
        return tiempoLavado;
    }
    
    public String getNombre(){
        return nombre;
    }
}
