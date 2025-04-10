/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labassignment5;

/**
 *
 * @author prasanthj
 */
public class LabAssignment5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread t1 = new Thread(new ToneThread1());
        Thread t2 = new Thread(new ToneThread2());

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Done with Scale Melody\n\nNow playing Twinkle Twinkle...");

        TwinkleTwinklePlayer.playTwinkle();
    }

}
