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
        Dado_2 dado=new Dado_2();
        dado.tirar();
        if((dado.getValorCara()%2)==0){
            System.out.println("Gano");
        }else{
            System.out.println("Perdio");
        }
        System.out.println("La cara del dado es "+dado.getValorCara());
    }
    
}
