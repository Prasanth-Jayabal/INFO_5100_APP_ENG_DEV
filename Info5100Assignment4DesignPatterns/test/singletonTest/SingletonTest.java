/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package singletonTest;
/**
 *
 * @author prasanthj
 */
import singleton.SingletonObject;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonTest {
    
    public SingletonTest() {
    }
    

   
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        SingletonObject expResult = SingletonObject.getInstance();
        SingletonObject result = SingletonObject.getInstance();
        assertEquals(expResult, result);
    }

    @Test
    public void testShowMessage() {
        System.out.println("showMessage");
        SingletonObject so = SingletonObject.getInstance();
        
        
        String expResult = "Hey Singleton Class";
        String result = so.showMessage();
        assertEquals(expResult, result);
        
        
        expResult = "Hello World";
        result = so.showMessage();
         assertNotEquals(expResult, result);
    }
    
}
