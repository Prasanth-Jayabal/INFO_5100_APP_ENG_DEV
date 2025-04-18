/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state;
/**
 *
 * @author prasanthj
 */

public  class Backward implements RoverState {
    @Override
    public void pressLeftPedal(Rover rover, int duration) {}

    @Override
    public void pressRightPedal(Rover rover, int duration) {
        rover.setState(new Idle());
    }

    @Override
    public String getStateName() {
        return "AcceleratingBackward";
    }
}
