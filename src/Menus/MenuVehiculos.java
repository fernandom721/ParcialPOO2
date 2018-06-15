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
public class MenuVehiculos {
    public int opcion;
    Scanner input = new Scanner(System.in);
/**
 * Tipo de Vehiculos que puede crear el usuario
 */
    public void MenuVehiculos(){
        System.out.println("¿Qúe Tipo de Tropa deseas Crear?");
        System.out.println("1) Vehiculo Terrestre");
        System.out.println("2) Vehiculo Aereo");     
    }
    
    public MenuVehiculos(){
        opcion = input.nextInt();
    }
    
    public MenuVehiculos(int opcion) {
        this.opcion = opcion;
    }
    
    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }
}
