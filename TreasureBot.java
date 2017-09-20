
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class TreasureBot extends Robot
{    
    private int beepers;
    private int cluesNeeded;
    public TreasureBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public void findTreasure() {
        while(!(beepers == 5)){
            moveTillYouBeep();
            countBeepers();
            interpretClue(beepers);
        }
    }
    public void countBeepers(){
        beepers = 0;
        while(nextToABeeper()){
            beepers += 1;
            pickBeeper();
        }
        for(int n = beepers; n > 0; n--){
            putBeeper();
        }
    }
    public void interpretClue(int beepersPicked){
        if(beepersPicked == 1){
            while(!facingNorth()){
                turnLeft();
            }
        }
        else if(beepersPicked == 2){
            while(!facingEast()){
                turnLeft();
            }
        }
        else if(beepersPicked == 3){
            while(!facingSouth()){
                turnLeft();
            }
        }
        else{
            while(!facingWest()){
                turnLeft();
            }
        }
    }
    public void moveTillYouBeep(){
        move();
        while(!nextToABeeper()){
            move();
        }
    }
    public void victoryDance(int repeats){
        
        
    }
}

