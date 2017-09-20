
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class TreasureBot extends Robot
{   
    private int beepers;
    public TreasureBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public void findTreasure() {
        countBeepers();
        interpretClue(beepers);
    }
    public void countBeepers(){
        while(nextToABeeper()){
            beepers += 1;
            pickBeeper();
        }
        for(int n = beepers; n > 0; n--){
            putBeeper();
        }
    }
    public void interpretClue(int beepersPicked){
        
    }
    
}

