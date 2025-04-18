package study;

public class Study3 {
    int a = 10;

    public static void main(String[] args) {
        int a = 0;
        System.out.println(++a); // 1
        System.out.println(++a); // 2
        a++;
        System.out.println(a); // 3
        System.out.println(a--); // 3
        a--;
        System.out.println(a--); // 2
        System.out.println(a); // 1

        while (a<3){
            System.out.println(a + " 시작");
            a++;
            System.out.println("안녕 a :" + a + "이야");
        }
    }
}
