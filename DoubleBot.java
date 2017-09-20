


import kareltherobot.*;

/**
 * Write a description of class Template here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoubleBot extends Robot
{
    // instance variables - replace the example below with your own
    private int beepers;

    /**
     * Constructor for objects of class Template
     */
     public DoubleBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }

    public void doubleBeepers()
    {
        move();
        countBeepers();
        move();
        putDouble();
        finish();
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
    public void putDouble(){
        for(int n = (beepers*2);  n > 0; n--){
            putBeeper();
        }
    }
    public void finish(){
        turnLeft();
        turnLeft();
        move();
        move();
        turnLeft();
        turnLeft();
    }
}
