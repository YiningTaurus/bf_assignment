package week1day4.P3OwnHashMap;

public class OwnHashmapTest {
    public static void main(String[] args) {
        OwnHashMap<String, Integer> map = new OwnHashMap<>(13);
        map.put("ONE", 1);
        map.put("TWO", 2);
        map.put("THREE", 3);
        System.out.println(map);
        System.out.println(map.get("ONE"));
        System.out.println(map.get("FOUR"));
    }
}
