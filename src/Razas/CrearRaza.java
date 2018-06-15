/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Razas;

import starwars.AbstractFactory;

/**
 *
 * @author Fernando Martínez
 */
/**
 * Seleccion de la raza
 */
public class CrearRaza implements AbstractFactory{

    @Override
    public Raza createRaza(String type) {
        switch (type){
            case "Humano":
                return new RazaHumano();
            case "Alien":
                return new RazaAlien();
            case "Robot":
                return new RazaRobot();
            case "Mutante":
                return new RazaMutante();
        }
        return null;
    }

    
}
