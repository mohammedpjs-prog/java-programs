public class program1 {
    public static void main(String[] args) {
        calculatescore(true, 2000, 5, 100);
        calculatescore(true,20000,8,8000);

    }
    public static void calculatescore(boolean gameover, int score, int level, int bonus) {
        int finalscore = score;
        if (gameover == true) {
            finalscore += (level * bonus);
            System.out.println(" your final score was " + finalscore);
        }


    }
}


