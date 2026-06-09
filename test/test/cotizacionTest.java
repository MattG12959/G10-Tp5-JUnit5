package test;
import org.junit.Assert;
import modelo.ConversorMoneda;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Antonacci Matías - Dave Natalia - Zerdá Nehuen
 */
public class cotizacionTest {
    @Before
    public void antesDeCadaPrueba() {

        System.out.println(
                "\nPreparando prueba de cotización...");
    }

    @Test
    public void testCotizarCero() {

        System.out.println(
                "Ejecutando: testCotizarCero");

        System.out.println(
                "Pesos: 180000");

        System.out.println(
                "Dólares: 0");

        System.out.println(
                "Se espera una ArithmeticException");

        ConversorMoneda c =
                new ConversorMoneda();

        Assert.assertThrows(
                ArithmeticException.class,
                () -> {

                    c.calcularCotizacion(
                            180000,
                            0);
                });
    }

    @After
    public void despuesDeCadaPrueba() {

        System.out.println(
                "Prueba finalizada.");
    }
}
    

