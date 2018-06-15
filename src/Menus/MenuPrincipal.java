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
public class MenuPrincipal {
    int flag =0;
    Scanner input = new Scanner(System.in);
    public void MenuPrincipal(){
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
                    System.out.println("--------COMO JUGAR--------");
                    System.out.println("Si para mañana a las 6 haz terminado lo basico, busca como leer archivos de texto");
                    System.out.println("Sino hacelo a puros sout :v");
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
