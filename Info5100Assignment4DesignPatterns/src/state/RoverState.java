/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package state;

interface RoverState {
    void pressLeftPedal(Rover rover, int duration);
    void pressRightPedal(Rover rover, int duration);
    String getStateName();
}
