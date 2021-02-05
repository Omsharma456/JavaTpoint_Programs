public class Myriding {
    public void concat(String a, String b){
        System.out.println(a+b);
    }
}
class Ram extends Myriding{
    public void concat(String a, String b)
    {
        System.out.println(a+b);
    }
}
class Main extends Myriding{
    public static void main(String[] args) {
        Myriding obj=new Ram();
        obj.concat("OM","Sharma");
    }
}
