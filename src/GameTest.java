import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {
    @Test

    public void shouldFindLoseIfGreenLight() {

        int[] arr = {5, 0, 9, 7, 0, 6};
        int actual = Game.firstMethod(arr);
        int expected = 0;
        Assertions.assertEquals(expected, actual, "Если isGreenLight=true");
    }

    @Test
    public void shouldFindLoseIfNoGreenLight() {
        int[] arr = {5, 0, 9, 7, 0, 6};
        int actual = Game.firstMethod(arr);
        int expected = 4;
        Assertions.assertEquals(expected, actual, "Если isGreenLight=false");
    }


    @Test
    public void shouldFindSpeedLoseIfGreenLight() {
        int[] arr = {5, 0, 9, 7, 0, 6};
        int[] actual = Game.secondMethod(arr);
        int[] expected = {};
        Assertions.assertArrayEquals(expected, actual, "Если isGreenLight=true");
    }

    @Test
    public void shouldFindSpeedLoseIfNoGreenLight() {
        int[] arr = {5, 0, 9, 7, 0, 6};
        int[] actual = Game.secondMethod(arr);
        int[] expected = {5, 9, 7, 6};
        Assertions.assertArrayEquals(expected, actual, "Если isGreenLight=false");
    }

    @Test
    public void shouldFindSpeedWinIfGreenLight() {
        int[] arr = {5, 0, 9, 7, 0, 6};
        int[] actual = Game.thirddMethod(arr);
        int[] expected = {5, 0, 9, 7, 0, 6};
        Assertions.assertArrayEquals(expected, actual, "Если isGreenLight=true");
    }

    @Test
    public void shouldFindSpeedWinIfNoGreenLight() {
        int[] arr = {5, 0, 9, 7, 0, 6};
        int[] actual = Game.thirddMethod(arr);
        int[] expected = {0, 0};
        Assertions.assertArrayEquals(expected, actual, "Если isGreenLight=false");
    }
}

