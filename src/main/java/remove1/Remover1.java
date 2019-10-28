package remove1;

import java.util.ArrayList;
import java.util.List;

/**
 * Удалить из List числа, повторяющиеся три и больше раз подряд
 */
public class Remover1 {
    public List<Integer> remove(List<Integer> input) {
        if (input == null) {
            return null;
        }

        List<Integer> result = new ArrayList<>();

        int count = 0;
        for (int i = 0; i < input.size(); ++i) {
            if (i == 0 || !input.get(i).equals(input.get(i - 1))) {
                count = 1;
            } else {
                count++;
            }
            if (count < 3) {
                result.add(input.get(i));
            }
        }

        return result;
    }
}
