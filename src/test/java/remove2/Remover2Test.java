package remove2;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Remover2Test {

    Remover2 remover = new Remover2();

    @Test
    public void removeTest() {
        List<Integer> input = Arrays.asList(1, 1, 2, 3, 3, 1, 2, 3, 4, 2, 3, 3);
        List<Integer> expectedResult = Arrays.asList(1, 1, 2, 3, 3, 2, 4);

        List<Integer> result = remover.remove(input);

        assertArrayEquals(expectedResult.toArray(), result.toArray());

    }
}