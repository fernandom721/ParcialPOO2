/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugadores;

import Razas.Raza;
import java.util.Scanner;
import starwars.AbstractFactory;
import starwars.FactoryProducer;

/**
 *
 * @author Fernando Martínez
 */
public class ValoresdelJugador {
    static AbstractFactory factory;
    Jugador jugador1 = new Jugador(null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
    Scanner input = new Scanner(System.in);

    public ValoresdelJugador(Jugador jugador) {
        this.jugador1=jugador;
    }
    
    /**
     * La Funcion para escoger la raza
     */
    public void Valores(){
     int j1 = input.nextInt();
        switch (j1){
            case 1: 
                factory = FactoryProducer.getFactory("Raza");
                Raza raza1j1 = factory.createRaza("Humano");
                jugador1.setRaza(raza1j1.NombreRaza());
                jugador1.setDamage(raza1j1.Dañodefault());
                jugador1.setHierro(raza1j1.Hierrodefault());
                jugador1.setCristales(raza1j1.Cristalesdefault());
                jugador1.setCircuitos(raza1j1.Circuitosdefault());
                jugador1.setCostoH(raza1j1.CostoHierro());
                jugador1.setCostoCr(raza1j1.CostoCristales());
                jugador1.setCostoCi(raza1j1.CostoCircuitos());
                jugador1.setFataque(raza1j1.FasesAtaque());
                jugador1.setFdefensa(raza1j1.FasesCreando());
                
                break;
            case 2:
                factory = FactoryProducer.getFactory("Raza");
                Raza raza2j1 = factory.createRaza("Alien");
                jugador1.setRaza(raza2j1.NombreRaza());
                jugador1.setDamage(raza2j1.Dañodefault());
                jugador1.setHierro(raza2j1.Hierrodefault());
                jugador1.setCristales(raza2j1.Cristalesdefault());
                jugador1.setCircuitos(raza2j1.Circuitosdefault());
                jugador1.setCostoH(raza2j1.CostoHierro());
                jugador1.setCostoCr(raza2j1.CostoCristales());
                jugador1.setCostoCi(raza2j1.CostoCircuitos());
                jugador1.setFataque(raza2j1.FasesAtaque());
                jugador1.setFdefensa(raza2j1.FasesCreando());
                
                break;
            case 3:
                factory = FactoryProducer.getFactory("Raza");
                Raza raza3j1 = factory.createRaza("Robot");
                jugador1.setRaza(raza3j1.NombreRaza());
                jugador1.setDamage(raza3j1.Dañodefault());
                jugador1.setHierro(raza3j1.Hierrodefault());
                jugador1.setCristales(raza3j1.Cristalesdefault());
                jugador1.setCircuitos(raza3j1.Circuitosdefault());
                jugador1.setCostoH(raza3j1.CostoHierro());
                jugador1.setCostoCr(raza3j1.CostoCristales());
                jugador1.setCostoCi(raza3j1.CostoCircuitos());
                jugador1.setFataque(raza3j1.FasesAtaque());
                jugador1.setFdefensa(raza3j1.FasesCreando());
                
                break;
            case 4:
                factory = FactoryProducer.getFactory("Raza");
                Raza raza4j1 = factory.createRaza("Mutante");
                jugador1.setRaza(raza4j1.NombreRaza());
                jugador1.setDamage(raza4j1.Dañodefault());
                jugador1.setHierro(raza4j1.Hierrodefault());
                jugador1.setCristales(raza4j1.Cristalesdefault());
                jugador1.setCircuitos(raza4j1.Circuitosdefault());
                jugador1.setCostoH(raza4j1.CostoHierro());
                jugador1.setCostoCr(raza4j1.CostoCristales());
                jugador1.setCostoCi(raza4j1.CostoCircuitos());
                jugador1.setFataque(raza4j1.FasesAtaque());
                jugador1.setFdefensa(raza4j1.FasesCreando());
                
                break;
            default:
                System.err.println("Ingrese un numero correcto");
        }
        
    }
}
