/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tropas;

/**
 *
 * @author Fernando Martínez
 */
public class Tropas {
    private String raza, nombre;
    private int hp, damage, costo, fasescrear, fasesataque;
    
    public Tropas(){}

    public Tropas(String raza, String nombre, int hp, int damage, int costo, int fasescrear, int fasesataque) {
        this.raza = raza;
        this.nombre = nombre;
        this.hp = hp;
        this.damage = damage;
        this.costo = costo;
        this.fasescrear = fasescrear;
        this.fasesataque = fasesataque;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getFasescrear() {
        return fasescrear;
    }

    public void setFasescrear(int fasescrear) {
        this.fasescrear = fasescrear;
    }

    public int getFasesataque() {
        return fasesataque;
    }

    public void setFasesataque(int fasesataque) {
        this.fasesataque = fasesataque;
    }
    
}
