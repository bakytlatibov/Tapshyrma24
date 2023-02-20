import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer>set=new HashSet<>(Arrays.asList(3,6,5));
        Set<Integer>integers=new HashSet<>(Arrays.asList(2,5,6));

        System.out.println(symmetricDifference(set, integers));
    }



    public static Set<Integer> symmetricDifference(Set<?extends Integer>set1,Set<?extends Integer>set2) {
        Set<Integer>ts=  new HashSet<>();
        ts.addAll(set1);
        ts.addAll(set2);
        Iterator<Integer>it=ts.iterator();
        while (it.hasNext()){
            Integer item=it.next();
            if (set1.contains(item)&&set2.contains(item)){
                it.remove ();
            }
    }return ts;
    }

}





