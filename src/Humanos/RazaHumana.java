/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Humanos;

import starwars.AbstractFactory;

/**
 *
 * @author Fernando Martínez
 */
public class RazaHumana implements AbstractFactory{

    @Override
    public Humano getCrear(String type) {
        
        switch (type){
            case "Ejercito":
                return new Ejercito();
                    
        }
        return null;
        
    }
    
}
