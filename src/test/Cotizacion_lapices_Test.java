import edu.upvictoria.fpoo.EstructurasSelectivas.Problema3.Cotizacion_lapices;
import org.junit.Assert;
import org.junit.Test;

public class Cotizacion_lapices_Test {
    @Test
    public void cotizar_compra_de_mas_de_100_lapices(){
        int cant_lapices=102;
        Assert.assertEquals(372.3, Cotizacion_lapices.Precion_total_lapices_myor_100(cant_lapices), 0.001);
    }
    @Test
    public void cotizar_compra_de_menos_de_100_lapices(){
        int cant_lapices=2;
        Assert.assertEquals(9.66, Cotizacion_lapices.Precion_total_lapices_menor_100(cant_lapices), 0.001);
    }
}
