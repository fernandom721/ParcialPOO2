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
public class MenuOpciones {
    public int opcion;
    Scanner input = new Scanner(System.in);
    /**
     * Lista de las acciones que puede escoger el usuario
     */
    public void MenuOpciones(){
        System.out.println("¿Qué Desea Hacer?");
        System.out.println("1) Crear Edificio");
        System.out.println("2)Crear Tropa");
        System.out.println("3) Crear Vehiculos");
        System.out.println("4) Atacar");
        System.out.println("5) Mejorar Base");
        System.out.println("6) Saltar");
    }
    public MenuOpciones(){
        
        opcion = input.nextInt();
    }

    public MenuOpciones(int opcion) {
        
        this.opcion = opcion;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }
    
}
