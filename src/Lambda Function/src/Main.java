@FunctionalInterface
interface RandomNumberGenerator {
    int generateRandomNumber(int x,int y);
}
public class Main {
    public static void main(String[] args) {
        RandomNumberGenerator r =
                (int x,int y) -> {
            int n= (int) (Math.random() * x);
            int m =(int) (Math.random() * y);
            return n*m%100;

        }
    }
}
