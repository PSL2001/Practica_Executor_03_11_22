/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_executor_03_11_22;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Coche> listaCoches = new ArrayList<>();
    
        listaCoches.add(new Coche("Seat Ibiza", Size.PEQUEÑO, Wash.NORMAL));    //10
        listaCoches.add(new Coche("VW Touran", Size.GRANDE, Wash.SUPER));       //20
        listaCoches.add(new Coche("Opel Zafira", Size.GRANDE, Wash.EXTRA));     //22
        listaCoches.add(new Coche("Renault Megane", Size.MEDIANO, Wash.SUPER)); //16

        listaCoches.sort((c1, c2) -> c2.getTiempoLavado().compareTo(c1.getTiempoLavado()));
       
        long tiempoIni = System.currentTimeMillis(); //Almacenamos tiempo inicial
        System.out.println(">>> INICIO Lavadero <<<");

        //Aquí pondremos el código para lanzar los hilos
        
        long tiempoTot = (System.currentTimeMillis()-tiempoIni)/1000; //Calculamos el tiempo total de ejecucion
        System.out.println("--- FIN Lavadero (Tiempo: "+tiempoTot+"s) ---");
    }
    
}
