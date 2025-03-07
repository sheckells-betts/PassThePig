public class Admin {
    private ArrayList<Integer> scores = new ArrayList<Integer>();
    private String[] rolls = { "Dot", "No Dot", "Razorback", "Trotter", "Snouter", "Leaning Jowler" };
    private double[] probs = { 34.90, 30.20, 22.4, 8.80, 3, 0.70 };

    public void roll(int hand,int player) {
        int score=hand;
        for (int i = 0 ; i < 2; i++ ){
            
            double temp = Math.random() * 100;
            if (temp > 100 - probs[5]){
                System.out.println(rolls[5]); 
                score+=15;
            }else if (temp > 100-probs[5]-probs[4]){
                System.out.println(rolls[4]);
                score += 10;
            }else if (temp > 100-probs[5]-probs[4]-probs[3]){
                System.out.println(rolls[3]);
                score+= 5;
            }else if (temp > 100-probs[5]-probs[4]-probs[3]-probs[2]){
                System.out.println(rolls[2]);
                score += 5;
            }else if (temp > 100-probs[5]-probs[4]-probs[3]-probs[2]-probs[1]){
                System.out.println(rolls[1]);
                score += 1;
            }else{
                System.out.println(rolls[0]);
                score += 1;
            } 

        }
        score(score,player);
    }
    private void score(int s, int player){
        System.out.println("hand score is "+s);
        scores[player]+=s;

        String pig1; 
        String pig2;


    }

}