/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labassignment5;

/**
 *
 * @author prasanthj
 */
public class ToneThread1 extends Thread {

    String[] tones = {"do.wav", "mi.wav", "sol.wav", "si.wav", "do-octave.wav"};
    FilePlayer fp = new FilePlayer();

    @Override
    public void run() {
        for (String tone : tones) {
            try {
                fp.play("/Users/prasanthj/NetBeansProjects/Info5100LabAssignment5Multithreading/src/Sounds/" + tone);
                System.out.println("Thread1 played " + tone);
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
