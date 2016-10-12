/**
 * Created by rijkm on 10/10/2016.
 */
public class RationalAgent implements Agent{
    public int propose(Agent deliberator){
        return 1;
    }
    public boolean deliberate(int proposal, Agent proposer){
        return proposal >0;
    }
}
