/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordvalidator_mon;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Administrator
 */
public class PasswordValidator_MonTest {
    
    public PasswordValidator_MonTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }


    /**
     * Test of checkLength method, of class PasswordValidator_Mon.
     */
    @Test
    public void testCheckLength() {
        System.out.println("checkLength Good");
        String password = "password1234";
        boolean expResult = true;
        boolean result = PasswordValidator_Mon.checkLength(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of checkUpperCase method, of class PasswordValidator_Mon.
     */
    @Test
    public void testCheckUpperCase() {
        System.out.println("checkUpperCase Good");
        String password = "Password1234";
        boolean expResult = true;
        boolean result = PasswordValidator_Mon.checkUpperCase(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of checkSpecial method, of class PasswordValidator_Mon.
     */
    @Test
    public void testCheckSpecial() {
        System.out.println("checkSpecial Good");
        String password = "Password1234!";
        boolean expResult = true;
        boolean result = PasswordValidator_Mon.checkSpecial(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
