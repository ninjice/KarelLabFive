
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DangerousBot extends Robot
{
    private int beepers;
    public DangerousBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public void choosePile() {
        
        countBeepers();
        findDirection(beepers);
        move();
        pickPile();
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
    public void findDirection(int input){
        if ((input % 2 == 0)){
            while(!facingEast()){
                turnLeft();
            }
        }
        else{
            while(!facingWest()){
                turnLeft();
            }
        }
    }
    public void pickPile(){
        while(nextToABeeper()){
            pickBeeper();
        }
    }
}

