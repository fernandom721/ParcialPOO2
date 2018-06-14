/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugadores;

/**
 *
 * @author Fernando Martínez
 */
public class Jugador {
    private String raza;
    private int hp, damage;
    private int hierro, cristales, circuitos;

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHierro() {
        return hierro;
    }

    public void setHierro(int hierro) {
        this.hierro = hierro;
    }

    public int getCristales() {
        return cristales;
    }

    public void setCristales(int cristales) {
        this.cristales = cristales;
    }

    public int getCircuitos() {
        return circuitos;
    }

    public void setCircuitos(int circuitos) {
        this.circuitos = circuitos;
    }
    
    
}
