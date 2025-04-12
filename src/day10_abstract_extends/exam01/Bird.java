package day10_abstract_extends.exam01;

public class Bird extends Animal{

    @Override
    protected void move() { // 메서드 재정의
        System.out.println("두 날개로 날아간다.");
    }
    public void singing(){
        System.out.println("노래를 한다.");
    }
}
