package com.org.telenor.crudservice.model;

public class Product {
    String id;
    String productName;
    String parentId;
    int price;
    String description;

    String typeId;
    String iconId;
    String promotionId;
    String totalProducts;
    String inStockProducts;


    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getIconId() {
        return iconId;
    }

    public void setIconId(String iconId) {
        this.iconId = iconId;
    }

    public String getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(String promotionId) {
        this.promotionId = promotionId;
    }

    public String getTotalProducts() {
        return totalProducts;
    }

    public void setTotalProducts(String totalProducts) {
        this.totalProducts = totalProducts;
    }

    public String getInStockProducts() {
        return inStockProducts;
    }

    public void setInStockProducts(String inStockProducts) {
        this.inStockProducts = inStockProducts;
    }



    public String getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public String getParentId() {
        return parentId;
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


    public void setParentId(String parentId) {
        this.parentId = parentId;
    }



    public void setPrice(int price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
