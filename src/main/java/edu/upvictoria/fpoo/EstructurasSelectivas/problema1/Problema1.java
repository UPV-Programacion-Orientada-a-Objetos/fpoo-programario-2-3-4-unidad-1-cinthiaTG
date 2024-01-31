package edu.upvictoria.fpoo.EstructurasSelectivas.problema1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema1 {
    public Problema1() throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        /**
         * Se desea implementar un programa para determinar cuál de dos valores
         * proporcionados es el mayor.
         * **/
        double valor1, valor2, mayor;
        String entrada;
        System.out.println("Ingresa el primer valor: ");
        entrada = bufer.readLine();
        valor1 = Double.parseDouble(entrada);

        System.out.println("Ingresa el segundo valor: ");
        entrada = bufer.readLine();
        valor2 = Double.parseDouble(entrada);

        mayor = Comparar_valores.Comparar_dos_valores_mayor_que(valor1, valor2);
        System.out.println("El valor mayor es: "+ mayor);

    }
}
