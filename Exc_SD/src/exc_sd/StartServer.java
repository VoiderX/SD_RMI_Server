/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exc_sd;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author gabriel
 */
public class StartServer {
    //Main class to start a Server Instance
    public static void main(String[] args) {
        Servidor s = new Servidor();
        try{
            VoteSystem channel = (VoteSystem) UnicastRemoteObject.exportObject(s, 0);
            Registry register = LocateRegistry.createRegistry(1099);
            register.bind("VoteSystem", channel);
            ServerGUI sgui= new ServerGUI();
            ServerThread st = new ServerThread(sgui);
            st.setDaemon(true);
            st.start();
            sgui.setVisible(true);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
