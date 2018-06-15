/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menus;

import java.util.Scanner;
import Menus.Instrucciones;
import java.io.IOException;
/**
 *
 * @author Fernando Martínez
 */
public class MenuPrincipal {
    int flag =0;
    Scanner input = new Scanner(System.in);
    Instrucciones a = new Instrucciones();
/**
 * 
 * Menu con las opciones que puede escoger el usuario antes de jugar
 */
    public void MenuPrincipal() throws IOException{
        do{
            System.out.println("-------Fernando Martíne'z World (Deluxe Edition)---------");
            System.out.println("Bienvenido a Fernando Martíne'z World");
            System.out.println("Seleccione una opcion del menu");
            System.out.println("1) Jugar");
            System.out.println("2) ¿Como Jugar?");
            System.out.println("3) Salir");
            int x = input.nextInt();
            switch (x){
                case 1:
                    MenuFases inicio = new MenuFases();
                    inicio.MenuFases();
                    break;
                case 2:
                    a.muestraContenido("C:\\Users\\Fernando Martínez\\Documents\\NetBeansProjects\\ParcialPOO2\\src\\TextoIntrucciones\\Instrucciones.txt");
                    break;
                case 3:
                    System.out.println("Gracias por Jugar :)");
                    flag = 1;
                    break;
                default:
                    System.err.println("Ingrese una Opcion Valida");
                }
        }while(flag == 0);
    }
}
