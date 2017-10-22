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
public class ClientThread extends Thread {
    //Simple thread to update informations 
    ClientGUI cgui;

    public ClientThread(ClientGUI cgui) {
        this.cgui = cgui;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3000);  //Updates the table every 3 seconds
                cgui.cleanAndFillTable();
            } catch (InterruptedException ex) {
                //
            }
        }
    }

}
