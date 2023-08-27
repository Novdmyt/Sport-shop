public class TShirt implements Item{

    private String color;
    private String manufacturer;
    private float price;

    public TShirt(String color, String manufacturer, float price){
        this.color = color;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    @Override
    public String getName() {
        return " Футболка";
    }

    @Override
    public String getColor() {
        return color;
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
