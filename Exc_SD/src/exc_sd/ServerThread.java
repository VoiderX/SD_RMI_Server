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
public class ServerThread extends Thread {
    //Simple thread to update informations
    ServerGUI sgui;

    public ServerThread(ServerGUI sgui) {
        this.sgui = sgui;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3000);
                sgui.cleanAndFillTable();
            } catch (Exception e) {
                //
            }
        }
    }

}
