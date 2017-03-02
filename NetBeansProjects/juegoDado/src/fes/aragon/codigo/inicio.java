/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.codigo;

import java.util.Locale;

/**
 *
 * @author root
 */
public class inicio {
    public static void main(String[] args) {
        Locale local=new Locale("es", "MX");
        local.setDefault(local);//Cambia el idioma del paìs.
        Dado[] jugadores=new Dado[30];
        int numeroJugadores=30; //variable para sallir del juego
        int indice=0;
        for (int i = 0; i < jugadores.length; i++) {
            Dado objeto=new Dado();
            jugadores[i]=objeto;
        }
        do{
            if(jugadores[indice].isVuelvesATirar()){
                jugadores[indice].tirar();
                if((jugadores[indice].getValorCara()%2) !=0){
                    jugadores[indice].setVuelvesATirar(false);
                    numeroJugadores--;
                }
            }
            indice++;
            if(indice>29){
                indice=0;
            }
        }while(numeroJugadores>5);
        
        int numJugador=0;
        for (Dado jugador : jugadores) {
            if(!jugador.isVuelvesATirar()){
                System.out.println("Num. Jugador "+
                        numJugador+ " Valor: "+
                        jugador.getValorCara());
            }
            numJugador++;
        }
        System.out.println("-------------------------");
        numJugador=0;
        for (Dado jugador : jugadores) {
            if(jugador.isVuelvesATirar()){
                System.out.println("Num. Jugador "+
                        numJugador+ " Valor: "+
                        jugador.getValorCara());
            }
            numJugador++;
        }
    } 
}
