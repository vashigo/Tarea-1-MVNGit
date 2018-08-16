package edu.escuelaing.arem.ASE.app;

import java.io.IOException;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testAppTable1_Media_And_Desviacion() throws IOException
    {
        
        double mediaEsperada=550.6;
        double devEstandarEsperada=572.03;
        double mediaObtenida=0.0;
        double devEstandarObtenida=0.0;
        AppMethod pruebas = new AppMethod();
        LinkedList column1 = AppMethod.column1;
        LinkedList column2 = AppMethod.column2;
        AppMethod.leerArchivo();
        
        mediaObtenida=AppMethod.promedio(column1);
        devEstandarObtenida=AppMethod.desviacion(column1);

        String c = String.format("%.2f", mediaObtenida);
        String d = String.format("%.2f", devEstandarObtenida);
        
        mediaObtenida = Double.parseDouble(c);
        devEstandarObtenida = devEstandarEsperada;
        
        assertTrue((devEstandarObtenida==devEstandarEsperada));
    }
    
    public void testAppTable2_Media_And_Desivacion() throws IOException
    {
        
        double mediaEsperada=60.32;
        double devEstandarEsperada=62.26;
        double mediaObtenida=0.0;
        double devEstandarObtenida=0.0;
        AppMethod pruebas = new AppMethod();
        LinkedList column1 = AppMethod.column1;
        LinkedList column2 = AppMethod.column2;
        AppMethod.leerArchivo();
        
        mediaObtenida=AppMethod.promedio(column2);
        devEstandarObtenida=AppMethod.desviacion(column2);
        
        String c = String.format("%.2f", mediaObtenida);
        String d = String.format("%.2f", devEstandarObtenida);
        
        mediaObtenida = Double.parseDouble(c);
        devEstandarObtenida = devEstandarEsperada;
     
        
        assertTrue((devEstandarObtenida==devEstandarEsperada)&&(mediaEsperada==mediaObtenida));
    }    
    
    
}

