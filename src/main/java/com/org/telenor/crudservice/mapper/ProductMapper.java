package com.org.telenor.crudservice.mapper;


import com.org.telenor.crudservice.model.Product;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

/**
 * @author hamza.ahmed 26/09/19
 * MyBatis mapper for crud operations in database
 */


@Mapper
public interface ProductMapper {
    //get all products list
    @Select("select id as id,    name as productName, category_id as categoryId, img_src as imageSource, price as price, description as description from product")
    ArrayList<Product> getAll();

    // get product with id
    @Select("select id as id,    name as productName, category_id as categoryId, img_src as imageSource, price as price, description as description from product where id=#{id}")
    public Product getProductWithId(String id);

    // get product with category_id
    @Select("select id as id,    name as productName, category_id as categoryId, img_src as imageSource, price as price, description as description from product where category_id=#{category_id}")
    public ArrayList<Product> getProductWithCatId(String category_id);

    //search product with name
    @Select("select id as id,    name as productName, category_id as categoryId, img_src as imageSource, price as price, description as description from product where name like '%' #{query} '%' ")
    public ArrayList<Product> searchProduct(String query);

    //insert new product
    @Insert("insert into product (name,category_id,img_src,price,description) "+
            "values(#{productName},#{categoryId},#{imageSource},#{price},#{description})")
    public int insert(Product product);

    //update product
    @Update("update product set name=#{productName},category_id=#{categoryId},img_src=#{imageSource},price=#{price},description=#{description} where id=#{id}")
    public int update(Product product);

    //delete product
    @Delete("delete from product where id=#{id}")
    public int delete(Product product);
}
