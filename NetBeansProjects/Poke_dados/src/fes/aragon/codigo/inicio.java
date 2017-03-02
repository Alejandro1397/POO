/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.codigo;

/**
 *
 * @author root
 */
public class inicio {
    public static void main(String[] args) {
        Jugador jugadorUno=new Jugador();
        Jugador jugadorDos=new Jugador();
        do{
           int j1=jugadorUno.tirar();
           int j2=jugadorDos.tirar();
           if(j1>j2){
               
           }
        }while(jugadorUno.getDadosValidios() !=0 && jugadorDos.getDadosValidios() !=0);
    }
    
}
