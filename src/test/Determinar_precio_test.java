import edu.upvictoria.fpoo.EstructurasSelectivas.Problema4.Determinar_precio;
import org.junit.Assert;
import org.junit.Test;

public class Determinar_precio_test {
    @Test
    public void Precio_traje_menor_a_2500_int(){
        int precio =2345;
        Assert.assertEquals(2157.4, Determinar_precio.determinar_precio_traje_menor_2500(precio), 0.001);
    }
    @Test
    public void Precio_traje_menor_a_2500_double(){
        double precio =2345;
        Assert.assertEquals(2157.4, Determinar_precio.determinar_precio_traje_menor_2500(precio), 0.001);
    }
    @Test
    public void Precio_traje_menor_a_2500_float(){
        float precio =2345;
        Assert.assertEquals(2157.4, Determinar_precio.determinar_precio_traje_menor_2500(precio), 0.001);
    }
    @Test
    public void Precio_traje_mayor_a_2500_float(){
        float precio =2345;
        Assert.assertEquals(2157.4, Determinar_precio.determinar_precio_traje_mayor_2500(precio), 0.001);
    }
    @Test
    public void Precio_traje_mayor_a_2500_int(){
        int precio =2345;
        Assert.assertEquals(2157.4, Determinar_precio.determinar_precio_traje_mayor_2500(precio), 0.001);
    }
    @Test
    public void Precio_traje_mayor_a_2500_double(){
        float precio =2345;
        Assert.assertEquals(2157.4, Determinar_precio.determinar_precio_traje_mayor_2500(precio), 0.001);
    }
}
