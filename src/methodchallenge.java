public class methodchallenge {
    public static void main(String[] args){
        int highscoreposition = calculatehighscoreposition(1000);
        displayhighscoreposition(  "tim",highscoreposition);
        highscoreposition = calculatehighscoreposition(99);
        displayhighscoreposition(  "d",highscoreposition);
        highscoreposition = calculatehighscoreposition(789);
        displayhighscoreposition(  "f",highscoreposition);
        highscoreposition = calculatehighscoreposition(7);
        displayhighscoreposition(  "v",highscoreposition);
    }
    public static void displayhighscoreposition(String playername,int highscoreposition){
        System.out.println(playername + " manage to get into position "  +
                highscoreposition  +  " on the high score list ");
    }
    public static  int calculatehighscoreposition(int playerscore){
        if (playerscore >= 1000) {
            return 1;
        }else if (playerscore >=500 && playerscore < 1000){
            return 2;
        }else if (playerscore >= 100 && playerscore < 500){
            return 3;
        }else {
            return 4;
        }

    }
}
