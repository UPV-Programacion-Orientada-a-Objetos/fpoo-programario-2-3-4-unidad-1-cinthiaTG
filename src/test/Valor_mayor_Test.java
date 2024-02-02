import edu.upvictoria.fpoo.EstructurasSelectivas.Problema5.Volor_mayor;
import org.junit.Assert;
import org.junit.Test;

public class Valor_mayor_Test {
    @Test
    public void Compara_valores_enteros(){
        int val1=1, val2= 9, val3=98;
        Assert.assertEquals(val3,Volor_mayor.Valor_mayor(val1,val2,val3), 0.001);
    }
    @Test
    public void Compara_valores_doubles(){
        double val1=1, val2= 9, val3=98;
        Assert.assertEquals(val3,Volor_mayor.Valor_mayor(val1,val2,val3), 0.001);
    }
    @Test
    public void Compara_valores_negativos_int_double(){
        int val1=15;
        double val2=-9;
        int val3=-80;
            Assert.assertEquals(val1,Volor_mayor.Valor_mayor(val1,val2,val3), 0.001);
    }
    @Test
    public void Compara_valores_int_double_double(){
        int val1=15;
        float val2=9.2f;
        float val3=9.8f;
        Assert.assertEquals(val1,Volor_mayor.Valor_mayor(val1,val2,val3), 0.001);
    }
    @Test
    public void Compara_valores_negativos_enteros(){
        int val1=-15;
        int val2=-19;
        int val3=-9;
        Assert.assertEquals(val3,Volor_mayor.Valor_mayor(val1,val2,val3), 0.001);
    }
    @Test
    public void Compara_valores_negativos_double(){
        double val1=-15.9;
        int val2=4;
        double val3=-19.3;
        Assert.assertEquals(val2,Volor_mayor.Valor_mayor(val1,val2,val3), 0.001);
    }
}
