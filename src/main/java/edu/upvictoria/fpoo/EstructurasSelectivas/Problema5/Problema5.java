package edu.upvictoria.fpoo.EstructurasSelectivas.Problema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema5 {
    /**
     * Implemente un programa para determinar cuál de tres cantidades proporcionadas es
     * la mayor.
     * */

    public Problema5() throws IOException{
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        double val1, val2, val3, valor_mayor;
        System.out.println("dime el primer valor: ");
        entrada = bufer.readLine();
        val1 = Double.parseDouble(entrada);
        System.out.println("dime el segundo valor: ");
        entrada = bufer.readLine();
        val2 = Double.parseDouble(entrada);
        System.out.println("dime el tercer valor: ");
        entrada = bufer.readLine();
        val3 = Double.parseDouble(entrada);
        valor_mayor= Volor_mayor.Valor_mayor(val1, val2, val3);
        System.out.println("el valor mayor es: "+ valor_mayor);
    }
}
