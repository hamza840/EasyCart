package com.org.telenor.crudservice.model;

public class Product {
    String id;
    String productName;
    String categoryId;
    int price;
    String description;
    String imageSource;

    public void setImageSource(String imageSource) {
        this.imageSource = imageSource;
    }

    public String getImageSource() {
        return imageSource;
    }

    public String getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategoryId() {
        return categoryId;
    }



    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }



    public void setPrice(int price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
