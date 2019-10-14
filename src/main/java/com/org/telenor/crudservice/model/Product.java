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

    String parentName;
    String typeName;
    String iconSmall;
    String iconMedium;
    String iconLarge;
    String iconXLarge;
    String iconXXLarge;
    String promotionName;

    String cartQuantity;
    String cartPrice;

    public String getCartQuantity() {
        return cartQuantity;
    }

    public void setCartQuantity(String cartQuantity) {
        this.cartQuantity = cartQuantity;
    }

    public String getCartPrice() {
        return cartPrice;
    }

    public void setCartPrice(String cartPrice) {
        this.cartPrice = cartPrice;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getIconSmall() {
        return iconSmall;
    }

    public void setIconSmall(String iconSmall) {
        this.iconSmall = iconSmall;
    }

    public String getIconMedium() {
        return iconMedium;
    }

    public void setIconMedium(String iconMedium) {
        this.iconMedium = iconMedium;
    }

    public String getIconLarge() {
        return iconLarge;
    }

    public void setIconLarge(String iconLarge) {
        this.iconLarge = iconLarge;
    }

    public String getIconXLarge() {
        return iconXLarge;
    }

    public void setIconXLarge(String iconXLarge) {
        this.iconXLarge = iconXLarge;
    }

    public String getIconXXLarge() {
        return iconXXLarge;
    }

    public void setIconXXLarge(String iconXXLarge) {
        this.iconXXLarge = iconXXLarge;
    }

    public String getPromotionName() {
        return promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }




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
