/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exc_sd;

import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author gabriel
 */
public class Servidor implements VoteSystem {
    //Controller Class between RMI object and the Server GUI
    ArrayList<Candidate> candidates = new ArrayList<>();   

    @Override
    public boolean createCandidate(String name) throws RemoteException {
        for(Candidate candidate: candidates){
            if(candidate.getName().equals(name)){
                return false;
            }
        }
        candidates.add(new Candidate(name.toUpperCase()));
        return true;
    }

    @Override
    public boolean voteToCandidate(String name) throws RemoteException {
        for (Candidate candidate : candidates) {
            if (candidate.getName().equals(name)) {
                candidate.setVotes(candidate.getVotes() + 1);
                return true;
            }
        }
        return false;
    }

    @Override
    public ArrayList<Candidate> getCandidates() throws RemoteException {
        return candidates;
    }

}
