public class String_Learning {
    public static void main(String[] args) {
        String s=new String("Hello"+"World");
        String a=s.toLowerCase();
        String b=s.toUpperCase();
        int c=s.length();
        System.out.println("In Lowercase:"+a+"  In Uppercase:"+b+"  Length of String:"+c);
        System.out.println(s.indexOf("W"));
        System.out.println(s.concat("ram"));
        System.out.println(s.charAt(2));
    }
}
