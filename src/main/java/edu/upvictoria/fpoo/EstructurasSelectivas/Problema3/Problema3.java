package edu.upvictoria.fpoo.EstructurasSelectivas.Problema3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema3 {
    /**
     * Implemente un programa para determinar cuánto se debe pagar por X cantidad de
     * lápices considerando que si son 1000 o más el costo es de $3.65 por unidad; de lo
     * contrario, el precio es de $4.83.
     * */
    public Problema3() throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        int cant_lapices;
        double costo, total;
        System.out.println("Cuantos lapices se decea adquirir: ");
        entrada = bufer.readLine();
        cant_lapices= Integer.getInteger(entrada);

        if (cant_lapices>100){
            total = Cotizacion_lapices.Precion_total_lapices_myor_100(cant_lapices);
        }else{
            total = Cotizacion_lapices.Precion_total_lapices_menor_100(cant_lapices);
        }

        System.out.println("el monto a pagar es de: "+ total);

    }
}
