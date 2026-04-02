public class Challenge {
    public static void main(String[] args) {
        boolean gameover = true;
        int score = 10000;
        int level = 8;
        int bonus = 100;
        int finalscore = score;

        if (gameover == true)
            finalscore += (level * bonus);
        System.out.println("youe finalscore is " + finalscore);
    }
}
public static void calculatescore