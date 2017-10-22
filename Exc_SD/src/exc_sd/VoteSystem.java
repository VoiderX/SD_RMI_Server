/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exc_sd;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author gabriel
 */
public interface VoteSystem extends Remote{
    boolean createCandidate (String name) throws RemoteException;
    boolean voteToCandidate (String name) throws RemoteException;
    ArrayList<Candidate> getCandidates() throws RemoteException;
}
