public class Product {
    private String productId;
    private String productName;
    private double price;
    private int stock;
    private String description;

    public Product(String productId, String productName, double price, int stock, String description) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.stock = stock;
        this.description = description;
    }

    public String getProductId() { return productId; }
    public String getProductName() { return productName; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }
    public String getDescription() { return description; }

    public void updateStock(int quantitySold) {
        if (quantitySold <= stock) {
            stock -= quantitySold;
            System.out.println("✅ Cap nhat so luong thanh cong. So luong con lai: " + stock);
        } else {
            System.out.println("❌ So luong ban khong hop le. Khong du hang!");
        }
    }

    public void displayProductInfo() {
        System.out.println("🆔 Ma san pham: " + productId);
        System.out.println("📛 Ten san pham: " + productName);
        System.out.println("💵 Gia: " + price);
        System.out.println("📦 So luong: " + stock);
        System.out.println("📝 Mo ta: " + description);
    }
}
