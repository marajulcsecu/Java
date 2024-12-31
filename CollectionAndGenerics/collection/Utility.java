package CollectionAndGenerics.collection;

import java.util.Collection;
import java.util.Objects;

public class Utility {
    public static <E> void print(Collection<E> collection){
        for(E coll : collection){
            System.out.println(coll);
        }
    }
}
