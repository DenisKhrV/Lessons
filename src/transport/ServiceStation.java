package transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {
    public static Queue<Transport<?>> queue = new LinkedList<>();

    public static void addTransportToQueue(Transport<?> transport) {
        queue.add(transport);
        System.out.println("Авто " + transport.getMark() + " добавлено в очередь");
    }

    public static void doTechnicalInspection() {
        if (queue.peek() == null) {
            System.out.println("Очередь пуста");
        }
        if (queue.peek().getClass() == Bus.class) {
            System.out.println("Автомобиль " + queue.peek() + "не нуждается в диагностике");
            queue.remove();
        } else {
            String s = queue.poll().getMark();
            System.out.println("Автомобиль " + s + " прошёл ТО");
        }
    }

    public static void allTI(){
        while (queue.peek() != null) {
            doTechnicalInspection();
        }
    }
}
