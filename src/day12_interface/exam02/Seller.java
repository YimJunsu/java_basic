package day12_interface.exam02;

public interface Seller {
    int num = 10;

    void sell();

    default void order() {
        System.out.println("Seller - 주문");
    }
}
