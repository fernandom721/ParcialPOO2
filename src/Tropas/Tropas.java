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
    private int hp, damage,fasescrear, fasesataque;
    private int costo_hierro, costo_cristales, costo_circuitos;
    
    public Tropas(){}
    /**
     * 
     * @param raza Le asigna la raza a la cual pertenece
     * @param nombre Le asigna el nombre al objeto
     * @param hp Le asigna la por default al objeto
     * @param damage Daño que causan los obejtos
     * @param fasescrear Las fases necesarias para que se cree
     * @param fasesataque La  fases necesarias para que ataque
     * @param costo_hierro El costo del objeto en hierro
     * @param costo_cristales El costo del objeto en cristales
     * @param costo_circuitos El costo del objeto en circuitos
     */
    public Tropas(String raza, String nombre, int hp, int damage, int fasescrear, int fasesataque, int costo_hierro, int costo_cristales, int costo_circuitos) {
        this.raza = raza;
        this.nombre = nombre;
        this.hp = hp;
        this.damage = damage;
        this.fasescrear = fasescrear;
        this.fasesataque = fasesataque;
        this.costo_hierro = costo_hierro;
        this.costo_cristales = costo_cristales;
        this.costo_circuitos = costo_circuitos;
    }

    public int getCosto_hierro() {
        return costo_hierro;
    }

    public void setCosto_hierro(int costo_hierro) {
        this.costo_hierro = costo_hierro;
    }

    public int getCosto_cristales() {
        return costo_cristales;
    }

    public void setCosto_cristales(int costo_cristales) {
        this.costo_cristales = costo_cristales;
    }

    public int getCosto_circuitos() {
        return costo_circuitos;
    }

    public void setCosto_circuitos(int costo_circuitos) {
        this.costo_circuitos = costo_circuitos;
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
