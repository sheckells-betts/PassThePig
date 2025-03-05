class Bot extends Player{
    public bot(String s){
        STRATEGY=s;
    }
    public bot(String n, String s){
        name=n;
        STRATEGY=s;
    }
}