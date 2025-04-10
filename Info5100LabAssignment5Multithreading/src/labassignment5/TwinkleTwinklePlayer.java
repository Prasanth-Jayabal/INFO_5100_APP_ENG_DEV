/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labassignment5;

/**
 *
 * @author prasanthj
 */
public class TwinkleTwinklePlayer {
    public static FilePlayer fp = new FilePlayer();
      public static void playTwinkle() {
        String[] sequence = {
            "do", "do", "sol", "sol", "la", "la", "sol",
            "fa", "fa", "mi", "mi", "re", "re", "do",
            "sol", "sol", "fa", "fa", "mi", "mi", "re",
            "sol", "sol", "fa", "fa", "mi", "mi", "re",
            "do", "do", "sol", "sol", "la", "la", "sol",
            "fa", "fa", "mi", "mi", "re", "re", "do"
        };

        for (String note : sequence) {
            new Thread(() -> fp.play("/Users/prasanthj/NetBeansProjects/Info5100LabAssignment5Multithreading/src/Sounds/" + note + ".wav")).start();
            try { Thread.sleep(500); } catch (InterruptedException e) { }
        }
    }
}
