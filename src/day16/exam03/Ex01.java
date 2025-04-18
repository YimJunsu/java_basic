package day16.exam03;

// 제네릭 사용전
// 제네릭 : 타입을 일반화해서 쓸 수 있는 기술, 어떤 타입이 들어올지 모르니 추후에 정하자
public class Ex01 {
    public static void main(String[] args) {
        Box appleBox = new Box();
        appleBox.setItem(new Apple());

        // 타입 안정성이 확보가 안됨
        Object obj = (Apple)appleBox.getItem(); // 형 변환 번거로윰
        if(obj instanceof Apple apple){
            System.out.println(apple.info());
        }
    }
}
