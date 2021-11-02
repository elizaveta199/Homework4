import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 0, 4, 4, 5, 0};
        System.out.println("Выбыло " + Game.firstMethod(arr) + " игроков");
        System.out.println("Массив из скоростей выбывших:");
        System.out.println(Arrays.toString(Game.secondMethod(arr)));
        System.out.println("Массив из скоростей не выбывших:");
        System.out.println(Arrays.toString(Game.thirddMethod(arr)));
    }
}
