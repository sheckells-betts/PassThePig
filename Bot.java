class Bot extends Player{
    public bot(String s){
        STRATEGY=s;
    }
    public bot(String n, String s){
        super.name=n;
        STRATEGY=s;
    }
}