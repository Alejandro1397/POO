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
public class inicio {
    public static void main(String[] args) {
        Moneda mon=new Moneda();
        mon.lanzar();
        if(mon.getValorCara()==1){
            System.out.println("Cara");
        }else{
            System.out.println("cruz");
        }
    }
}
