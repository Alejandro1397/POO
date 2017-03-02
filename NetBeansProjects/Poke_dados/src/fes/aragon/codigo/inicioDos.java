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
public class inicioDos {
    public static void main(String[] args) {
        Jugador j1=new Jugador("Maria");
        Jugador j2=new Jugador("Juan");
        Jugador j3=new Jugador("Pedro");
        Jugador j4=new Jugador("Tomas");
        Jugador j5=new Jugador("Nadia");
        Jugador[] jugadores={j1, j2, j3, j4, j5};
        Equipo equipoUno=new Equipo("Pumitas", jugadores);
        Equipo equipoDos=new Equipo();
        do{
            do{
                int eq1=equipoUno.getJugador().tirar();
                int eq2=equipoDos.getJugador().tirar();
                if(eq1 > eq2){
                    equipoDos.getJugador().cambioDeValores();
                    System.out.println(equipoDos.getJugador().getNombre() + "Gano a " + equipoUno.getJugador().getNombre());
                }else if(eq1 < eq2){
                    equipoUno.getJugador().cambioDeValores();
                    System.out.println(equipoUno.getJugador().getNombre() + "Gano a " + equipoDos.getJugador().getNombre());
                }else{
                    System.out.println("Empate");
                }
            }while(equipoUno.getJugador().getDadosValidios() !=0 && equipoDos.getJugador().getDadosValidios()!=0);
            if(equipoUno.getJugador().getDadosValidios() !=0){
                System.out.println("Ganador "+ equipoUno.getJugador().getNombre());
                equipoDos.cambioDeValores();
            }else{
                System.out.println("Ganador "+ equipoDos.getJugador().getNombre());
                equipoUno.cambioDeValores();
            }
            System.out.println("------------------------------------------");
        }while(equipoUno.getJugadoresRestantes()!=0 && equipoDos.getJugadoresRestantes()!=0);
        System.out.println("****************************************");
        if(equipoUno.getJugadoresRestantes() !=0 ){
            System.out.println("Ganador " + equipoUno.getNombre());
        }else{
            System.out.println("Ganador " + equipoDos.getNombre());
        }
    }
    
}
