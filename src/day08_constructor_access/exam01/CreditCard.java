package day08_constructor_access.exam01;

public class CreditCard {
    int cardNo;
    String holder;
    String validDate;

    public CreditCard(int _cardNo, String _holder, String _vaildDate){
        cardNo = _cardNo;
        holder = _holder;
        validDate = _vaildDate;
    }

    void showInfo() {
        System.out.printf("cardNo=%d, holder=%s, vaildDate=%s%n", cardNo, holder, validDate);
    }
}
