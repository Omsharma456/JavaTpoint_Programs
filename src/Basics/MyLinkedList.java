import java.util.LinkedList;

public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList<String> L=new LinkedList<>();
        L.add("Om Sharma");                         //add keyword is used for adding the elements in linkedList or arrayList
        L.add("Manish Sharma");
        L.add("Vivek");
        L.add("Jatin");
        L.addFirst("Aashish");                  //'addFirst' is used for adding element at first inex
        L.addLast("Rahul");                     //'addLast' is used for adding element at last inex
        System.out.println(L);
        System.out.println(L.size());               //'size' is used for finding length
        L.removeFirst();                           //'removeFirst' is used for removing element at first inex
        L.removeLast();                            //'removeLast' is used for removing element at last inex
        System.out.println(L);
        L.clear();                                  //'clear' is used for clearing all elements from LinkedList.
        System.out.println(L);

        LinkedList<String> list=new LinkedList<>();
        list.add("Krishna");
        list.add("Shiva");
        list.add("Ram");
        list.add("Gopal");
        list.add("Ramayan");
        //adding elements at particular index
        list.add(2,"Kanhaiya");
        //for deleting the element by index and direct giving element
        list.remove("Gopal");
        list.remove(2);

        //for updation in LinkedList
        list.set(2,"Engineer");
        System.out.println(list);
        System.out.println(list.isEmpty());
        int n= (int) 3E4;
        System.out.println(n);
    }
}
