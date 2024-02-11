package model;

public class Product {
    private String name;
    private Integer id;
    private Integer quantity;
    private EnumProductType productType;

    public Product(String name, Integer id, Integer quantity, EnumProductType productType) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.productType = productType;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public EnumProductType getProductType() {
        return productType;
    }

    public void setProductType(EnumProductType productType) {
        this.productType = productType;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", quantity=" + quantity +
                ", productType=" + productType +
                '}';
    }
}
