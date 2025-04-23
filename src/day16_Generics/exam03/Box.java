package day16_Generics.exam03;

// 제네릭이 없는 박스
public class Box {
    // Object 타입(모든 타입) 으로 넣고 꺼낼시 형변환
    private Object item;

    public void setItem(Object item) {
        this.item = item;
    }

    public Object getItem() {
        return item;
    }
}
