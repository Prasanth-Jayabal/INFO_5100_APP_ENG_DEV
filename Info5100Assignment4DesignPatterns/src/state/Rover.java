/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state;
import org.junit.Test;
import static org.junit.Assert.*;


public class Rover {
    private RoverState state;
    private String mode;

    public Rover() {
        state = new Idle();
        mode = "MOVEMENT";
    }

    public void pressLeftPedal(int duration) {
        state.pressLeftPedal(this, duration);
    }

    public void pressRightPedal(int duration) {
        state.pressRightPedal(this, duration);
    }

    public void toggleMode() {
        mode = mode.equals("MOVEMENT") ? "CAMERA_DRILL" : "MOVEMENT";
    }

    public String getMode() {
        return mode;
    }

    public void setState(RoverState newState) {
        state = newState;
    }

    public String getState() {
        return state.getStateName();
    }
}
