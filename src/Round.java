import java.util.List;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by rijkm on 10/10/2016.
 */
public class Round {
    List<Agent> playerList;
    List<Game> gameList;

    public Round(List<Agent> agentList, int nrOfGames){
        this.playerList=new ArrayList<Agent>(agentList);
        gameList=new ArrayList<Game>();
        for(int i=0; i< nrOfGames; i++){
            int ri = new Random().nextInt(playerList.size());
            Agent proposer = playerList.get(ri);
            playerList.remove(ri);
            int ri2 = new Random().nextInt(playerList.size());
            Agent deliberator= playerList.get(ri2);
            playerList.remove(ri2);
            gameList.add(new Game(proposer, deliberator));
        }
    }

    public void run() {
        for(Game game:gameList){
            game.run();
        }
    }
}
