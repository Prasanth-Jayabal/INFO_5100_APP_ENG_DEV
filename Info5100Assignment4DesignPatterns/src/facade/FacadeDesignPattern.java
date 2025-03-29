/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;
/**
 *
 * @author prasanthj
 */

public class FacadeDesignPattern {

    public static void main(String[] args){
        
        FacadeShapeMaker smf = new FacadeShapeMaker();
        
        String circle1 = smf.drawCircle();
        System.out.println(circle1);
        
        String square1 = smf.drawSquare();
        System.out.println(square1);
        
        String rectangle1 = smf.drawRectangle();
        System.out.println(rectangle1);
    }
    
}
