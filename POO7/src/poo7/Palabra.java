/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo7;

/**
 *
 * @author maquina
 */
import java.util.*;
import java.math.*;

public class Palabra {
     protected List<String> ListaDePalabras;
     protected Integer Long;
     protected String LetraIngresada = "A";
     protected String PalabraElegida;
     protected String LetraEnLaPalabra;
     
        
        
        
         public Palabra(){
            ListaDePalabras = new ArrayList<>();
            ListaDePalabras.add("PALA");
            ListaDePalabras.add("OTORRINOLARINGOLOGO");
            ListaDePalabras.add("VENEZUELA");
            ListaDePalabras.add("SUPERVISORA");
            ListaDePalabras.add("ESPERMOGRAMA");
            ListaDePalabras.add("CORCHETE");
            ListaDePalabras.add("XENOFOBIA");
            ListaDePalabras.add("DESCOMPUESTO");
         }
        
        public String getPalabraElegida(){
            /*con este metodo eligo una palabra de la lista oara que la persona lo adivine
            en la variable max defino al maximo como el tamaño de la lista
            y en palabra elegida uso el metodo get math random por el maximo de la lista ese recorre
            toda la lista y elige aleatoriamente un valor.*/
            int max =ListaDePalabras.size();
           PalabraElegida = ListaDePalabras. get((int)(Math.random()*max));
                return PalabraElegida;
        }
        
        public Integer getLong(){
            //con este metodo obtengo la longitud de la palabra.
            Long = PalabraElegida.length();
            return Long;
        }
        
        public void LetraDePalabra(){    
        for (int i = 0; i<Long; i++){
         LetraEnLaPalabra = PalabraElegida.substring(i);
         if (LetraEnLaPalabra.equals(LetraIngresada)){
             System.out.println(LetraEnLaPalabra);
        }
        }
}
}

