package dz6;

public class Notebook {
    private String brand;
    private String model;
    private int ramSize;
    private int storageSize;
    private String color;
    private double price;
    
    // Конструктор класса
    public Notebook(String brand, String model, int ramSize, int storageSize, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.ramSize = ramSize;
        this.storageSize = storageSize;
        this.color = color;
        this.price = price;
    }
    
    // Геттеры и сеттеры для полей класса
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
