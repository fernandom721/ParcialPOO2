/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Razas;

/**
 *
 * @author Fernando Martínez
 */

public class RazaAlien implements Raza{

    @Override
    public String NombreRaza() {
        return "Alien";
    }

    @Override
    public int Vidadefault() {
        return 100;
    }

    @Override
    public int Dañodefault() {
        return 25;
    }

    @Override
    public int Hierrodefault() {
        return 1000;
    }

    @Override
    public int Cristalesdefault() {
        return 500;
    }

    @Override
    public int Circuitosdefault() {
        return 300;
    }

    @Override
    public int CostoHierro() {
        return 750;
    }

    @Override
    public int CostoCristales() {
        return 500;
    }

    @Override
    public int CostoCircuitos() {
        return 300;
    }

    @Override
    public int FasesCreando() {
        return 0;
    }

    @Override
    public int FasesAtaque() {
        return 0;
    }

    
}
