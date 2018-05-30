/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Humanos;

/**
 *
 * @author Fernando Martínez
 */
public class Ejercito implements Humano{
    private int hp, damage, costo;
    
    @Override
    public void Humano() {
        hp = 20;
        damage = 10;
        costo = 1000;
    }
    
}
