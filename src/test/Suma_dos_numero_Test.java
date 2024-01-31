import edu.upvictoria.fpoo.EstructurasSelectivas.problema2.Suma_dos_numeros;
import org.junit.Assert;
import org.junit.Test;

public class Suma_dos_numero_Test {
@Test
    public void  Sumar_numero_enteros(){
    int[] numeros= {1,2,3};
    Assert.assertEquals(6, Suma_dos_numeros.Sumar_numeros(numeros),0.001);
}
@Test
public void  Sumar_numero_double(){
    double[] numeros= {1.4,22.2,4.1};
    Assert.assertEquals(27.7, Suma_dos_numeros.Sumar_numeros(numeros),0.001);
}
@Test
    public void  Sumar_numero_float(){
        float[] numeros= {1,22,4};
        Assert.assertEquals(27.7, Suma_dos_numeros.Sumar_numeros(numeros),0.001);
    }

}
