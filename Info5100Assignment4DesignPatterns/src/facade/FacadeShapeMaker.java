/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author prasanthj
 */
package facade;

public class FacadeShapeMaker {
    
    private Shape circle;
    private Shape rectangle;
    private Shape square;
    
    public FacadeShapeMaker(){
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }
    
    public String drawCircle(){
        return this.circle.draw();
    }
    
    public String drawSquare(){
        return this.square.draw();
    }
    
    public String drawRectangle(){
        return this.rectangle.draw();
    }
}
