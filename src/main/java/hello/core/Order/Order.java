package hello.core.Order;

public class Order {

    private Long memberId;
    private int itemPrice;
    private int discount;
    private  String itemName;

    public Order(Long memberId, int itemPrice, int discount, String itemName) {
        this.memberId = memberId;
        this.itemPrice = itemPrice;
        this.discount = discount;
        this.itemName = itemName;
    }

    public int calculaterPrice(){
        return itemPrice - discount;

    }
    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "memberId=" + memberId +
                ", itemPrice=" + itemPrice +
                ", discount=" + discount +
                ", itemName='" + itemName + '\'' +
                '}';
    }
}
