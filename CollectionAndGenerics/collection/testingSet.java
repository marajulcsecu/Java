package CollectionAndGenerics.collection;

import java.util.HashSet;
import java.util.Set;

public class testingSet {
    public static void main(String[] args) {
        Set<String> names= new HashSet<>();
        System.out.println(names.add("marajul"));
        System.out.println(names.add("soreful"));
        System.out.println(names.add("dell"));
        Utility.print(names);
        System.out.println(names.add("soreful"));

        System.out.println(names.size());
        Utility.print(names);
        System.out.println(names.contains("marajul"));
        System.out.println(names.remove("soreful"));
        Utility.print(names);

    }
}
