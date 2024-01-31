package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
    public Menu(){

    }
    public void Mostrar_menu(){
        System.out.println("1)Determinar el valor mayor");
        System.out.println("2)Suma de 10 numeros");
        System.out.println("3)Cotizacion de lapices con descuento en mayoreo");
        System.out.println("4) ");
    }
    public void seleccion_opc() throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        int opc;
        System.out.println("elige el programa al cual se decea acceder: ");

    }
}
