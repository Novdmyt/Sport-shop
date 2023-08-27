public class Cap implements  Item{

    private String color;
    private String manufacturer;
    private float price;

    public Cap(String color, String manufacturer, float price){
        this.color = color;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    @Override
    public String getName() {
        return color + " Кепка";
    }

    @Override
    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public float getPrice() {
        return price;
    }
}