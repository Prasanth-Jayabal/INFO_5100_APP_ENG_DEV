/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state;

public class Forward implements RoverState {
    @Override
    public void pressLeftPedal(Rover rover, int duration) {}

    @Override
    public void pressRightPedal(Rover rover, int duration) {
        if (duration > 3) {
            rover.setState(new ConstantSpeedState());
        } else {
            rover.setState(new Idle());
        }
    }

    @Override
    public String getStateName() {
        return "AcceleratingForward";
    }
}

