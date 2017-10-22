/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exc_sd;

/**
 *
 * @author gabriel
 */
public class StartClient {
    //Main class to start a Client instance
    public static void main(String[] args) {
        ClientGUI cgui =new ClientGUI();
        Thread ClientThread = new ClientThread(cgui);
        ClientThread.setDaemon(true);
        ClientThread.start();
        cgui.setVisible(true);
    }
    
}
