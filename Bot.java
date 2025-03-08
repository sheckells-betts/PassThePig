import java.util.ArrayList;

class Bot extends Player{

    public Bot(String n,String s){
        super(n);
        strategy = s;
    }
    public boolean wantsToRoll(int myScore, int handScore, ArrayList<Integer> otherScores, int winningScore) {
        if (myScore+handScore>=winningScore){
            return false;
        }else if (findMax(otherScores) > winningScore-15){
            return true;
        }else if (handScore > 35){
            return false;
        }else{
            return true;
        }


       
    }
    private int findMax(ArrayList<Integer> in){
        int max = 0;
        for (Integer a : in){
            if (a>max){
                max=a;
            }


        }
        return max; 
    }
    
}