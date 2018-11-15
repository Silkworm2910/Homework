package lessons.lesson12;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        User user = new User(21, "Пользователь");
        System.out.println(System.identityHashCode(user));
        System.out.println(user.hashCode());

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Elem 1");
        map1.put(1, "Elem 2");
        map1.put(3, "Elem 4");
        map1.put(2, "Elem 3");
        map1.put(null, "Elem null");
        System.out.println(map1);
        System.out.println(map1.get(1));

//        Перебрать элементы map
        for (Map.Entry entry : map1.entrySet()) {
            System.out.println("Key: " + entry.getKey() +
                    " Value: " + entry.getValue());
        }

        Map<Integer, String> map2 = new LinkedHashMap<>();
        map2.put(1, "Elem 1");
        map2.put(1, "Elem 2");
        map2.put(3, "Elem 4");
        map2.put(2, "Elem 3");
        map2.put(null, "Elem null");

        System.out.println(map2);
        System.out.println(map2.get(1));

        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Elem 1");
        treeMap.put(1, "Elem 2");
        treeMap.put(3, "Elem 4");
        treeMap.put(2, "Elem 3");
//        treeMap.put(null, "Elem null");

        System.out.println(treeMap);
        System.out.println(treeMap.get(1));

//лист ключей
//        List keyList = new ArrayList(map.keySet());
//лист значений
//        List valueList = new ArrayList(map.valueSet());
//лист ключ-значения
//        List entryList = new ArrayList<>(map.entrySet());


        // свои объекты и классы
        User user1 = new User(1, "Вася");
        User user2 = new User(2, "Саша");
        User user3 = new User(4, "Женя");

        TreeSet<User> userTreeSet = new TreeSet<>();
        userTreeSet.add(user1);
        userTreeSet.add(user2);
        userTreeSet.add(user3);
        System.out.println(userTreeSet);

        Map<Integer, String> treeMapComp = new TreeMap<>(map1);
        treeMapComp.putAll(map1);

    }


}
