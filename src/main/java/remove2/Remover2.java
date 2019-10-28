package remove2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Удалить из List числа, повторяющиеся три и больше раз не обязательно подряд
 */
public class Remover2 {
    public List<Integer> remove(List<Integer> input) {
        if (input == null) {
            return null;
        }

        Map<Integer, Integer> numberCounter = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (Integer element : input) {
            if (numberCounter.containsKey(element)) {
                numberCounter.put(element, numberCounter.get(element) + 1);
            } else {
                numberCounter.put(element, 1);
            }

            if (numberCounter.get(element) < 3) {
                result.add(element);
            }
        }

        return result;
    }
}
