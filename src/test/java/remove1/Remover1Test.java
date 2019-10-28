package remove1;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Remover1Test {

    Remover1 remover = new Remover1();

    @Test
    public void removeTest() {
        List<Integer> input = Arrays.asList(1, 1, 1, 2, 3, 2, 2, 2, 4, 4, 4, 4);
        List<Integer> expectedResult = Arrays.asList(1, 1, 2, 3, 2, 2, 4, 4);

        List<Integer> result = remover.remove(input);

        assertArrayEquals(expectedResult.toArray(), result.toArray());
    }
}