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
public class RazaRobot implements Raza{

    @Override
    public String NombreRaza() {
        return "Robot";
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
        return 1500;
    }

    @Override
    public int Cristalesdefault() {
        return 750;
    }

    @Override
    public int Circuitosdefault() {
        return 600;
    }

    @Override
    public int CostoHierro() {
        return 1000;
    }

    @Override
    public int CostoCristales() {
        return 700;
    }

    @Override
    public int CostoCircuitos() {
        return 400;
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
