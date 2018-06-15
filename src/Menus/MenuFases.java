/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menus;

import Edificios.Edificios;
import Jugadores.Jugador;
import Jugadores.ValoresdelJugador;
import Tropas.Tropas;
import java.util.ArrayList;
import starwars.AbstractFactory;


/**
 *
 * @author Fernando Martínez
 */

public class MenuFases {
    static AbstractFactory factory;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String RED_FILL = "\033[31m";
    public static final String GREEN_FILL = "\033[32m ";
    public static final String BLUE_FILL = "\033[34m";
    public static final String PURPLE_FILL = "\033[35m"; 
    

    
    public void MenuFases(){
        
        int flag=0;
        int contfases=1;
        Jugador jugador1 = new Jugador(null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        ValoresdelJugador j1 = new ValoresdelJugador(jugador1);
        Jugador jugador2 = new Jugador(null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        ValoresdelJugador j2 = new ValoresdelJugador(jugador2);
        ArrayList<Edificios> Edificiosj1 = new ArrayList<Edificios>();
        ArrayList<Edificios> Edificiosj2 = new ArrayList<Edificios>();
        ArrayList<Tropas> TropasAtaque1 = new ArrayList<Tropas>();
        ArrayList<Tropas> TropasAtaque2 = new ArrayList<Tropas>();
        
        //SELECCION DE RAZAS
        System.out.println("Seleccione la raza del Jugador 1");
        System.out.println("1) Humano  2) Alien  3) Robot  4) Mutante");
        j1.Valores();
        System.out.println("Seleccione la raza del Jugador 2");
        System.out.println("1) Humano  2) Alien  3) Robot  4) Mutante");
        j2.Valores();
        
        //CAMPO DE PRUEBAS
        System.out.println("-------- Campo de prueba---------");
        
        Edificios Basej1 = new Edificios(jugador1.getRaza(), "Base", 100, 10000, 5000, 3000,0);
        Edificios Basej2 = new Edificios(jugador2.getRaza(), "Base", 100, 10000, 5000, 3000,0);
        Acciones base1 = new Acciones(jugador1, jugador2, Basej1, Basej2, Edificiosj1, TropasAtaque1, Edificiosj2, TropasAtaque2);
        Acciones base2 = new Acciones(jugador2, jugador1, Basej2, Basej1, Edificiosj2, TropasAtaque2, Edificiosj1, TropasAtaque1);
        

        //FASES
        do{
            System.out.println(BLUE_FILL+"--------FASE #" + contfases+"--------"+ANSI_RESET);
            base1.Fases();
            if (Basej2.getHp()<=0){
                System.out.println(GREEN_FILL+"GANADOR: Jugador 1: " + jugador1.getRaza() + ANSI_RESET);
                System.out.println(RED_FILL+" PERDERDOR: Jugador 2: " + jugador2.getRaza() + ANSI_RESET);
                System.out.println(BLUE_FILL+"------Regresando al Menu Principal------"+ANSI_RESET);
            flag =1;
            break;
            }

            base2.Fases();
            if (Basej1.getHp()<=0){
                System.out.println(GREEN_FILL+"GANADOR: Jugador 2: " + jugador2.getRaza() + ANSI_RESET);
                System.out.println(RED_FILL+" PERDERDOR: Jugador 1: " + jugador1.getRaza() + ANSI_RESET);
                System.out.println(BLUE_FILL+"------Regresando al Menu Principal------"+ANSI_RESET);
            flag =1;
            break;
            }
            contfases++;
        }while(flag==0);
    }
    }

