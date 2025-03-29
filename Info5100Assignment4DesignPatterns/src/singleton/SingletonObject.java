/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;
/**
 *
 * @author prasanthj
 */
public class SingletonObject {
    
    private static SingletonObject instance = new SingletonObject();
    
    private SingletonObject(){
        
    }
    
    public static SingletonObject getInstance(){
        return instance;
    } 
 
    public String showMessage(){
        System.out.println("Hello Singleton Class!");
        return "Hey Singleton Class";
    }
           
}
