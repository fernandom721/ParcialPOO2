/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menus;

import Razas.Raza;
import java.util.ArrayList;
import java.util.Scanner;
import Edificios.Edificios;
import Tropas.Tropas;
import Menus.MenuOpciones;
import Menus.MenuEdificios;
import Menus.MenuTropas;
import Jugadores.Jugador;
import starwars.AbstractFactory;
import starwars.FactoryProducer;

/**
 *
 * @author Fernando Martínez
 */
public class MenuFases {
    static AbstractFactory factory;
    
    public void MenuFases(){
        ArrayList<Edificios> Edificiosj1 = new ArrayList<Edificios>();
        ArrayList<Edificios> Edificiosj2 = new ArrayList<Edificios>();
        int contfases=1;
        int flag =0;
        String raza1 = null;
        String raza2 = null;
        Scanner input = new Scanner(System.in);
        MenuOpciones OpcionesJugador = new MenuOpciones(flag);
        MenuEdificios CrearEdificios = new MenuEdificios();
        MenuTropas CrearTropas = new MenuTropas();
        System.out.println("-------Fernando Martíne'z World (Deluxe Edition)---------");
        System.out.println("Seleccione la raza del Jugador 1");
        System.out.println("1) Humano  2) Alien  3) Robot  4) Mutante");
        
        //VALIDAR LOS SWITCH!!!!!!
        
        int j1 = input.nextInt();
        switch (j1){
            case 1: 
                factory = FactoryProducer.getFactory("Raza");
                Raza raza1j1 = factory.createRaza("Humano");
                raza1j1.Raza();
                raza1 = "Humano";
                break;
            case 2:
                factory = FactoryProducer.getFactory("Raza");
                Raza raza2j1 = factory.createRaza("Alien");
                raza2j1.Raza();
                raza1 = "Alien";
                break;
            case 3:
                factory = FactoryProducer.getFactory("Raza");
                Raza raza3j1 = factory.createRaza("Robot");
                raza3j1.Raza();
                raza1="Robot";
                break;
            case 4:
                factory = FactoryProducer.getFactory("Raza");
                Raza raza4j1 = factory.createRaza("Mutante");
                raza4j1.Raza();
                raza1="Mutante";
                break;
            default:
                System.err.println("Ingrese un numero correcto");
        }
        


        System.out.println("Seleccione la raza del Jugador 2");
        System.out.println("1) Humano  2) Alien  3) Robot  4) Mutante");
        int j2 = input.nextInt();
        switch (j2){
            case 1: 
                factory = FactoryProducer.getFactory("Raza");
                Raza raza1j2 = factory.createRaza("Humano");
                raza1j2.Raza();
                break;
            case 2:
                factory = FactoryProducer.getFactory("Raza");
                Raza raza2j2 = factory.createRaza("Alien");
                raza2j2.Raza();
                break;
            case 3:
                factory = FactoryProducer.getFactory("Raza");
                Raza raza3j2 = factory.createRaza("Robot");
                raza3j2.Raza();
                break;
            case 4:
                factory = FactoryProducer.getFactory("Raza");
                Raza raza4j2 = factory.createRaza("Mutante");
                raza4j2.Raza();
                break;
            default:
                System.err.println("Ingrese un numero correcto");
        }
        
        //CAMPO DE PRUEBAS
        System.out.println("-------- Campo de prueba---------");
        
        Edificios Basej1 = new Edificios(raza1, "Base", 100, 10000, 5000, 3000);
        //Edificiosj1.add(Basej1);
        Edificios Basej2 = new Edificios(raza2, "Base", 100, 10000, 5000, 3000);
        //Edificiosj1.add(Basej2);
        
        
                
        
        //Pre-Alpha de las Fases
        
        do{
            System.out.println("--------FASE #" + contfases+"--------");
            System.out.println("Jugador 1");
            //OpcionesJugador.opcion
            //int turnoj1 = input.nextInt();
            
            switch (OpcionesJugador.getOpcion()){
                case 1:
                    //Crear Edificios
                    CrearEdificios.MenuEdificios();
                case 2:
                    //Crear Tropas
                    //ARREGLAR ESTO CON UN toString!!!!!!!!!!!
                    for(int x=0;x<Edificiosj1.size();x++) {
                        System.out.println(Edificiosj1.get(x));
                        if (Edificiosj1.get(x).getNombre() != "Campo de Entrenamiento"){
                            System.err.println("Tienes que crear un Campo de Entrnamiento antes de Crear Tropas");
                        }
                        else{
                            CrearTropas.MenuTropas();
                        }
                    }
                case 3:
                    //Crear Vehiculos
                    
                    
            }
            if (Basej1.getHp()==0){

            flag =1;
            break;
            }

            System.out.println("Jugador 2");
            int turnoj2 = input.nextInt();
            if (turnoj2==0){
            flag =1;
            break;
            }
            contfases++;
        }while(flag==0);
    }
    }

