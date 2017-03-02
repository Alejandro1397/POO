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
public class Equipo {
    private static int numeroDeEquipo;
    private int numeroDeJugadores=5;
    private Jugador[] jugadores=new Jugador[numeroDeJugadores];
    private int jugadoresRestantes=numeroDeJugadores;
    private String nombre;
    private int indiceDelJugador=0;
    
    public Equipo() {
       this.incioDeVariables();
       this.nombre="Equipo "+(++numeroDeEquipo);
    }

    public Equipo(String nombre, Jugador[] jugadores) {
        this.nombre = nombre;
        this.incioDeVariables();
        this.jugadores=jugadores;
    }
    
    private void incioDeVariables() {
        for (int i = 0; i < jugadores.length; i++) {
            Jugador objeto = new Jugador();
            this.jugadores[i] = objeto;
        }
        
    }
    public void cambioDeValores(){
        this.indiceDelJugador++;
        this.jugadoresRestantes--;
    }

    public String getNombre() {
        return nombre;
    }

    public int getJugadoresRestantes() {
        return jugadoresRestantes;
    }
    
    public Jugador getJugador(){
        return this.jugadores[indiceDelJugador];
    }
      
}
