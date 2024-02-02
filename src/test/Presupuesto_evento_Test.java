import edu.upvictoria.fpoo.EstructurasSelectivas.Problema6.Presupuesto_evento;
import org.junit.Assert;
import org.junit.Test;

public class Presupuesto_evento_Test {
    @Test
    public static void costo_mayor_300(){
        int personas=332;
        Assert.assertEquals(24900, Presupuesto_evento.Presupuesto_clientes_mayor_300(personas),0.001);
}
@Test
    public static void costo_menor_200(){
        int personas=33;
        Assert.assertEquals(3135, Presupuesto_evento.Presupuesto_clientes_menor_200(personas),0.001);
    }
    @Test
    public static void costo_menor_300_mayor_oigual200(){
        int personas=200;
        Assert.assertEquals(17000, Presupuesto_evento.Presupuesto_clientes_mayor_300(personas),0.001);
    }

}
