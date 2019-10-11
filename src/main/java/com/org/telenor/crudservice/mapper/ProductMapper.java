package com.org.telenor.crudservice.mapper;


import com.org.telenor.crudservice.model.Comment;
import com.org.telenor.crudservice.model.Product;
import com.org.telenor.crudservice.model.Ratting;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

/**
 * @author hamza.ahmed 26/09/19
 * MyBatis mapper for crud operations in database
 */


@Mapper
public interface ProductMapper {
    //get all products list
    @Select("SELECT product.id as id, product.product_name as productName, product.parent_id as parentId, p.product_name as parentName, product.description as description, product.type_id as typeId, type.type_name as typeName, product.icon_id as iconId, icon.small as iconSmall, icon.medium as iconMedium, icon.large as iconLarge, icon.xlarge as iconXLarge, icon.xxlarge as iconXXLarge, product.promotion_id as promotionId, promotion.promotion_name as promotionName, product.total_products as totalProducts, product.in_stock_products as inStockProducts, product.price as price FROM product LEFT JOIN product as p ON product.parent_id=p.id INNER JOIN type ON product.type_id=type.id LEFT JOIN icon ON product.icon_id=icon.id LEFT JOIN promotion ON product.promotion_id =promotion.id WHERE product.type_id=1")
    ArrayList<Product> getAll();

    //get Detailed Product
    @Select("SELECT product.id as id, product.product_name as productName, product.parent_id as parentId, p.product_name as parentName, product.description as description, product.type_id as typeId, type.type_name as typeName, product.icon_id as iconId, icon.small as iconSmall, icon.medium as iconMedium, icon.large as iconLarge, icon.xlarge as iconXLarge, icon.xxlarge as iconXXLarge, product.promotion_id as promotionId, promotion.promotion_name as promotionName, product.total_products as totalProducts, product.in_stock_products as inStockProducts, product.price as price FROM product LEFT JOIN product as p ON product.parent_id=p.id INNER JOIN type ON product.type_id=type.id LEFT JOIN icon ON product.icon_id=icon.id LEFT JOIN promotion ON product.promotion_id =promotion.id WHERE product.type_id=1 and product.id=#{id}")
    Product getPrductDetail(String id);

    // get product with id
    @Select("select id as id,    product_name as productName, parent_id as parentId, type_id as typeId, icon_id as iconId, promotion_id as promotionId, total_products as totalProducts, in_stock_products as inStockProducts, price as price, description as description from product where id=#{id}")
    public Product getProductWithId(String id);

    // get product with category_id
    @Select("SELECT product.id as id, product.product_name as productName, product.parent_id as parentId, p.product_name as parentName, product.description as description, product.type_id as typeId, type.type_name as typeName, product.icon_id as iconId, icon.small as iconSmall, icon.medium as iconMedium, icon.large as iconLarge, icon.xlarge as iconXLarge, icon.xxlarge as iconXXLarge, product.promotion_id as promotionId, promotion.promotion_name as promotionName, product.total_products as totalProducts, product.in_stock_products as inStockProducts, product.price as price FROM product LEFT JOIN product as p ON product.parent_id=p.id INNER JOIN type ON product.type_id=type.id LEFT JOIN icon ON product.icon_id=icon.id LEFT JOIN promotion ON product.promotion_id =promotion.id WHERE product.type_id=1 and product.parent_id=#{id}")
    public ArrayList<Product> getProductWithCatId(String id);

    //search product with name
    @Select("select id as id, product_name as productName, parent_id as parentId, type_id as typeId, icon_id as iconId, promotion_id as promotionId, total_products as totalProducts, in_stock_products as inStockProducts, price as price, description as description from product where product_name like '%' #{query} '%' ")
    public ArrayList<Product> searchProduct(String query);

    //insert new product
    @Insert("insert into product (product_name, parent_id, description, type_id, icon_id, promotion_id, total_products, in_stock_products, price) "+
            "values(#{productName},#{parentId},#{description},#{typeId},#{iconId},#{promotionId},#{totalProducts},#{inStockProducts},#{price})")
    public int insert(Product product);

    //insert product comment
    @Insert("insert into comment (comment_detail, product_id, user_id) values(#{commentDetail},#{productId},#{userId})")
    public int insertComment(Comment comment);

    //get comment of a particular product
    @Select("select id as id, comment_detail as commentDetail, product_id as productId, user_id as userId from comment where product_id=#{p_id} ")
    public ArrayList<Comment> getComments(String p_id);

    //insert product rating
    @Insert("insert into ratting (rate, product_id, user_id) values(#{rate},#{productId},#{userId})")
    public int insertRatting(Ratting ratting);

    //get ratting of a particular product
    @Select("select id as id, rate as rate, product_id as productId, user_id as userId from ratting where product_id=#{p_id} ")
    public ArrayList<Ratting> getRatting(String p_id);

    //update product
    @Update("update product set product_name=#{productName},parent_id=#{parentId},type_id=#{typeId},price=#{price},description=#{description}, icon_id=#{iconId}, promotion_id=#{promotionId}, total_products=#{totalProducts},in_stock_products=#{inStockProducts} where id=#{id}")
    public int update(Product product);

    //delete product
    @Delete("delete from product where id=#{id}")
    public int delete(Product product);

    //get list of main categories
    @Select("select id as id, product_name as productName, type_id as typeId from product where type_id=2")
    ArrayList<Product> getCategories();

    //get list of sub categories
    @Select("select id as id, product_name as productName, parent_id as parentId, type_id as typeId from product where parent_id=#{parent_id} and type_id=3")
    ArrayList<Product> getSubCategories(String parent_id);




}
