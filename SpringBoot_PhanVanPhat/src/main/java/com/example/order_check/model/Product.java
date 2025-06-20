package com.example.order_check.model;

public class Product {
    private String productId;
    private int sellerId;
    private String productName;
    private double price;
    private int stock;
    private String description;

    public Product() {}

    public Product(String productId, int sellerId, String productName, double price, int stock, String description) {
        this.productId = productId;
        this.sellerId = sellerId;
        this.productName = productName;
        this.price = price;
        this.stock = stock;
        this.description = description;
    }

    // Getter/Setter
    public String getProductId() { return productId; }
    public void setProductId(String productId) { this.productId = productId; }

    public int getSellerId() { return sellerId; }
    public void setSellerId(int sellerId) { this.sellerId = sellerId; }

    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}

