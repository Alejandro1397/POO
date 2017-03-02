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
public class Jugador {
    private static int numeroDeJugadores;
    private int numeroDados=3;
    private Dado[] dados=new Dado[numeroDados];
    private String nombre;
    private int dadosValidios=numeroDados;
    private int indiceDelDado=0;

    public Jugador() {
       this.incioDeVariables();
       this.nombre="Jugador "+numeroDeJugadores++;
    }

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.incioDeVariables();
    }
    public int tirar(){
        this.dados[indiceDelDado].tirar();
        return this.dados[indiceDelDado].getValorCara();
    }
    
    private void incioDeVariables(){
        for (int i = 0; i < dados.length; i++) {
            Dado objeto=new Dado();
            this.dados[1]=objeto;
        }
    }
    public void cambioDeValores(){
        this.indiceDelDado++;
        this.dadosValidios--;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDadosValidios() {
        return dadosValidios;
    }
    
    
}
