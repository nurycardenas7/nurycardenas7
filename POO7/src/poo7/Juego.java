/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maquina
 */
public class Juego {
       protected Palabra LaPalabra; 
       
       public Juego(){
        LaPalabra = new Palabra(); 

       }
       
       public Palabra ObtenerPalabra(){
          LaPalabra.getPalabraElegida();
          LaPalabra.getLong();
          LaPalabra.llenarPalabraOculta();
          LaPalabra.compararPalabraOculta();
        return LaPalabra;
     }
       }
