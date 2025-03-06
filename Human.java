import java.util.Scanner;

class Human extends Player {
    Scanner in = new Scanner(System.in);

    public Human() {
        super("Human");
        strategy = "Human";
    }

}