/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author prasanthj
 */
public class Camera16MMState implements RoverState {
    @Override
    public void pressLeftPedal(Rover rover, int duration) {}

    @Override
    public void pressRightPedal(Rover rover, int duration) {}

    @Override
    public String getStateName() {
        return "Camera16MM";
    }
}
