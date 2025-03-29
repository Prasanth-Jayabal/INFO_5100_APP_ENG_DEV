/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package factoryTest;

import factory.FactoryShape;
import factory.Circle;
import factory.Rectangle;
import factory.Square;
import factory.Shape;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author prasanthj
 */
public class ShapeFactoryTest {
    
    public ShapeFactoryTest() {
    }
    

   
    @Test
    public void testGetShape() {
        System.out.println("getShape");
        
       
        String shapeType = "Circle";
        FactoryShape instance = new FactoryShape();
        Shape expResult = new Circle();
        Shape result = instance.getShape(shapeType);
        assertEquals(expResult.getClass(), result.getClass());
        
        shapeType = "Square";
        expResult = new Square();
        result = instance.getShape(shapeType);
         assertEquals(expResult.getClass(), result.getClass());

        shapeType = "Rectangle";
        expResult = new Rectangle();
        result = instance.getShape(shapeType);
         assertEquals(expResult.getClass(), result.getClass());
    }
    
}
