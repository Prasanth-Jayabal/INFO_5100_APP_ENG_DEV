/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labassignment5;

import labassignment5.FilePlayer;

/**
 *
 * @author prasanthj
 */
public class ToneThread2 extends Thread {

    String[] tones = {"re.wav", "fa.wav", "la.wav", "do-octave.wav"};
    FilePlayer fp = new FilePlayer();

    @Override
    public void run() {
        for (String tone : tones) {
            try {
                if (tone.equals("do-octave.wav")) {
                    Thread.sleep(1500);
                    fp.play("/Users/prasanthj/NetBeansProjects/Info5100LabAssignment5Multithreading/src/Sounds/" + tone);
                    System.out.println("Thread2 played " + tone);
                    Thread.sleep(500);
                } else {
                    Thread.sleep(500);
                    fp.play("/Users/prasanthj/NetBeansProjects/Info5100LabAssignment5Multithreading/src/Sounds/" + tone);
                    System.out.println("Thread2 played " + tone);
                    Thread.sleep(500);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
