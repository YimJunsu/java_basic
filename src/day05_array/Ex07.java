package day05_array;
// 참조자료형 쓰기
public class Ex07 {
    public static void main(String[] args) {
        String[] items = {"AA", "BB", "CC", "DD"};

        for (String item : items){ // 향상된 for 문
            System.out.println(item);
        }
    }
}
