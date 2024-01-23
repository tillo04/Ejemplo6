package org.example;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


    String nombrePrimerTenista;
    String apellidosPrimerTenista;
    String nombreSegundoTenista;
    String apellidoSegundoTenista;
    String driveTenista1;
    String driveTenista2;

    Integer rankingTenista1;
    Integer rankingTenista2;

    Double gananciaPartido=500000.0;

        Scanner leer = new Scanner(System.in);

        System.out.println("********Australian open software*******");
        System.out.println("------programacion de partido:");

        System.out.println("jugador 1");
        System.out.print("nombre: ");
        nombrePrimerTenista=leer.nextLine();
        System.out.print("apellidos: ");
        apellidosPrimerTenista=leer.nextLine();
        System.out.print("tipo de drive: ");
        driveTenista1=leer.nextLine();
        System.out.println("ranking: ");
        rankingTenista1=leer.nextInt();

        System.out.println("jugador 2");
        System.out.print("nombre: ");
        leer.nextLine();
        nombreSegundoTenista=leer.nextLine();
        System.out.print("apellidos: ");
        apellidoSegundoTenista=leer.nextLine();
        System.out.print("tipo de drive: ");
        driveTenista2=leer.nextLine();
        System.out.println("ranking: ");
        rankingTenista2=leer.nextInt();

                                    //1. preguntaremos si el jugador 1 estaentre los 20 mejores.

        if (rankingTenista1<=20){
                                    //EL TENISTA 1 ESTA ENTRE LOS PRIMEROS 20.
            if(rankingTenista2<=20){
                                   //EL TENISTA 1 ESTA ENTRE LOS PRIMEROS 20 Y ADEMAS EL TENISTA 2 TAMBIEN.

            }else {

            }

        }else {
                                 //EL TENISTA UNO NO ESTA ENTRE LOS PRIMEROS 20.
        }










    }
}