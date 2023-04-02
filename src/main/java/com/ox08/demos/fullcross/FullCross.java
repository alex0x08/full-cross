/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.ox08.demos.fullcross;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.*;
/**
 * Main class for demo application
 * @author <a href="mailto:alex3.145@gmail.com">Alex Chernyshev</a>
 */
public class FullCross {
    /**
     * Create the GUI and show it. For thread safety, this method should be
     * invoked from the event-dispatching thread.
     */
    private static void createAndShowGUI() {
        final JFrame f = new MainJFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        // Check if UI is supported at all
        // Could be false only on Unixes, on Mac and Windows will be always true,
        // since we don't process -Djava.awt.headless=true argument 
        if (GraphicsEnvironment.isHeadless()) {
            System.out.println("Congratulations!");
            System.out.println("You just executed Java program!");
            System.out.println("Sadly, but GUI is not supported, so all you see is just this text.");
        } else {
            SwingUtilities.invokeLater(FullCross::createAndShowGUI);
        }
    }
}
