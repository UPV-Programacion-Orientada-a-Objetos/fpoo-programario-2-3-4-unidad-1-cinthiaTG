package edu.upvictoria.fpoo.EstructurasSelectivas.problema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema2 {
    /**
     * Implemente un programa para obtener la suma de diez números flotantes mediante la utilización
     * de un ciclo Repite.
     */
    public Problema2() throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        double[] numeros= new double[10];
        double suma=0;
        String entrada;
        for(int i=0; i< 10; i++){
            System.out.println("Ingresa un numero: ");
            entrada= bufer.readLine();
            numeros[i]= Double.parseDouble(entrada);
        }
        suma= Suma_diez_numeros.Sumar_numeros(numeros);
        System.out.println("La suma total es de: "+ suma);
    }
}
