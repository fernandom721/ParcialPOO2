/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starwars;

import Menus.MenuFases;

/**
 *
 * @author Fernando Martínez
 */
public class StarWars {
    static AbstractFactory factory;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MenuFases inicio = new MenuFases();
        inicio.MenuFases();
        
    }
}
