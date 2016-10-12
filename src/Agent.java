/**
 * Created by rijkm on 10/10/2016.
 */
public interface Agent {
    public int propose(Agent deliberator);
    public boolean deliberate(int proposal, Agent proposer);
}
