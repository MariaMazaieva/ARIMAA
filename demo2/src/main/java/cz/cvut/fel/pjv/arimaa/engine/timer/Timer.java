package cz.cvut.fel.pjv.arimaa.engine.timer;

public class Timer {
    private int timeLimit;

    public Timer(int timeLimit){
        this.timeLimit = timeLimit;
    }

    public void setTimeLimit (int timeLimit){
        this.timeLimit = timeLimit;
    }

    public Timer(){
        this.timeLimit = Integer.MAX_VALUE;
    }

    public void startCount(){

    }

    public void stopCount(){

    }

    public int getTimeLeft(){
        return 0;
    }
}
