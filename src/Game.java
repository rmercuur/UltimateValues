/**
 * Created by rijkm on 10/10/2016.
 */
public class Game {
    Agent proposer;
    Agent deliberator;
    int proposal;
    boolean accept;

    public Game(Agent proposer, Agent deliberator){
        this.proposer = proposer;
        this.deliberator = deliberator;
    }

    public void run() {
        proposal=proposer.propose(deliberator);
        System.out.println("Proposer: " +proposal);
        accept =deliberator.deliberate(proposal, proposer);
        System.out.println("Deliberator: " +accept);
    }
}
