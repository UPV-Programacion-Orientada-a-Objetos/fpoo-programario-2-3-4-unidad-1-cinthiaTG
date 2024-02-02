package edu.upvictoria.fpoo.EstructurasSelectivas.Problema6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema6 {
    public Problema6()throws IOException {
        /**
         * “La langosta ahumada” es una empresa dedicada a ofrecer banquetes; sus tarifas
         * son las siguientes: el costo de platillo por persona es de $95.00, pero si el número
         * de personas es mayor a 200 pero menor o igual a 300, el costo es de $85.00. Para
         * más de 300 personas el costo por platillo es de $75.00. Implemente un programa
         * que ayude a determinar el presupuesto que se debe presentar a los clientes que
         * deseen realizar un evento.
         * */
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        Double costo_total;
        int personas;
        System.out.println("dime la cantidad de personas que ingreso?: ");
        entrada= bufer.readLine();
        personas= Integer.parseInt(entrada);

        if (personas >=200&&personas<=300){
            costo_total= Presupuesto_evento.Presupuesto_clientes_may_200(personas);
        } else if (personas>300) {
            costo_total= Presupuesto_evento.Presupuesto_clientes_mayor_300(personas);
        }else {
            costo_total= Presupuesto_evento.Presupuesto_clientes_menor_200(personas);
        }
        System.out.println("El costo a pagar es: "+ costo_total);
    }
}
