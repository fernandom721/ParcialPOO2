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
public class RazaMutante implements Raza{

    @Override
    public String NombreRaza() {
        return "Mutante";
    }

    @Override
    public int Vidadefault() {
        return 150;
    }

    @Override
    public int Dañodefault() {
        return 20;
    }

    @Override
    public int Hierrodefault() {
        return 750;
    }

    @Override
    public int Cristalesdefault() {
        return 300;
    }

    @Override
    public int Circuitosdefault() {
        return 200;
    }

    @Override
    public int CostoHierro() {
        return 500;
    }

    @Override
    public int CostoCristales() {
        return 400;
    }

    @Override
    public int CostoCircuitos() {
        return 200;
    }

    @Override
    public int FasesCreando() {
        return 1;
    }

    @Override
    public int FasesAtaque() {
        return 1;
    }

    
}
