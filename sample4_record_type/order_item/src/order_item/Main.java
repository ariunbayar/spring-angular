package order_item;

public class Main {
    public static void main(String[] args) {
        OrderItem item = new OrderItem("BOOK123", 2, 19.99);
        System.out.println(item); // Output: OrderItem[productId=BOOK123, quantity=2, price=19.99]
    }
}
