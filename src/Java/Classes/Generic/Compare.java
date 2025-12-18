package Java.Classes.Generic;
import java.util.List;

class Compare<T extends Comparable<T>> {

    public T findMax(List<T> list) {
        T max = list.get(0);

        for (T value : list) {
            if (value.compareTo(max) > 0) {
                max = value;
            }
        }
        return max;
    }
}
