/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.codigo;

/**
 *
 * @author alejandro
 */
public class Dado_2 {
    private int valorCara;

    public Dado_2() {
        this.valorCara=1;
    }

    public int getValorCara() {
        return valorCara;
    }
   public void tirar(){
       this.valorCara=(int)Math.random()*(1-16)+16;
   }
    
}
