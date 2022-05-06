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
public class Trabajos_AltaTest {

    Connection conn = null;

    public Trabajos_AltaTest() {
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
     * Test of main method, of class Trabajos_Alta.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Trabajos_Alta.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of altaTrabajo method, of class Trabajos_Alta.
     */
    @Test
    public void testAltaTrabajo() {
        String result;
        try //modificar el trabajo de la BBDD
        {
            System.out.println("altaTrabajo");
            String nombreTrabajo = "TrabajoTest";
            int cantidadOperaciones = 100;
            String usuarioPropietario = "admina";
            String usuario = "admina";
            Trabajos_Alta instance = new Trabajos_Alta();
            instance.altaTrabajo(nombreTrabajo, cantidadOperaciones, usuarioPropietario, usuario);
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(DBConexion.URL,DBConexion.USUARIO,DBConexion.PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM trabajos_centros WHERE t_nombre_trabajo=='"+nombreTrabajo+"'");
            if (rs.next()) {
                result = rs.getString(1);
                String expResult = "TrabajoTest";
                assertEquals(expResult, result);
            }
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
