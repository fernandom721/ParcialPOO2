/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificios;

import Razas.Raza;
import Tropas.Tropa;
import starwars.AbstractFactory;

/**
 *
 * @author Fernando Martínez
 */
public class CrearEdificio implements AbstractFactory{

    @Override
    public Raza createRaza(String type) {
        return null;
    }

    @Override
    public Tropa createTropa(String type) {
        return null;
    }

    @Override
    public Edificio createEdificio(String type) {
        switch (type){
            case "Base":
                return new Base();
            case "CuartelAtaque":
                return new CuartelAtaque();
            case "CuartelDefensa":
                return new Cuartel_Defensa();
            case "RecolectorMaterial1":
                return new RecolectorMaterial1();
            case "RecolectorMaterial2":
                return new RecolectorMaterial2();
            case "RecolectorMaterial3":
                return new RecolectorMaterial3();
                
        }
        return null;
    }
    
}
