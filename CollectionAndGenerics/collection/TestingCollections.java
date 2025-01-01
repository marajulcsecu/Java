package CollectionAndGenerics.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestingCollections {
    public static void main(String[] args) {
        List<Integer> integerList =new ArrayList<>();
        integerList.add(5);
        integerList.add(2);
        integerList.add(8);
        integerList.add(-76);
        Utility.print(integerList);
        Collections.sort(integerList);
        Utility.print(integerList);
        Collections.reverse(integerList);
        Utility.print(integerList);


//        List<Integer> unModifiable= Collections.unmodifiableList(integerList);
//
//        unModifiable.add(5);
//
    }
}
