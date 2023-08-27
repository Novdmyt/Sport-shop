import java.util.ArrayList;
import java.util.List;

public class OrderBuilder {
    private List<Item> items = new ArrayList<>();
    public void addProduct(Item sport) {
        items.add(sport);
    }
    public float getTotalCost(){
        float totalCost = 0.0f;
        for (Item item : items){
            totalCost += item.getPrice();
        }
        return totalCost;
    }
    public void showOrderDetails() {
        for (Item item : items) {
            System.out.println("Назва: " + item.getName());
            System.out.println("Колір: "+ item.getColor());
            System.out.println("Виробник: " + item.getManufacturer());
            System.out.println("Ціна: " + item.getPrice());
            }
        System.out.println("Всього до сплати: " + getTotalCost());
        System.out.println();
    }
}
