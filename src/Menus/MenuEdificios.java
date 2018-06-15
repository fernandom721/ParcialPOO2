/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menus;
import java.util.Scanner;
/**
 *
 * @author Fernando Martínez
 */
public class MenuEdificios {
    public int opcion;
    Scanner input = new Scanner(System.in);
    /**
     * Imprime las Opciones de Fabricacion de Edificios
     */
    public void MenuEdificios(){
        System.out.println("----FABRICA DE EDIFICIOS----");
                    System.out.println("¿Qué Edificio desea Crear?");
                    System.out.println("---Extractores---");
                    System.out.println("1) Extracto de Hierro");
                    System.out.println("2) Extractor de Cristales");
                    System.out.println("3) Fábrica de Ciruitos");
                    System.out.println("---Tropas---");
                    System.out.println("4) Campo de Entrenamiento");
                    System.out.println("5) Fábrica de Vehiculos");
    }
    
    public MenuEdificios(){
        
        opcion = input.nextInt();
    }
    
    public MenuEdificios(int opcion) {
        this.opcion = opcion;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }
    
}
