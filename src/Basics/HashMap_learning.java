import java.util.*;
public class HashMap_learning {
    public static void main(String[] args) {
        HashMap<String,String> H=new HashMap<>();
        H.put("animal","Cat");
        H.put("Car","Ferrari");
        H.put("Country","America");
        System.out.println(H);
        System.out.println(H.size());
        System.out.println(H.get("Car"));
        System.out.println(H.keySet());
    }
}
