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
public class Tanque implements Humano{
    private int hp, damage;
    
    @Override
    public void Humano() 
    {
        hp = 50;
        damage = 20;
    }
    
}