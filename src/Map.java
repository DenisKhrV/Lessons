import java.util.HashMap;

public class Map {

    public static void main(String[] args) {
        java.util.Map<String, Integer> carAndWeight = new HashMap<>();

        carAndWeight.put("Автобус",3);
        carAndWeight.put("Кабриолет", 1);
        carAndWeight.put("Джип", 2);
        System.out.println(carAndWeight);
    }
}