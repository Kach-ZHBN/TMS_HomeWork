package homework;

import homework.homework16.Developer;

import java.util.*;
import java.util.stream.Collectors;

public class HomeworkSixteen {
    public static void main(String[] args) {
        List<Integer> listForTaskOne = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            listForTaskOne.add(random.nextInt(100));
        }
        System.out.println(listForTaskOne);
        System.out.println(taskOne(listForTaskOne));



        Map<Integer, String> map = new HashMap<>();
        map.put(0, "Jeffrey");
        map.put(1, "Edward");//6
        map.put(2, "Brian");//5
        map.put(3, "Reginald");
        map.put(4, "James");
        map.put(5, "Richard");//7
        map.put(6, "Edward");
        map.put(7, "Craig");
        map.put(8, "William");//7
        map.put(9, "Perry");//5
        map.put(10, "Rafael");
        map.put(11, "Dennis");
        map.put(12, "Robert");
        map.put(13, "John");//4
        map.put(14, "Lloyd");
        map.put(15, "Joseph");
        System.out.println(difficultTask(map));

        List<Developer> developers = new ArrayList<>();
        developers.add(new Developer(0, "Jeffrey"));
        developers.add(new Developer(3, "Joseph"));
        developers.add(new Developer(5, "Brian"));
        developers.add(new Developer(7, "Reginald"));
        developers.add(new Developer(10, "Joseph"));
        developers.add(new Developer(11, "Andrew"));
        developers.add(new Developer(12, "James"));
        developers.add(new Developer(13, "Andrew"));
        developers.add(new Developer(14, "Andrew"));
        developers.add(new Developer(15, "Anna"));
        developers.add(new Developer(16, "Rafael"));
        developers.add(new Developer(17, "Joseph"));
        developers.add(new Developer(18, "Andrew"));
        developers.add(new Developer(19, "John"));
        developers.add(new Developer(20, "James"));
        developers.add(new Developer(21, "Anna"));
        Map<String, List<Integer>> stringListMap = additionalTask(developers);
        System.out.println(stringListMap);
    }

    /**
     * Задача 1:
     * Создать коллекцию класса ArrayList наполнить ее элементами типа Integer. С помощью
     * Stream'ов:
     * - Удалить дубликаты
     * - Оставить только четные элементы
     * - Вывести сумму оставшихся элементов в стриме
     */
    public static int taskOne(List<Integer> inputList) {
        return inputList.stream()
                .distinct()
                .filter(x -> x % 2 == 0).
                mapToInt(Integer::intValue)
                .sum();
    }

    /**
     * Задача *:
     * Создать набор данных в формате id-name, сохраненный в Map. Необходимо отобрать из
     * этого набора только те данные, id которых попадает в числовой диапазон 1/2/5/8/9/13.
     * Среди отобранных значений отобрать только те, которые имеют нечетное количество
     * букв в имени. После чего вернуть список List имен, записанных буквами задом наперед.
     */
    public static List<String> difficultTask(Map<Integer, String> inputMap) {
        return inputMap.entrySet().stream()
                .filter(k -> {
                    boolean isValidKey = k.getKey() == 1 || k.getKey() == 2 || k.getKey() == 5 ||
                            k.getKey() == 8 || k.getKey() == 9 || k.getKey() == 13;
                    boolean isValidValue = k.getValue().length() % 2 != 0;
                    return isValidKey & isValidValue;
                })
                .peek(k -> k.setValue(new StringBuilder(k.getValue()).reverse().toString()))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
    }

    /**
     * При помощи стримов из списка, содержащего объекты Developer, вывести только те, id >
     * 10 и name начинается с ‘An’. На выходе получилась Map <String, List<Integer>> где ключом
     * будут все разработчики с одним именем, а значением список айдишек.
     */
    public static Map<String, List<Integer>> additionalTask(List<Developer> inputList) {

        return inputList.stream()
                .filter(k -> k.getId() > 10)
                .filter(k -> k.getName().startsWith("An"))
                .collect(Collectors.groupingBy(
                        Developer::getName,
                        Collectors.mapping(
                                Developer::getId,
                                Collectors.toList()
                        )
                ));
    }
}


