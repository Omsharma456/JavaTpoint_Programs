import java.util.ArrayList;
import java.util.ListIterator;

/*ListIterator has predefined method for sorting of increasing and descending.
1.  public boolean hasNext();
2.  public Object next();
3.  public boolean hasPrevious();
4.  public Object previous();
 */
public class ListIterator_learning {
    public static void main(String[] args) {
        ArrayList<String> L=new ArrayList<>();
        L.add("ram");
        L.add("hari");
        L.add("GOpal");
        L.add("Shyam");
        L.add("GhanShyam");

        ListIterator<String> itr=L.listIterator();
        while (itr.hasNext())
            System.out.print(itr.next()+" ");
        System.out.println("");
        while (itr.hasPrevious())
            System.out.print(itr.previous()+" ");
    }
}
