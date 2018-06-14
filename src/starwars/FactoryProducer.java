/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starwars;

import Razas.CrearRaza;





/**
 *
 * @author Fernando Martínez
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String type){
        switch (type){
            case "Raza":
                return new CrearRaza();
        }
        return null;
        
    }
}
