/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificios;

/**
 * 
 * @author Fernando Martínez
 */
public class Edificios {
    private String raza, nombre;
    private int hp, fases;
    private int hierro, cristales, circuitos;
    private int costo_hierro, costo_cristales, costo_circuitos;
    private int nivel;
    /**
     * Constructor Vacio
     */
    public Edificios(){}
    // Constructor De Edificios
    /**
     * 
     * @param raza Le asigna la raza a la cual pertenece
     * @param nombre Le asigna el nombre al objeto
     * @param hp Le asigna la por default al objeto
     * @param hierro La cantidad de Hierro por default que este entrega
     * @param cristales La cantidad de Cristales por default que este entrega
     * @param circuitos La cantidad de Circuitos por default que este entrega
     * @param nivel El nivel inicial de la Base / Las fases necesarias para la construccion del Edificios
     */
    public Edificios(String raza, String nombre, int hp, int hierro, int cristales, int circuitos, int nivel) {
        this.raza = raza;
        this.nombre = nombre;
        this.hp = hp;
        this.hierro = hierro;
        this.cristales = cristales;
        this.circuitos = circuitos;
        this.nivel = nivel;
    }
    
    
    //Construir Extractor de Recursos
    /**
     * 
     * @param raza Le asigna la raza a la cual pertenece
     * @param nombre Le asigna el nombre al objeto
     * @param hp Le asigna la por default al objeto
     * @param fases Las fases necesarias para la construccion del Edificios
     * @param hierro La cantidad de Hierro por default que este entrega
     * @param cristales La cantidad de Cristales por default que este entrega
     * @param circuitos La cantidad de Circuitos por default que este entrega
     * @param costo_hierro El costo del objeto en hierro
     * @param costo_cristales El costo del objeto en cristales
     * @param costo_circuitos El costo del objeto en circuitos
     */
    public Edificios(String raza, String nombre, int hp, int fases, int hierro, int cristales, int circuitos, int costo_hierro, int costo_cristales, int costo_circuitos) {
        this.raza = raza;
        this.nombre = nombre;
        this.hp = hp;
        this.fases = fases;
        this.hierro = hierro;
        this.cristales = cristales;
        this.circuitos = circuitos;
        this.costo_hierro = costo_hierro;
        this.costo_cristales = costo_cristales;
        this.costo_circuitos = costo_circuitos;
    }
/**
 * 
 * @return regresa el nivel de la base
 */
    public int getNivel() {
        return nivel;
    }
    /**
     * 
     * @param nivel 
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    /**
     * 
     * @return retorna el costo del objeto en hierro
     */
    public int getCosto_hierro() {
        return costo_hierro;
    }
    /**
     * 
     * @param costo_hierro 
     */
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
    

    
    public int getFases() {
        return fases;
    }

    public void setFases(int fases) {
        this.fases = fases;
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

    
    
    
}
