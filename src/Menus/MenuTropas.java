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
public class MenuTropas {
    public int opcion;
    Scanner input = new Scanner(System.in);
/**
 * Tipo de Tropas que puede crear el usuario
 */
    public void MenuTropas(){
        System.out.println("¿Qúe Tipo de Tropa deseas Crear?");
        System.out.println("1) Tropas");
        System.out.println("2) Escuadron");
        System.out.println("3) Tropa de Élite");       
    }
    
    public MenuTropas(){
        opcion = input.nextInt();
    }
    
    public MenuTropas(int opcion) {
        this.opcion = opcion;
    }
    
    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }
}
