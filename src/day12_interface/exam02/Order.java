package day12_interface.exam02;

public class Order implements Buyer, Seller{
    @Override
    public void order() {
        Buyer.super.order();
        Seller.super.order();
    }

    @Override
    public void buy() {
        System.out.println("판매");
    }

    @Override
    public void sell() {
        System.out.println("구매");
    }
}

