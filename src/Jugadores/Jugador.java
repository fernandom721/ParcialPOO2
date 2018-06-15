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
    private int costo_Hierro, costoCristales, costoCircuitos;
    private int Fataque, FCreacion;
    /**
    * 
    * @param raza Le asigna la raza a la cual pertenece
    * @param damage Le asigna el nombre al objeto
    * @param hp Le asigna la por default al objeto
     * @param hierro La cantidad de Hierro por default que este entrega
     * @param cristales La cantidad de Cristales por default que este entrega
     * @param circuitos La cantidad de Circuitos por default que este entrega
    * @param costoH El costo de el objeto en hierro
    * @param costoCr El costo del objeto en cristales
    * @param costoCi El costo del objeto en circuitos
    * @param Fataque La  fases necesarias para que ataque
    * @param Fdefensa Las fases necesarias para que se cree
    */
    public Jugador(String raza, int hp, int damage, int hierro, int cristales, int circuitos, int costoH, int costoCr, int costoCi, int Fataque, int Fdefensa) {
        this.raza = raza;
        this.hp = hp;
        this.damage = damage;
        this.hierro = hierro;
        this.cristales = cristales;
        this.circuitos = circuitos;
        this.costo_Hierro = costoH;
        this.costoCristales = costoCr;
        this.costoCircuitos = costoCi;
        this.Fataque = Fataque;
        this.FCreacion = Fdefensa;
    }

    public int getCostoH() {
        return costo_Hierro;
    }

    public void setCostoH(int costoH) {
        this.costo_Hierro = costoH;
    }

    public int getCostoCr() {
        return costoCristales;
    }

    public void setCostoCr(int costoCr) {
        this.costoCristales = costoCr;
    }

    public int getCostoCi() {
        return costoCircuitos;
    }

    public void setCostoCi(int costoCi) {
        this.costoCircuitos = costoCi;
    }

    public int getFataque() {
        return Fataque;
    }

    public void setFataque(int Fataque) {
        this.Fataque = Fataque;
    }

    public int getFdefensa() {
        return FCreacion;
    }

    public void setFdefensa(int Fdefensa) {
        this.FCreacion = Fdefensa;
    }



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
