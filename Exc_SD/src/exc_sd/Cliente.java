/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exc_sd;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;

/**
 *
 * @author gabriel
 */
public class Cliente {
    //Controller class between Client GUI and the RMI Object
    VoteSystem channel;

    public void startClient() throws RemoteException, NotBoundException {
        Registry register = LocateRegistry.getRegistry("localhost", 1099);
        channel = (VoteSystem) register.lookup("VoteSystem");
    }    

    public boolean voteToCandidate(String name) throws RemoteException {
        return channel.voteToCandidate(name);
    }

    public ArrayList<Candidate> getCandidates() throws RemoteException {
        return channel.getCandidates();
    }
}
