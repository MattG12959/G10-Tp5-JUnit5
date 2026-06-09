package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Antonacci Matías - Dave Natalia - Zerdá Nehuen
 */

@RunWith(Suite.class)

@Suite.SuiteClasses({

    ConversorMonedaTest.class,
    cotizacionTest.class,
    DolaritosTest.class
})

public class MiCoinSuite {

}
