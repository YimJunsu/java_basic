package day10_abstract_extends.exam02;

public class Ex05 {
    public static void main(String[] args) {
        A ad = new D();

        A ac = new C();

        System.out.println(ac == ad); // false
        if(ad instanceof D){
            C c1 = (C)ad; // 본질적으로 출처가 다르기때문에 형변환 불가능 (error)
        }
    }
}
