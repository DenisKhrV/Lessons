import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        // В этой строке создается экземпляр класса LinkedList,
        // который имплементирует интерфейс Queue.
        // После этого мы можем использовать методы интерфейса Queue
        // на объекте queue.

        // Теперь добавляем элементы в очередь.
        // Метод add добавляет элемент в конец очереди.
        // Метод offer делает то же самое, но возвращает false,
        // если очередь заполнена.
        // В данном примере мы добавляем в очередь два элемента.
        queue.add("элемент 1");
        queue.offer("элемент 2");
        queue.add("элемент 3");

        // Поскольку метод remove в данном случае наследуется из Queue,
        // он удаляет и возвращает головной элемент из очереди.
        // Метод peek возвращает головной элемент без удаления.
        // В данном примере мы удаляем первый элемент из очереди
        // и выводим на экран головной элемент при помощи метода peek.
//        String headElement = queue.remove();
//        System.out.println("Удаленный элемент: " + headElement);
//        String headElement2 = queue.remove();
//        System.out.println("Удаленный элемент: " + headElement2);
//        String headElement3 = queue.remove();
//        System.out.println("Удаленный элемент: " + headElement3);
//        for (String s : queue) {
//            s = queue.remove(); //ConcurrentModificationException
//            System.out.println(s);
        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
            iterator.remove();
        }
//        queue.removeIf(element -> iDontLikeThisElement(element));


        // Метод contains проверяет наличие элемента в очереди.
        // В примере мы проверяем наличие элемента "элемент 1" в очереди.
        String peekElement = queue.peek();
        System.out.println("Первый элемент в очереди: " + peekElement);

        // Метод size возвращает количество элементов в очереди.
        // В данном примере мы выводим размер очереди.
        boolean isElementExist = queue.contains("элемент 1");
        System.out.println("Наличие элемента в очереди: " + isElementExist);

        // Получаем размер очереди
        int queueSize = queue.size();
        System.out.println("Размер очереди: " + queueSize);
    }
}

// Результат в консоли:
// Удаленный элемент: элемент 1
// Первый элемент в очереди: элемент 2
// Наличие элемента в очереди: false
// Размер очереди: 1