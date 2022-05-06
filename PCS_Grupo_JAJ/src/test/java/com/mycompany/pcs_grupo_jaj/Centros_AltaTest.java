/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pcs_grupo_jaj;

import static com.mycompany.pcs_grupo_jaj.DBConexion.DRIVER;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alfonso
 */
public class Centros_AltaTest {

    Connection conn = null;

    public Centros_AltaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of crearNuevoCentro method, of class Centros_Alta.
     */
    @Test
    public void testCrearNuevoCentro() {
        String result;
        try //modificar el trabajo de la BBDD
        {
            System.out.println("crearNuevoCentro");
            String nombreCentro = "CentroTest";
            int capacidadProceso = 20000;
            int tamanoColaTrabajos = 4;
            String usuarioAdministrador = "adminc";
            Centros_Alta instance = new Centros_Alta();
            instance.crearNuevoCentro(nombreCentro, capacidadProceso, tamanoColaTrabajos, usuarioAdministrador);
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(DBConexion.URL,DBConexion.USUARIO,DBConexion.PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM centros_computacion WHERE c_nombre_centro=='"+nombreCentro+"'");
            if (rs.next()) {
                result = rs.getString(1);
                String expResult = "CentroTest";
                assertEquals(expResult, result);
            }         
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Centros_Alta.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Centros_Alta.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
