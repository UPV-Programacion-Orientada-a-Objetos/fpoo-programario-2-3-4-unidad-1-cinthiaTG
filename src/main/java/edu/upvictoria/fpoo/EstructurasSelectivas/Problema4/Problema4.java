package edu.upvictoria.fpoo.EstructurasSelectivas.Problema4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema4 {
    /**
     * Almacenes “El harapiento distinguido” tiene una promoción: a todos los trajes que
     * tienen un precio superior a $2500.00 se les aplicará un descuento de 15%, a todos
     * los demás se les aplicará sólo 8%. Implemente un programa para determinar el
     * precio final que debe pagar una persona por comprar un traje y de cuánto es el
     * descuento que obtendrá.
     * */
    public Problema4() throws IOException{
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        double  precio, precio_desc;
        System.out.println("Bienvenido a El harapiento distinguido!!");
        System.out.println("ingresa el precio del traje: ");
        entrada= bufer.readLine();
        precio= Integer.parseInt(entrada);

        if(precio<2500){
            precio_desc = Determinar_precio.determinar_precio_traje_menor_2500(precio);
        }else {
            precio_desc= Determinar_precio.determinar_precio_traje_mayor_2500(precio);
        }
        System.out.println("el precio es de: "+ precio_desc);

    }
}
