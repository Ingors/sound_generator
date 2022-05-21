import music.player.*;
public class Main {
    public static void main(String[] args) {
        int start = 1;
        peaceOfSound(start);
        peaceOfSound(start - 2);
        peaceOfSound(start - 7);
        //Player player = new Player();
        //player.playSound(0, 500, 80, 69, 72, 76);
        //player.playSound(0, 500, 80, 69, 74, 77);
        //player.playSound(0, 500, 80, 67, 71, 74);
        //player.playSound(0, 500, 80, 67, 72, 76);
        //player.close();
    }
    public static void peaceOfSound(int x) {
        Player player = new Player();
        for(int i = 0; i < 32; i++) {
            player.playSound(0, 75, 80, x + 69);
            player.playSound(0, 75, 80, x + 72);
            player.playSound(0, 75, 80, x + 76);
            player.playSound(0, 75, 80, x + 81);


        }
        //player.close();
    }

}
