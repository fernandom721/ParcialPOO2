/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starwars;

import Menus.MenuPrincipal;
import java.io.IOException;

/**
 *
 * @author Fernando Martínez
 */
public class FernandoMartinezWorld {
    static AbstractFactory factory;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        MenuPrincipal start = new MenuPrincipal();
        start.MenuPrincipal();
        
    }
}
