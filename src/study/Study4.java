package study;

public class Study4 {
    public static void main(String[] args) {
        Box a = new Box(3);
        Box b = new Box(3);
        Box[] arr = {a, b};
        Box temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        arr[0].x += arr[1].x;
        System.out.println(b.x);
    }
}
class Box {
    int x;
    public Box(int x) {
        this.x = x;
    }
}
