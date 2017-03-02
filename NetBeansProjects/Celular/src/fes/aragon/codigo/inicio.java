/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.codigo;

import java.util.Scanner;

/**
 *
 * @author alejandro
 */
public class inicio {
    public static void main(String[] args) {
        Celular tel=new Celular();
        Scanner entrada=new Scanner(System.in);
        System.out.println("¿Cual es la marca de tu celular?:");
        String marca=entrada.nextLine();
        tel.setMarca(marca);
        System.out.println("¿Cual es el modelo de tu celular?:");
        String modelo=entrada.nextLine();
        tel.setModelo(modelo);
        System.out.println("¿Cual es el precio de tu celular?:");
        float precio=entrada.nextFloat();
        tel.setPrecio(precio);
        System.out.println("¿Cual es la capacidad de alamcenamiento de tu celular?:");
        String memoria=entrada.nextLine();
        tel.setMemoria(memoria);
        System.out.println("-----------------------------------------------------------");
        tel.muestraCaracteristicas();
    }
}
