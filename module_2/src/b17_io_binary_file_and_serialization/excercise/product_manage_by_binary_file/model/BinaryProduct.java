package b17_io_binary_file_and_serialization.excercise.product_manage_by_binary_file.model;

import java.io.Serializable;

public class BinaryProduct implements Serializable {
    private String idCode;
    private String name;
    private Double price;
    private String manufacturer;
    private String description = "None";

    public BinaryProduct(String idCode, String name, Double price, String manufacturer, String description) {
        this.idCode = idCode;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.description = description;
    }
    public BinaryProduct(String idCode, String name, Double price, String manufacturer) {
        this.idCode = idCode;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void show(){
        System.out.println("Sản phẩm : " + getName());
        System.out.println("- ID : " + getIdCode());
        System.out.println("- Giá : " + getPrice());
        System.out.println("- Nhà sản xuất : " + getManufacturer());
        System.out.println("- Mô tả : " + getDescription());
        System.out.println("");

    }
}
