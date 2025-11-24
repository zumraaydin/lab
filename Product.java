public class Product {
    private String name;
    private int quantity;
    private double price;
    private int productld;
    private int idCounter;

    public Product(){
        name = "unknown";
        quantity = 0;
        price = 0;}
    public  Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getProductld() {
        return productld;
    }
    public void setProductld(int productld) {
        this.productld = productld;

    }
    public int getIdCounter() {
        return idCounter;

    }
    public void setIdCounter(int idCounter) {
        this.idCounter = idCounter;

    }

}


