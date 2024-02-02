package edu.upvictoria.fpoo.EstructurasSelectivas.Problema6;

public class Presupuesto_evento {
    public static double Presupuesto_clientes_may_200(int cant_platillos){
        double precio =85;
        double precio_final= precio * cant_platillos;
        return precio_final;
    }
    public static double Presupuesto_clientes_mayor_300(int cant_platillos){

        double precio =75;
        double precio_final= precio * cant_platillos;
        return precio_final;
    }
    public static double Presupuesto_clientes_menor_200(int cant_platillos){
        double precio =95;
        double precio_final= precio * cant_platillos;
        return precio_final;
    }
}
