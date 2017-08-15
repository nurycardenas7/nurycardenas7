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
     protected List<String> ListaDeLetras;
     
     
        
        
        
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
            ListaDeLetras = new ArrayList();

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
        
        public List getListaDeLetras(){ 
        //if (!ListaDeLetras.contains(LetraIngresada)){
         //   System.out.println("-");
        for (int i = 0; i<Long; i++){
         ListaDeLetras.add(PalabraElegida.substring(i,i+1));
        
         //if (ListaDeLetras.contains(LetraIngresada)){
         // System.out.println(ListaDeLetras.get(i));
          if (ListaDeLetras.get(i).equalsIgnoreCase(LetraIngresada)){
              System.out.println(ListaDeLetras.get(i));
              } else{             
                 System.out.println("-");}
                 }
         return ListaDeLetras;
        }
}        

        
        
        
        
        
