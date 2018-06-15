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
import Jugadores.ValoresdelJugador;
import FernandoMartinezWorld.AbstractFactory;
import FernandoMartinezWorld.FactoryProducer;

/**
 *
 * @author Fernando Martínez
 */

public class Acciones {
    static AbstractFactory factory;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String RED_FILL = "\033[31m";
    public static final String GREEN_FILL = "\033[32m ";
    public static final String BLUE_FILL = "\033[34m";
    public static final String PURPLE_FILL = "\033[35m";
    
    Edificios Basej1 = new Edificios(null, null, 0, 0, 0, 0,0);
    Edificios Basej2 = new Edificios(null, null, 0, 0, 0, 0,0);
    Jugador jugador1 = new Jugador(null,0,0,0,0,0,0,0,0,0,0);
    Jugador jugador2 = new Jugador(null,0,0,0,0,0,0,0,0,0,0);
    ArrayList<Edificios> Edificiosj1 = new ArrayList<Edificios>();
    ArrayList<Edificios> Edificiosj2 = new ArrayList<Edificios>();
    ArrayList<Tropas> TropasAtaque1 = new ArrayList<Tropas>();
    ArrayList<Tropas> TropasAtaque2 = new ArrayList<Tropas>();
    

    /**
     * La Funcion para la accion que escoge el usuario
     * @param player1 Objeto con los valores de la raza seleccionada por el usuario @see MenuFases
     * @param player2 Objeto con los valores de la raza seleccionada por el usuario @see MenuFases
     * @param base1 Base con los parametros inciales del usuario @see MenuFases
     * @param base2 Base con los parametros inciales del usuario @see MenuFases
     * @param edificios1 Lista donde guardan los Edificios creados por el usuario @see MenuFases
     * @param tropas1 Lista donde guardan las Tropas creadas por el usuario @see MenuFases
     * @param edificios2 Lista donde guardan los Edificios creados por el usuario @see MenuFases
     * @param tropas2 Lista donde guardan las Tropas creadas por el usuario @see MenuFases
     */

    public Acciones(Jugador player1,Jugador player2,Edificios base1, Edificios base2, ArrayList<Edificios>edificios1,ArrayList<Tropas>tropas1,ArrayList<Edificios>edificios2,ArrayList<Tropas>tropas2){
        this.jugador1=player1;
        this.jugador2=player2;
        this.Basej1=base1;
        this.Basej2=base2;
        this.Edificiosj1=edificios1;
        this.TropasAtaque1=tropas1;
        this.Edificiosj2=edificios2;
        this.TropasAtaque2=tropas2;
    }

    public void Fases(){
        
        
        int defensa1=0;
        int defensa2=0;
        int contfases=1;
        int flag =0;
        int capacidadHierro=10000;
        int capacidadCristales=5000;
        int capacidadCircuitos=3000;
        String raza= null;
        Scanner input = new Scanner(System.in);
        MenuOpciones OpcionesJugador = new MenuOpciones(flag);
        MenuEdificios CrearEdificios = new MenuEdificios(flag);
        MenuTropas CrearTropas = new MenuTropas(flag);
        MenuVehiculos CrearVehiculos = new MenuVehiculos(flag);
        
        //FASES
            
            System.out.println(BLUE_FILL+"Jugador : "+jugador1.getRaza()+ANSI_RESET);
            System.out.println("Salud de la Base"+Basej1.getHp());
            System.out.println("Base Nivel: "+Basej1.getNivel());
            System.out.println("Recursos Disponibles");
            System.out.println("Hierro: "+Basej1.getHierro());
            System.out.println("Cristales: "+Basej1.getCristales());
            System.out.println("Circuitos: "+Basej1.getCircuitos());
            
            //AUMENTAR RECURSOS
            for(int i=0;i<Edificiosj1.size();i++) {
                int cont=1;
                cont++;
                if(Edificiosj1.get(i).getNombre()=="Extractor de Hierro"){
                    if(Basej1.getHierro()>=capacidadHierro){
                    System.err.println("Tu Base esta a su limite de Hierro");
                    Basej1.setHierro(capacidadHierro);
                    }
                    else{
                        Basej1.setHierro(Basej1.getHierro()+Edificiosj1.get(i).getHierro());
                    }}
                if(Edificiosj1.get(i).getNombre()=="Extractor de Cristales"){
                    if(Basej1.getCristales()>=capacidadCristales){
                    System.err.println("Tu Base esta a su limite de Cristales");
                    Basej1.setCristales(capacidadCristales);
                    }
                    else{
                        Basej1.setCristales(Basej1.getCristales()+Edificiosj1.get(i).getCristales());
                    }}
                if(Edificiosj1.get(i).getNombre()=="Fabrica de Circuitos"){
                    if(Basej1.getCircuitos()>=capacidadCircuitos){
                    System.err.println("Tu Base esta a su limite de Cristales");
                    Basej1.setCircuitos(capacidadCircuitos);
                    }
                    else{
                        Basej1.setCircuitos(Basej1.getCircuitos()+Edificiosj1.get(i).getCircuitos());
                    }}
            }
                    
            OpcionesJugador.MenuOpciones();        
            OpcionesJugador.opcion=OpcionesJugador.input.nextInt();
            //VALIDAR
            switch (OpcionesJugador.getOpcion()){
                case 1:
                    //Crear Edificios
                    CrearEdificios.MenuEdificios();
                    CrearEdificios.opcion=CrearEdificios.input.nextInt();
                    //VALIDAR
                    switch(CrearEdificios.getOpcion()){
                        case 1:
                            Edificios ExtractorHierro = new Edificios(jugador1.getRaza(), "Extractor de Hierro", jugador1.getHp()+50, jugador1.getFdefensa(), jugador1.getHierro()+500, 0, 0, jugador1.getCostoH(), jugador1.getCostoCr(), jugador1.getCostoCi());
                            //DESCONTAR DE RECURSOS
                            if(Basej1.getHierro()<ExtractorHierro.getCosto_hierro() || Basej1.getCristales()<ExtractorHierro.getCosto_cristales() || Basej1.getCircuitos()<ExtractorHierro.getCosto_circuitos()){
                                System.err.println("No tienes Los Recursos Necesarios para Crear este Objeto");
                            }
                            else{
                                Edificiosj1.add(ExtractorHierro);
                                Basej1.setHierro(Basej1.getHierro()-ExtractorHierro.getCosto_hierro());
                                Basej1.setCristales(Basej1.getCristales()-ExtractorHierro.getCosto_cristales());
                                Basej1.setCircuitos(Basej1.getCircuitos()-ExtractorHierro.getCosto_circuitos());
                                System.out.println(PURPLE_FILL+"Haz Creado un Extractor de Hierro"+ANSI_RESET);
                            }
                            break;
                        case 2:
                            Edificios ExtractorCristales = new Edificios(jugador1.getRaza(), "Extractor de Cristales", jugador1.getHp()+50, jugador1.getFdefensa(), 0, jugador1.getCristales()+300, 0, jugador1.getCostoH(), jugador1.getCostoCr(), jugador1.getCostoCi());
                            if(Basej1.getHierro()<ExtractorCristales.getCosto_hierro() || Basej1.getCristales()<ExtractorCristales.getCosto_cristales() || Basej1.getCircuitos()<ExtractorCristales.getCosto_circuitos()){
                                System.err.println("No tienes Los Recursos Necesarios para Crear este Objeto");
                            }
                            else{
                                Edificiosj1.add(ExtractorCristales);
                                Basej1.setHierro(Basej1.getHierro()-ExtractorCristales.getCosto_hierro());
                                Basej1.setCristales(Basej1.getCristales()-ExtractorCristales.getCosto_cristales());
                                Basej1.setCircuitos(Basej1.getCircuitos()-ExtractorCristales.getCosto_circuitos());
                                System.out.println(PURPLE_FILL+"Haz Creado un Extractor de Cristales"+ANSI_RESET);
                            }
                            break;
                        case 3:
                            Edificios ExtractorCircuitos = new Edificios(jugador1.getRaza(), "Fabrica de Circuitos", jugador1.getHp()+50, jugador1.getFdefensa(), 0, 0, jugador1.getCircuitos()+150, jugador1.getCostoH(), jugador1.getCostoCr(), jugador1.getCostoCi());
                            if(Basej1.getHierro()<ExtractorCircuitos.getCosto_hierro() || Basej1.getCristales()<ExtractorCircuitos.getCosto_cristales() || Basej1.getCircuitos()<ExtractorCircuitos.getCosto_circuitos()){
                                System.err.println("No tienes Los Recursos Necesarios para Crear este Objeto");
                            }
                            else{
                                Edificiosj1.add(ExtractorCircuitos);
                                Basej1.setHierro(Basej1.getHierro()-ExtractorCircuitos.getCosto_hierro());
                                Basej1.setCristales(Basej1.getCristales()-ExtractorCircuitos.getCosto_cristales());
                                Basej1.setCircuitos(Basej1.getCircuitos()-ExtractorCircuitos.getCosto_circuitos());
                                System.out.println(PURPLE_FILL+"Haz Creado una Fabrica de Circuitos"+ANSI_RESET);
                            }
                            break;
                        case 4:
                            Edificios CampoEntrenamiento = new Edificios(jugador1.getRaza(), "Campo de Entrenamiento", jugador1.getHp()+100, jugador1.getFdefensa(), (jugador1.getCostoH()+500), (jugador1.getCostoCr()+250), (jugador1.getCostoCi()+250));
                            if(Basej1.getHierro()<(CampoEntrenamiento.getCosto_hierro()+500) || Basej1.getCristales()<(CampoEntrenamiento.getCosto_cristales()+250)||Basej1.getCircuitos()<(CampoEntrenamiento.getCosto_circuitos()+250)){
                                System.err.println("No tienes Los Recursos Necesarios para Crear este Objeto");
                            }
                            else{
                                Edificiosj1.add(CampoEntrenamiento);
                                Basej1.setHierro(Basej1.getHierro()-(CampoEntrenamiento.getCosto_hierro()+500));
                                Basej1.setCristales(Basej1.getCristales()-(CampoEntrenamiento.getCosto_cristales()+250));
                                Basej1.setCircuitos(Basej1.getCircuitos()-(CampoEntrenamiento.getCosto_circuitos()+250));
                                System.out.println(PURPLE_FILL+"Haz Creado un Campo de Entrenamiento"+ANSI_RESET);
                            }
                            break;
                        case 5:
                            Edificios FabricaVehiculos = new Edificios(jugador1.getRaza(), "Fábrica de Vehiculos", jugador1.getHp()+150, jugador1.getFdefensa()+1, jugador1.getCostoH()+1000, jugador1.getCostoCr()+500, jugador1.getCostoCi()+250);
                            if(Basej1.getHierro()<(FabricaVehiculos.getCosto_hierro()+1000) || Basej1.getCristales()<(FabricaVehiculos.getCosto_cristales()+500) || Basej1.getCircuitos()<(FabricaVehiculos.getCosto_circuitos()+250)){
                                System.err.println("No tienes Los Recursos Necesarios para Crear este Objeto");
                            }
                            else{
                                Edificiosj1.add(FabricaVehiculos);
                                Basej1.setHierro(Basej1.getHierro()-(FabricaVehiculos.getCosto_hierro()+1000));
                                Basej1.setCristales(Basej1.getCristales()-(FabricaVehiculos.getCosto_cristales()+500));
                                Basej1.setCircuitos(Basej1.getCircuitos()-(FabricaVehiculos.getCosto_circuitos()+250));
                                System.out.println(PURPLE_FILL+"Haz Creado una Fabria de Vehiculos"+ANSI_RESET);
                            }
                            break;
                            
                    }
                    break;
                case 2:
                    //Crear Tropas
                    for(int i=0;i<Edificiosj1.size();i++) {
                        if (Edificiosj1.get(i).getNombre() != "Campo de Entrenamiento"){
                            System.err.println("Tienes que crear un Campo de Entrnamiento antes de Crear Tropas");
                        }
                        else{
                            //VALIDAR
                            CrearTropas.MenuTropas();
                            CrearTropas.opcion=CrearTropas.input.nextInt();
                            switch(CrearTropas.getOpcion()){
                                case 1:
                                    Tropas tropa = new Tropas(jugador1.getRaza(), "Tropa", jugador1.getHp()-100, jugador1.getDamage(), jugador1.getFdefensa(), jugador1.getFataque(), jugador1.getCostoH()-250, jugador1.getCostoCr()-100, jugador1.getCostoCi()-50);
                                    if(Basej1.getHierro()<(tropa.getCosto_hierro()-250) || Basej1.getCristales()<(tropa.getCosto_cristales()-100) || Basej1.getCircuitos()<(tropa.getCosto_circuitos()-50)){
                                        System.err.println("No tienes Los Recursos Necesarios para Crear este Objeto");
                                    }
                                    //AGREGANDO AL CUARTEL
                                    else{
                                        Basej1.setHierro(Basej1.getHierro()-(tropa.getCosto_hierro()-250));
                                        Basej1.setCristales(Basej1.getCristales()-(tropa.getCosto_cristales()-100));
                                        Basej1.setCircuitos(Basej1.getCircuitos()-(tropa.getCosto_circuitos()-50));
                                        System.out.println("Selecciona el Objetivo de la Tropa");
                                        System.out.println("1) Ataque \n 2) Defensa");
                                        int x = input.nextInt();
                                        //VALIDAR
                                        switch(x){
                                            case 1:
                                                TropasAtaque1.add(tropa);
                                            case 2:
                                                defensa1=defensa1+tropa.getDamage();
                                        }
                                        System.out.println(PURPLE_FILL+"Haz Creado una Tropa"+ANSI_RESET);
                                    }
                                    break;
                                case 2:
                                    Tropas escuadron = new Tropas(jugador1.getRaza(), "Escuadron", jugador1.getHp(), jugador1.getDamage()+10, jugador1.getFdefensa()+1, jugador1.getFataque(), jugador1.getCostoH()-150, jugador1.getCostoCr(), jugador1.getCostoCi());
                                    if(Basej1.getHierro()<(escuadron.getCosto_hierro()-150) || Basej1.getCristales()<(escuadron.getCosto_cristales()) || Basej1.getCircuitos()<(escuadron.getCosto_circuitos())){
                                        System.err.println("No tienes Los Recursos Necesarios para Crear este Objeto");
                                    }
                                    //AGREGANDO AL CUARTEL
                                    else{
                                        Basej1.setHierro(Basej1.getHierro()-(escuadron.getCosto_hierro()-150));
                                        Basej1.setCristales(Basej1.getCristales()-(escuadron.getCosto_cristales()));
                                        Basej1.setCircuitos(Basej1.getCircuitos()-(escuadron.getCosto_circuitos()));
                                        System.out.println("Selecciona el Objetivo de la Tropa");
                                        System.out.println("1) Ataque \n 2) Defensa");
                                        int y = input.nextInt();
                                        //VALIDAR
                                        switch(y){
                                            case 1:
                                                TropasAtaque1.add(escuadron);
                                            case 2:
                                                defensa1=defensa1+escuadron.getDamage();
                                        }
                                        System.out.println(PURPLE_FILL+"Haz Creado un Escuadron"+ANSI_RESET);
                                    }
                                    break;
                                case 3:
                                    Tropas elite = new Tropas(jugador1.getRaza(), "Tropa de Elite", jugador1.getHp()+50, jugador1.getDamage()+20, jugador1.getFdefensa()+2, jugador1.getFataque()+2, jugador1.getCostoH()+200, jugador1.getCostoCr()+100, jugador1.getCostoCi()+100);
                                    if(Basej1.getHierro()<(elite.getCosto_hierro()+200) || Basej1.getCristales()<(elite.getCosto_cristales()+100) || Basej1.getCircuitos()<(elite.getCosto_circuitos()+100)){
                                        System.err.println("No tienes Los Recursos Necesarios para Crear este Objeto");
                                    }
                                    //AGREGANDO AL CUARTEL
                                    else{
                                        Basej1.setHierro(Basej1.getHierro()-(elite.getCosto_hierro()+200));
                                        Basej1.setCristales(Basej1.getCristales()-(elite.getCosto_cristales()+100));
                                        Basej1.setCircuitos(Basej1.getCircuitos()-(elite.getCosto_circuitos()+100));
                                        System.out.println("Selecciona el Objetivo de la Tropa");
                                        System.out.println("1) Ataque \n 2) Defensa");
                                        int z = input.nextInt();
                                        //VALIDAR
                                        switch(z){
                                            case 1:
                                                TropasAtaque1.add(elite);
                                            case 2:
                                                defensa1=defensa1+elite.getDamage();
                                        }
                                        System.out.println(PURPLE_FILL+"Haz Creado una Tropa de Elite"+ANSI_RESET);
                                    }
                                    break;   
                            }
                        }
                    }
                    
                    break;
                case 3:
                    //Crear Vehiculos
                    for(int x=0;x<Edificiosj1.size();x++) {
                        if (Edificiosj1.get(x).getNombre() != "Fábrica de Vehiculos"){
                            System.err.println("Tienes que crear una Fabria de Vehiculos antes de Fabrica un Vehiculo");
                        }
                        else{
                            CrearVehiculos.MenuVehiculos();
                            CrearVehiculos.opcion=CrearVehiculos.input.nextInt();
                            //VALIDAR
                            switch(CrearVehiculos.getOpcion()){
                                case 1:
                                    Tropas vehiculoTierra = new Tropas(jugador1.getRaza(), "Vehiculo Terrestre", jugador1.getHp()+100, jugador1.getDamage()+15, jugador1.getFdefensa()+2, jugador1.getFataque()+2, jugador1.getCostoH()+500, jugador1.getCostoCr()+250, jugador1.getCostoCi()+300);
                                    if(Basej1.getHierro()<(vehiculoTierra.getCosto_hierro()+500) || Basej1.getCristales()<(vehiculoTierra.getCosto_cristales()+250) || Basej1.getCircuitos()<(vehiculoTierra.getCosto_circuitos()+300)){
                                        System.err.println("No tienes Los Recursos Necesarios para Crear este Objeto");
                                    }
                                    else{
                                        Basej1.setHierro(Basej1.getHierro()-(vehiculoTierra.getCosto_hierro()+500));
                                        Basej1.setCristales(Basej1.getCristales()-(vehiculoTierra.getCosto_cristales()+250));
                                        Basej1.setCircuitos(Basej1.getCircuitos()-(vehiculoTierra.getCosto_circuitos()+300));
                                        //AGREGARLOS AL CUARTEL
                                        System.out.println("Selecciona el Objetivo de la Tropa");
                                        System.out.println("1) Ataque \n 2) Defensa");
                                        int z = input.nextInt();
                                        //VALIDAR
                                        switch(z){
                                            case 1:
                                                TropasAtaque1.add(vehiculoTierra);
                                            case 2:
                                                defensa1=defensa1+vehiculoTierra.getDamage();
                                        }
                                        System.out.println(PURPLE_FILL+"Haz Creado un Vehiculo Terrestre"+ANSI_RESET);
                                    }
                                    break;
                                case 2:
                                    Tropas vehiculoAire = new Tropas(jugador1.getRaza(), "Vehiculo Aereo", jugador1.getHp()+150, jugador1.getDamage()+35, jugador1.getFdefensa()+3, jugador1.getFataque()+1, jugador1.getCostoH()+750, jugador1.getCostoCr()+500, jugador1.getCostoCi()+900);
                                    if(Basej1.getHierro()<(vehiculoAire.getCosto_hierro()+750) || Basej1.getCristales()<(vehiculoAire.getCosto_cristales()+500) || Basej1.getCircuitos()<(vehiculoAire.getCosto_circuitos()+900)){
                                        System.err.println("No tienes Los Recursos Necesarios para Crear este Objeto");
                                    }
                                    //AGREGARLOS AL CUARTEL
                                    else{
                                        Basej1.setHierro(Basej1.getHierro()-(vehiculoAire.getCosto_hierro()+750));
                                        Basej1.setCristales(Basej1.getCristales()-(vehiculoAire.getCosto_cristales()+500));
                                        Basej1.setCircuitos(Basej1.getCircuitos()-(vehiculoAire.getCosto_circuitos()+900));
                                        System.out.println("Selecciona el Objetivo de la Tropa");
                                        System.out.println("1) Ataque \n 2) Defensa");
                                        int a = input.nextInt();
                                        //VALIDAR
                                        switch(a){
                                            case 1:
                                                TropasAtaque1.add(vehiculoAire);
                                            case 2:
                                                defensa1=defensa1+vehiculoAire.getDamage();
                                        }
                                        System.out.println(PURPLE_FILL+"Haz Creado un Vehiculo Aereo"+ANSI_RESET);
                                    }
                                    break;
                            }
                        }
                    }
                    
                    break;
                case 4:
                    //Atacar
                    if(Edificiosj2.isEmpty()==true){
                        //ATACAR BASE
                        System.out.println("Seleccione la tropa con la que desea Atacar");
                        for(int i=0;i<TropasAtaque1.size();i++) {
                            System.out.println((i+1)+")"+TropasAtaque1.get(i).getNombre());
                        }
                        int x = input.nextInt();
                        Basej2.setHp(Basej2.getHp()-TropasAtaque1.get(x-1).getDamage());
                        System.out.println(RED_FILL+"ATACANDO LA BASE ENEMIGA!!!"+ANSI_RESET);
                        //DEFENDERSE
                        TropasAtaque1.get(x-1).setHp(TropasAtaque1.get(x-1).getHp()-defensa1);
                        if(TropasAtaque1.get(x-1).getHp()==0){
                            System.out.println("Tu "+ TropasAtaque1.get(x-1).getNombre()+" a sido destruido");
                            TropasAtaque1.remove(x-1);
                        }
                    }
                    else{
                        //CAMBIAR LA LISTA EDIFICIOS POR LA LISTA DEL JUGADOR 2
                        System.out.println("Seleccione El Edificio a Atacar");
                        for(int i=0;i<Edificiosj2.size();i++) {
                            System.out.println((i+1)+")"+Edificiosj2.get(i).getNombre());
                        }
                        int x = input.nextInt();
                        if(TropasAtaque1.isEmpty()==true){
                            System.err.println("Aun no tienes tropas para atacar");
                        }
                        else{
                        System.out.println("Seleccione la tropa con la que desea Atacar");
                        for(int i=0;i<TropasAtaque1.size();i++) {
                            System.out.println((i+1)+")"+TropasAtaque1.get(i).getNombre());
                        }
                        int y = input.nextInt();
                        Edificiosj2.get(x-1).setHp(Edificiosj2.get(x-1).getHp()-TropasAtaque1.get(y-1).getDamage());
                        System.out.println(RED_FILL+"Atacando "+Edificiosj2.get(x-1).getNombre()+" enemigo"+ANSI_RESET);
                        if(Edificiosj2.get(x-1).getHp()<=0){
                            Edificiosj2.remove(x-1); 
                        }
                        //DEFENDERSE
                        TropasAtaque1.get(y-1).setHp(TropasAtaque1.get(y-1).getHp()-defensa1);
                        if(TropasAtaque1.get(y-1).getHp()==0){
                            System.out.println("Tu "+ TropasAtaque1.get(y-1).getNombre()+" a sido destruido");
                            TropasAtaque1.remove(y-1);
                        }
                    }}
                    break;
                case 5:
                    //Mejorar Base
                    switch(Basej1.getNivel()){
                        case 0:
                            System.out.println("Nivel de la Base: " + Basej1.getNivel());
                            System.out.println("Costo de la Mejora");
                            System.out.println("Hierro: " +0.25*(capacidadHierro+(capacidadHierro*0.1)));
                            System.out.println("Cristales: " +0.25*(capacidadCristales+(capacidadCristales*0.1)));
                            System.out.println("Circuitos: " +0.25*(capacidadCircuitos+(capacidadCircuitos*0.1)));
                            if(Basej1.getHierro()<(0.25*(capacidadHierro+(capacidadHierro*0.1))) || Basej1.getCristales()<(0.25*(capacidadCristales+(capacidadCristales*0.1))) || Basej1.getCircuitos() <(0.25*(capacidadCircuitos+(capacidadCircuitos*0.1)))){
                                System.err.println("Aun no tienes los recursos necesarios para mejorar la Base");
                            }
                            else{
                                Basej1.setNivel(1);
                                capacidadHierro=(int) (capacidadHierro+(capacidadHierro*0.3));
                                capacidadCristales=(int) (capacidadCristales+(capacidadCristales*0.3));
                                capacidadCircuitos=(int) (capacidadCircuitos+(capacidadCircuitos*0.3));
                                Basej1.setHierro((int) (Basej1.getHierro()-(0.25*(capacidadHierro+(capacidadHierro*0.3)))));
                                Basej1.setCristales((int) (Basej1.getCristales()-(0.25*(capacidadCristales+(capacidadCristales*0.3)))));
                                Basej1.setCircuitos((int) (Basej1.getCircuitos()-(0.25*(capacidadCircuitos+(capacidadCircuitos*0.3)))));
                                Basej1.setNivel(1);
                            }
                            break;
                        case 1:
                            System.out.println("Nivel de la Base: " + Basej1.getNivel());
                            System.out.println("Costo de la Mejora");
                            System.out.println("Hierro: " +0.25*(capacidadHierro+(capacidadHierro*0.3)));
                            System.out.println("Cristales: " +0.25*(capacidadCristales+(capacidadCristales*0.3)));
                            System.out.println("Circuitos: " +0.25*(capacidadCircuitos+(capacidadCircuitos*0.3)));
                            if(Basej1.getHierro()<(0.25*(capacidadHierro+(capacidadHierro*0.3))) || Basej1.getCristales()<(0.25*(capacidadCristales+(capacidadCristales*0.3))) || Basej1.getCircuitos() <(0.25*(capacidadCircuitos+(capacidadCircuitos*0.3)))){
                                System.err.println("Aun no tienes los recursos necesarios para mejorar la Base");
                            }
                            else{
                                Basej1.setNivel(1);
                                capacidadHierro=(int) (capacidadHierro+(capacidadHierro*0.3));
                                capacidadCristales=(int) (capacidadCristales+(capacidadCristales*0.3));
                                capacidadCircuitos=(int) (capacidadCircuitos+(capacidadCircuitos*0.3));
                                Basej1.setHierro((int) (Basej1.getHierro()-(0.25*(capacidadHierro+(capacidadHierro*0.3)))));
                                Basej1.setCristales((int) (Basej1.getCristales()-(0.25*(capacidadCristales+(capacidadCristales*0.3)))));
                                Basej1.setCircuitos((int) (Basej1.getCircuitos()-(0.25*(capacidadCircuitos+(capacidadCircuitos*0.3)))));
                                Basej1.setNivel(2);
                            }
                            break;
                        case 2:
                            System.out.println("Nivel de la Base: " + Basej1.getNivel());
                            System.out.println("Costo de la Mejora");
                            System.out.println("Hierro: " +0.25*(capacidadHierro+(capacidadHierro*0.5)));
                            System.out.println("Cristales: " +0.25*(capacidadCristales+(capacidadCristales*0.5)));
                            System.out.println("Circuitos: " +0.25*(capacidadCircuitos+(capacidadCircuitos*0.5)));
                            if(Basej1.getHierro()<(0.25*(capacidadHierro+(capacidadHierro*0.5))) || Basej1.getCristales()<(0.25*(capacidadCristales+(capacidadCristales*0.5))) || Basej1.getCircuitos() <(0.25*(capacidadCircuitos+(capacidadCircuitos*0.5)))){
                                System.err.println("Aun no tienes los recursos necesarios para mejorar la Base");
                            }
                            else{
                                Basej1.setNivel(1);
                                capacidadHierro=(int) (capacidadHierro+(capacidadHierro*0.5));
                                capacidadCristales=(int) (capacidadCristales+(capacidadCristales*0.5));
                                capacidadCircuitos=(int) (capacidadCircuitos+(capacidadCircuitos*0.5));
                                Basej1.setHierro((int) (Basej1.getHierro()-(0.25*(capacidadHierro+(capacidadHierro*0.5)))));
                                Basej1.setCristales((int) (Basej1.getCristales()-(0.25*(capacidadCristales+(capacidadCristales*0.5)))));
                                Basej1.setCircuitos((int) (Basej1.getCircuitos()-(0.25*(capacidadCircuitos+(capacidadCircuitos*0.5)))));
                                Basej1.setNivel(3);
                            }
                            break;
                        default:
                            System.out.println(GREEN_FILL+"Tu Base esta a Maximo Nivel"+ANSI_RESET);
                    }
                    
                    break;
                case 6:
                    break;
            }

    }
    }

