public class Product {
    int itemNumber;
    String itemName;
    private double price;
    int qty;

    public void setPrice(double price) {
        if (price > 400) {
            throw new IllegalArgumentException("Invalid Price.");
        } else {
            System.out.println("This is the price");
        }
        this.price = price;
    }

    public int getItemNumber() {
        return this.itemNumber;
    }

    public String getItemName() {
        return this.itemName;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQty() {
        return this.qty;
    }

    public Product(String itemName, int qty, int itemNumber) {
        this.itemName = itemName;
        this.itemNumber = itemNumber;
        this.qty = qty;


    }


}
