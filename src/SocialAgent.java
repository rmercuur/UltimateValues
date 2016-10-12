import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rijk on 10/12/2016.
 */
public class SocialAgent implements Agent {
    List<Value> values;
    Value selfEnhancement;
    Value selfTranscendence;

    public SocialAgent(){
        super();
        selfEnhancement =new SelfEnhancement(1);
        selfTranscendence =new SelfTranscendence(1);
        values =new ArrayList<Value>();
        values.add(selfEnhancement);
        values.add(selfTranscendence);
    }
    @Override
    public int propose(Agent deliberator) {
        return (int) ((selfEnhancement.getStrength()/selfTranscendence.getStrength()) * 10);
    }

    @Override
    public boolean deliberate(int proposal, Agent proposer) {
        return proposal <50;
    }
}
