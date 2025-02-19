package CollectionAndGenerics.collection;

import java.util.ArrayList;
import java.util.List;

public class testingList {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
strList.add("marajul");

strList.add("soreful");
strList.add(1,"sharifa");
strList.set(0,"hafsa");



strList.clear();
//strList.removeFirst();

        for (String s : strList) {
            System.out.println(s);
        }
        System.out.println(strList.contains("marajul"));
        System.out.println(strList.indexOf("marajul"));
//        System.out.println(strList.get(0));

    }
}
