/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state;


 // Concrete States
public class Idle implements RoverState {
    @Override
    public void pressLeftPedal(Rover rover, int duration) {
        if (rover.getMode().equals("MOVEMENT")) {
            if (duration == 1) {
                rover.setState(new Forward());
            } else if (duration > 3) {
                rover.setState(new Backward());
            }
        } else if (rover.getMode().equals("CAMERA_DRILL")) {
            if (duration == 5) {
                rover.setState(new ColorCameraState());
            } else if (duration == 10) {
                rover.setState(new Camera16MMState());
            } else if (duration == 1) {
                rover.setState(new DrillOnState());
            }
        }
    }

    @Override
    public void pressRightPedal(Rover rover, int duration) {
        // Remain idle on right pedal press
    }

    @Override
    public String getStateName() {
        return "Idle";
    }
}