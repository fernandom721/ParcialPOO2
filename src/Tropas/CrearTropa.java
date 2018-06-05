/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tropas;

import Edificios.Edificio;
import Razas.Raza;
import starwars.AbstractFactory;

/**
 *
 * @author Fernando Martínez
 */
public class CrearTropa implements AbstractFactory{

    @Override
    public Raza createRaza(String type) {
        return null;
    }

    @Override
    public Tropa createTropa(String type) {
        switch (type){
            case "Tropa1":
                return new Tropa1();
            case "Tropa2":
                return new Tropa2();
            case "Elite1":
                return new Elite1();
            case "Elite2":
                return new Elite2();
            case "Vehiculo":
                return new Vehiculo();
        }
        return null;
    }

    @Override
    public Edificio createEdificio(String type) {
        return null;
    }
    
}
