package study;

// 문자열
public class Study2 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = "hello world";
        String str4 = str3.replace("e", "a");

        System.out.print(str1.equals(str2));
        System.out.print(str3.indexOf("world"));
        System.out.print(str4);
        System.out.print(str4.substring(0, 3));
        System.out.print(str2.charAt(0));
    }
}
