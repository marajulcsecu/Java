package CollectionAndGenerics.Map;

import java.util.HashMap;
import java.util.Map;

public class testingMap {
    public static void main(String[] args) {
        Map<String , Integer> map = new HashMap<>();
        map.put("marajul",21);
        map.put("soreful",31);
        map.put("sharifa",27);
        System.out.println(map.size());

        System.out.println(map.get("soreful"));
        System.out.println(map.containsKey("sharifa"));
        System.out.println(map.remove("marajul"));
        for (String s : map.keySet()) {
            System.out.printf("%s: %s\n",s,map.get(s));

        }
    }
}
