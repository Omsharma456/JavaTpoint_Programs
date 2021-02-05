import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Learning {
    public static void main(String[] args) {
        HashSet<String >H=new HashSet<>();
        H.add("Kanhaiya");
        H.add("OM");
        H.add("Sharma");
        System.out.println(H);
        Iterator<String> I= H.iterator();
        while (I.hasNext())
            System.out.println(I.next());
    }

}
