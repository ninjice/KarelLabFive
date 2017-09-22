
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DemocracyBot extends Robot
{
    private boolean beeperPresent;
    public DemocracyBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void fixBallots(int numberOfBoxes) {
        for(int n = numberOfBoxes; n > 0; n --){
            findBeeper();
            rigElection();
            n -= 1;
        } 
        
    }
    public void findBeeper(){
        move();
        if(nextToABeeper()){
            beeperPresent = true;
        }
        else{
            beeperPresent = false;
        }
        }
    public void exitBox(){
        while(!frontIsClear()){
                turnLeft();
            }  
        move();
        
    }
    public void rigElection(){
        turnLeft();
        move();
        if(beeperPresent == true){
            addVotes();
        }
        else{
            removeVotes();
        }
        while(!facingEast()){
            turnLeft();
        }
        move();
    }
    public void addVotes(){
        if(!nextToABeeper()){
            putBeeper();
        }
        exitBox();
        move();
        if(!nextToABeeper()){
            putBeeper();
        }
        exitBox();
    }
    public void removeVotes(){
        if(nextToABeeper()){
            pickPile();
        }
        exitBox();
        move();
        if(nextToABeeper()){
            pickPile();
        }
        exitBox();
    }
    public void pickPile(){
        while(nextToABeeper()){
            pickBeeper();
        }
    }
    }


