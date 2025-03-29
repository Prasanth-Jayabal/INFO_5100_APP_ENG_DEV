/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package stateTest;

/**
 *
 * @author prasanthj
 */
import org.junit.Test;
import static org.junit.Assert.*;
import state.Rover;


public class RoverTest {
     
    public RoverTest() {
    }
    


    // Unit Test for Rover States
@Test
public void testRoverStateTransitions() {
    Rover rover = new Rover();
    
        rover.pressLeftPedal(1);  // Accelerate forward
        assertEquals("AcceleratingForward", rover.getState());
        
        rover.pressRightPedal(1);  // Go to idle
        assertEquals("Idle", rover.getState());
        
        rover.pressLeftPedal(1);  // Accelerate forward
        assertEquals("AcceleratingForward", rover.getState());
        
        
        rover.pressRightPedal(4);  // Constant speed
        assertEquals("ConstantSpeed", rover.getState());
    }
    
}
