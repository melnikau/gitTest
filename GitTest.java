//Мельников
package gitTest;

import java.util.HashMap;
import java.util.Set;

public class GitTest {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(8, "Восемь");
        hashMap.put(9, "Девять");
        hashMap.put(10, "Десять");
        hashMap.put(11, "Одиннадцать");
        hashMap.put(12, "Двенадцать");
        hashMap.put(13, "Тринадцать");

        Set<Integer> keySet = hashMap.keySet();
        for (Integer value : keySet) {
            if (hashMap.get(value).contains("цать")) {
                System.out.println(value);
            }
        }
    }
}

