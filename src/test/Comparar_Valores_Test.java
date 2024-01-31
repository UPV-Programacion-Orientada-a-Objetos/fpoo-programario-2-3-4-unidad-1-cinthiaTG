import edu.upvictoria.fpoo.EstructurasSelectivas.problema1.Comparar_valores;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class Comparar_Valores_Test {
    @Test
    public void Calcular_numero_mayor_double(){
        double num1= 34.5, num2=9.67;
        Assert.assertEquals(34.5, Comparar_valores.Comparar_dos_valores_mayor_que(num1, num2), 0.001);
    }
    @Test
    public void Calcular_numero_mayor_int(){
        int num1= 23, num2=90;
        Assert.assertEquals(90, Comparar_valores.Comparar_dos_valores_mayor_que(num1,num2), 0.001);
    }
    @Test
    public void Calcular_numero_mayor_int_double (){
        int num1= 23;
        double num2= 90;
        Assert.assertEquals(90, Comparar_valores.Comparar_dos_valores_mayor_que(num1,num2), 0.001);
    }
    @Test
    public void Calcular_numero_mayor_double_int(){
        double num1=23;
        int num2=90;
        Assert.assertEquals(90, Comparar_valores.Comparar_dos_valores_mayor_que(num1,num2),0.001);
    }
    @Test
    public void Calcular_numero_mayor_float(){
        float num1= 23, num2= (float) 90.1;
        Assert.assertEquals(90.1, Comparar_valores.Comparar_dos_valores_mayor_que(num1,num2), 0.001);
    }
}
