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

}
