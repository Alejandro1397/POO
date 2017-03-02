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
public class Celular {  
    private String marca;
    private String modelo;
    private float precio;
    private String memoria;

    public Celular() {  
       
        
    }

   

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }
    
    
  
    
    public void muestraCaracteristicas(){
        System.out.println("Marca:"+marca);
        System.out.println("Modelo:"+modelo);
        System.out.println("Precio"+precio);
        System.out.println("Memoria"+memoria);
    }
            
}
