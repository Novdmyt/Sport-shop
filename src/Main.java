public class Main {
    public static void main(String[] args) {
        OrderBuilder orderA = new OrderBuilder();
        OrderBuilder orderB = new OrderBuilder();

        orderA.addItem(new TShirt("Красна","Active sports", 85f));
        orderA.addItem(new Cap("Біла","Smart caps", 12.5f));

        orderB.addItem(new TShirt("Синя","Active sports",92.4f));
        orderB.addItem(new Cap("Чорна","Smart caps",10.99f));

        System.out.println("Замовлення A:");
        orderA.showOrder();

        System.out.println("Замовлення B:");
        orderB.showOrder();
    }
}
