/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starwars;

import Razas.Raza;

/**
 *
 * @author Fernando Martínez
 */
public interface AbstractFactory {
    Raza createRaza(String type);
}
