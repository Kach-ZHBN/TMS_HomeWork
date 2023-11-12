package homework;

import homework.homework16.Developer;
import org.testng.annotations.Test;

import java.util.*;

import static org.testng.Assert.*;

public class HomeworkSixteenTest {

    /**
     * Задача 1:
     * Создать коллекцию класса ArrayList наполнить ее элементами типа Integer. С помощью
     * Stream'ов:
     * - Удалить дубликаты
     * - Оставить только четные элементы
     * - Вывести сумму оставшихся элементов в стриме
     */
    @Test
    public void testTaskOne() {
        assertEquals(HomeworkSixteen.taskOne(new ArrayList<>()), 0);
        assertEquals(HomeworkSixteen.taskOne(List.of(2, 2, 2, 2, 2, 2)), 2);
        assertEquals(HomeworkSixteen.taskOne(List.of(5, 5, 5, 5, 5, 5, 5)), 0);
        assertEquals(HomeworkSixteen.taskOne(List.of(2, 5, 2, 5, 2, 5)), 2);
        assertEquals(HomeworkSixteen.taskOne(List.of(2, 4, 10, 4, 5, 4, 7, 3, 1, 6, 4, 3, 2, 4, 5, 4, 4)), 22);
    }

    /**
     * Задача *:
     * Создать набор данных в формате id-name, сохраненный в Map. Необходимо отобрать из
     * этого набора только те данные, id которых попадает в числовой диапазон 1/2/5/8/9/13.
     * Среди отобранных значений отобрать только те, которые имеют нечетное количество
     * букв в имени. После чего вернуть список List имен, записанных буквами задом наперед.
     */
    @Test
    public void testDifficultTask() {
        Map<Integer, String> map = new HashMap<>();
        assertEquals(HomeworkSixteen.difficultTask(map), Collections.emptyList());
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
        assertEquals(HomeworkSixteen.difficultTask(map), List.of("nairB", "drahciR", "mailliW", "yrreP"));
    }

    /**
     * При помощи стримов из списка, содержащего объекты Developer, вывести только те, id >
     * 10 и name начинается с ‘An’. На выходе получилась Map <String, List<Integer>> где ключом
     * будут все разработчики с одним именем, а значением список айдишек.
     */
    @Test
    public void testAdditionalTask() {
        List<Developer> developers = new ArrayList<>();
        assertEquals(HomeworkSixteen.additionalTask(developers), Collections.emptyMap());

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

        Map<String, List<Integer>> resultMap = new HashMap<>();
        resultMap.put("Andrew", List.of(11, 13, 14, 18));
        resultMap.put("Anna", List.of(15, 21));
        assertEquals(HomeworkSixteen.additionalTask(developers), resultMap);
    }
}