/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo7;

import java.util.*;

/**
 *
 * @author maquina
 */
public class Controlador {
    protected Juego Juego;
    protected Vista UnaVista;
    
    public Controlador(){
    Vista unaVista = new Vista();
    //unaVista.setVisible(true);
    }
      
    public void Run(){        
        Juego ElJuego = new Juego();
        
       // ElJuego.ObtenerPalabra();
        System.out.println(ElJuego.ObtenerPalabra().PalabraOculta);
         }

}
