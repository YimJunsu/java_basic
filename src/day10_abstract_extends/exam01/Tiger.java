package day10_abstract_extends.exam01;

public class Tiger extends Animal {
    @Override
    public void move() {     //메서드 재정의
        System.out.println("네 발로 뛰어다닌다.");
    }

    public void hunting() {
        System.out.println("사냥을 한다.");
    }
}
