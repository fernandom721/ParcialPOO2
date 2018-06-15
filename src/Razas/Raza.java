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
/**
 * Valores que tiene la raza
 */
public interface Raza {
    String NombreRaza();
    int Vidadefault();
    int Dañodefault();
    int Hierrodefault();
    int Cristalesdefault();
    int Circuitosdefault();
    int CostoHierro();
    int CostoCristales();
    int CostoCircuitos();
    int FasesCreando();
    int FasesAtaque();
}
