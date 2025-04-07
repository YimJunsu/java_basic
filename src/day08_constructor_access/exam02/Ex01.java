package day08_constructor_access.exam02;

public class Ex01 {
    public static void main(String[] args) {
        Schedule s1 = new Schedule();
        s1.year = 2024;
        s1.month = 2;
        s1.day = 31; // 잘못된 값 - 통제 불가 = 2 월엔 31일이 없다.

        s1.showDate();
    }
}
