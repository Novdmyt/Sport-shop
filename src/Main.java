public class Main {
    public static void main(String[] args) {
        OrderBuilder orderA = new OrderBuilder();
        OrderBuilder orderB = new OrderBuilder();

        orderA.addProduct(new TShirt("Красна","Active sports", 85f));
        orderA.addProduct(new Cap("Біла","Smart caps", 12.5f));

        orderB.addProduct(new TShirt("Синя","Active sports",92.4f));
        orderB.addProduct(new Cap("Чорна","Smart caps",10.99f));

        System.out.println("Order A:");
        orderA.showOrderDetails();

        System.out.println("Order B:");
        orderB.showOrderDetails();
    }
}
