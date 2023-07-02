//        Реализуйте структуру телефонной книги с помощью HashMap
//        Программа также должна учитывать, что во входной структуре будут
//        повторяющиеся имена с разными телефонами, их необходимо считать,
//        как одного человека с разными телефонами. Вывод должен быть отсортирован
//        по убыванию числа телефонов.

package Sem_5.HW;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Hw {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "0");
        hashMap.putIfAbsent(1, "1");
        hashMap.get(1);

        Set<Integer> keys = hashMap.keySet();
        for (int i = 0; i < keys.size(); i++) {
            hashMap.replace(i, "J");
        }

        for (String v : hashMap.values()) {
            System.out.println(v);
        }

        hashMap.compute(1, (key, value) -> value == null ? "0" : value + "!");
        hashMap.computeIfAbsent(1, value -> "!");
        hashMap.computeIfPresent(1, (key, value) -> value == null ? "1" : "0");
        hashMap.containsKey(1);

        HashMap<Integer, Integer> hashMap1 = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            hashMap1.put(i, i);
        }
        hashMap1.replaceAll((k, v) -> hashMap1.compute(k, (key, value) -> value * value));
        System.out.println(hashMap1);
        hashMap1.merge(1, 5, (k, v) -> v);

        hashMap1.getOrDefault(1, 1);
        hashMap1.remove(1);

    }
}

