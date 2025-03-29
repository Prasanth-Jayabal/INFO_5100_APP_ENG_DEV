/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package facadeTest;
/**
 *
 * @author prasanthj
 */
import facade.FacadeShapeMaker;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class FacadeShapeMakerTest {
    
    public FacadeShapeMakerTest() {
    }


    
    @Test
    public void testDrawCircle() {
        System.out.println("drawCircle");
        FacadeShapeMaker instance = new FacadeShapeMaker();
        
       
        String expResult = "Circle::draw()";
        String result = instance.drawCircle();
        assertEquals(expResult, result);
        
      
        expResult = "Rectangle::draw()";
        result = instance.drawCircle();
        assertNotEquals(expResult, result);
    }

   
    @Test
    public void testDrawSquare() {
        System.out.println("drawSquare");
        FacadeShapeMaker instance = new FacadeShapeMaker();
        
     
        String expResult = "Square::draw()";
        String result = instance.drawSquare();
        assertEquals(expResult, result);
        
         
        expResult = "Rectangle::draw()";
        result = instance.drawSquare();
        assertNotEquals(expResult, result);
    }

  
    @Test
    public void testDrawRectangle() {
        System.out.println("drawRectangle");
        FacadeShapeMaker instance = new FacadeShapeMaker();
        
        String expResult = "Rectangle::draw()";
        String result = instance.drawRectangle();
        assertEquals(expResult, result);
      
       
        
        expResult = "Circle::draw()";
        result = instance.drawRectangle();
        assertNotEquals(expResult, result);
    }
    
}
