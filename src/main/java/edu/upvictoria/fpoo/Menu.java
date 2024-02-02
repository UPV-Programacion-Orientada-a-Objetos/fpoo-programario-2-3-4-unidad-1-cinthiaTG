package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.EstructurasSelectivas.Problema3.Problema3;
import edu.upvictoria.fpoo.EstructurasSelectivas.Problema4.Problema4;
import edu.upvictoria.fpoo.EstructurasSelectivas.Problema5.Problema5;
import edu.upvictoria.fpoo.EstructurasSelectivas.Problema6.Problema6;
import edu.upvictoria.fpoo.EstructurasSelectivas.problema1.Problema1;
import edu.upvictoria.fpoo.EstructurasSelectivas.problema2.Problema2;

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
        System.out.println("4)El harapiento distinguido");
        System.out.println("5)Valor mayor");
        System.out.println("6)La langosta ahumada");
    }
    public void Opcion() {
        try (BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in))) {
            int opc = 0;
            Mostrar_menu();
            opc = Integer.parseInt(scanner.readLine());
            switch (opc) {
                case 1:
                    Problema1 ejercicio1 = new Problema1();
                    break;
                case 2:
                    Problema2 ejercicio2 = new Problema2();
                    break;
                case 3:
                    Problema3 ejercicio3 = new Problema3();
                    break;
                case 4:
                    Problema4 ejercicio4 = new Problema4();
                    break;
                case 5:
                    Problema5 ejercicio5 = new Problema5();
                    break;
                case 6:
                    Problema6 ejercicio6 = new Problema6();
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
