/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.codigo;

import java.util.Random;

/**
 *
 * @author root
 */
public class Dado {
    private int valorCara;
    private boolean VuelvesATirar;

    public Dado() {
        this.valorCara=1;
        this.VuelvesATirar=true;
    }

    public int getValorCara() {
        return valorCara;
    }

    public boolean isVuelvesATirar() {
        return VuelvesATirar;
    }

    public void setVuelvesATirar(boolean VuelvesATirar) {
        this.VuelvesATirar = VuelvesATirar;
    }
    
    
    public void tirar(){
        Random ale=new Random();
        this.valorCara=(int)(ale.nextDouble()*6+1);
    }
    
}
