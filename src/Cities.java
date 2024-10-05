import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Cities {
    public static void main(String[] args) {

        // Создаем ArrayList строк
        LinkedList<String> cities = new LinkedList<>();
        List<String> qwe = new ArrayList<>();

        // Добавляем в него города
        cities.add("Москва");
        cities.add("Новосибирск");
        cities.add("Орел");

        // Выводим список городов в консоль
        System.out.println("Список городов:");
        for (String city : cities) {
            System.out.println(city);
        }

        // Изменяем города по индексу
        cities.set(2, "Казань");
        cities.set(1, "Санкт-Петербург");
        // Попробуем также добавить Казань второй раз
        cities.add("Казань");

        // Выводим обновленный список городов в консоль
        System.out.println("Обновленный список городов:");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}