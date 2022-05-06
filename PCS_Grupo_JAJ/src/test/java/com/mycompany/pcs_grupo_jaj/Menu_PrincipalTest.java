/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pcs_grupo_jaj;

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
public class Menu_PrincipalTest {
    
    public Menu_PrincipalTest() {
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
     * Test of asignarTrabajos method, of class Menu_Principal.
     */

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Menu_Principal.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of comprobarPrivilegios method, of class Menu_Principal.
     */
    @Test
    public void testComprobarPrivilegios() {
        System.out.println("comprobarPrivilegios");
        String funcionalidad = "";
        String accion = "";
        String usuario = "adminu";
        Menu_Principal instance = new Menu_Principal();
        int expResult = 0;
        int result = instance.comprobarPrivilegios(funcionalidad, accion, usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
