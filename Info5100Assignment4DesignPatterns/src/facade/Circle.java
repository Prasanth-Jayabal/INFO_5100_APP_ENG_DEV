/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

/**
 *
 * @author prasanthj
 */
public class Circle implements Shape {
    
    @Override
    public String draw(){
        System.out.println("Circle::draw()");
        return "Circle::draw()"; 
    }
    
}
