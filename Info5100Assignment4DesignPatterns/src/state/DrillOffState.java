/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state;

/**
 *
 * @author prasanthj
 */

class DrillOffState implements RoverState {
    @Override
    public void pressLeftPedal(Rover rover, int duration) {
        if (duration == 1) {
            rover.setState(new DrillOnState());
        }
    }

    @Override
    public void pressRightPedal(Rover rover, int duration) {}

    @Override
    public String getStateName() {
        return "DrillOff";
    }
}

