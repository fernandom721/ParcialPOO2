/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Razas;
import Jugadores.Jugador;
/**
 *
 * @author Fernando Martínez
 */
public class RazaHumano implements Raza{
    private String raza;
    Jugador jugador1 = new Jugador();
    @Override
    public void Raza() {
        
        jugador1.setHp(200);
        
        
        raza="Humana";
        System.out.println("Tu raza es humano");
    }
    
}
