import java.util.List;
import java.util.ArrayList;

/**
 * Created by rijkm on 10/10/2016.
 */
public class Experiment {
    int nrOfAgents;
    int nrOfRounds;
    int nrOfGames;
    List<Agent> agentList;
    List<Round> roundList;

    public static void main(String[] args) {
      new Experiment().run();
    }

    public void run(){
        nrOfAgents = 10;
        nrOfRounds =3;
        nrOfGames =nrOfAgents/2;

        agentList=new ArrayList<Agent>();
        for(int i=0; i< nrOfAgents; i++){
            agentList.add(new RationalAgent());
        }
        roundList=new ArrayList<Round>();
        for(int i=0; i< nrOfRounds; i++){
            roundList.add(new Round(agentList,nrOfGames));
        }

        for(Round round:roundList){
            System.out.println("Round: " + roundList.indexOf(round));
            round.run();
        }
    }
}
