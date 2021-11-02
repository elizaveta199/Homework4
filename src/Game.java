import java.util.Arrays;

public class Game {

    public static int firstMethod(int[] game) {
        int x = 0;
        if (!Main.isGreenLight) {
            for (int speed : game) {
                if (speed > 0) {
                    x++;
                }
            }
        } else {
            x = 0;
        }
        return x;
    }

    public static int[] secondMethod(int[] game) {
        int x = 0;
        for (int i = 0; i < game.length; i++) {
            if (game[i] > 0) {
                x++;
            }
        }
        int[] speed = new int[x];
        int[] speed2 = {};
        if (!Main.isGreenLight) {
            for (int i = 0, p = 0; i < game.length; i++) {
                if (game[i] > 0) {
                    speed[p] = game[i];
                    p = p + 1;
                }
            }
            return speed;
        } else {
            System.out.println("Выбывших нет");
        }
        return speed2;
    }

    public static int[] thirddMethod(int[] game) {
        int x = 0;
        for (int i = 0; i < game.length; i++) {
            if (game[i] <= 0) {
                x++;
            }
        }

        if (!Main.isGreenLight) {
            int[] speed = new int[x];
            for (int i = 0, p = 0; i < game.length; i++) {
                if (game[i] <= 0) {
                    speed[p] = game[i];
                    p = p + 1;
                }
            }
            return speed;
        } else return game;
    }
}