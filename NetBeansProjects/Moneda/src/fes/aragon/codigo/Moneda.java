/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.codigo;

import java.util.Random;

/**
 *
 * @author alejandro
 */
public class Moneda {
    private int valorCara;
   

    public Moneda() {
        this.valorCara=1;
    }

   // public boolean isCara() {
     //   return cara;
    //}
    
    public void lanzar(){
        Random ale=new Random();
        this.valorCara=(int)(ale.nextDouble()*2+1);
    }

    public int getValorCara() {
        return valorCara;
    }
   // public void cambioDeValor(){   
    //}
    
}
