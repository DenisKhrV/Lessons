import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueNames {
    public static void main(String[] args) {

        PriorityQueue<String> namesPriorityQueue =
                new PriorityQueue<>(Comparator.comparing(String::length));

        namesPriorityQueue.offer("Джон");
        namesPriorityQueue.offer("Мария");
        namesPriorityQueue.offer("Том");
        namesPriorityQueue.offer("Анна");

        // Смотрим, какой элемент в очереди первый.
        // Метод не должен удалить имя "Том"
        String first = namesPriorityQueue.peek();
        System.out.println("Первый элемент в очереди: " + first);

        // Выводим на экран элементы очереди в порядке приоритета и удаляем их.
        // Т.к. метод peek не удаляет первый элемент в очереди, мы должны
        // снова увидеть имя "Том".
        System.out.println("Элементы очереди в порядке приоритета: ");
        while (!namesPriorityQueue.isEmpty()) {
            String name = namesPriorityQueue.poll();
            System.out.println(name);
        }
        System.out.println(namesPriorityQueue.poll());
        // Вызываем метод element() для пустой очереди.
        // Должно быть выброшено исключение
        try {
            String firstAgain = namesPriorityQueue.element();
            System.out.println("Первый элемент в очереди: " + firstAgain);
        } catch (Exception e) {
            System.out.println("Исключение при вызове метода element(): " + e);
        }
    }
}