import java.math.BigDecimal;

public class Item{

    private String name;
    private BigDecimal price;
    private int quantity;
    private String supplier;

    Item(String name, double price, int quantity, String supplier){
        this.name = name;
        this.price = BigDecimal.valueOf(price);
        this.quantity = quantity;
        this.supplier = supplier;
    }

    //attribute setters

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = BigDecimal.valueOf(price);
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }


    //attribute getters

    public String getName() {
        return name;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public String getSupplier() {
        return supplier;
    }


}