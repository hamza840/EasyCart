package com.org.telenor.crudservice.mapper;


import com.org.telenor.crudservice.model.Employee;
import com.org.telenor.crudservice.model.Product;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

/**
 * @author hamza.ahmed 26/09/19
 * MyBatis mapper for crud operations in database
 */


@Mapper
public interface ProductMapper {
    @Select("select id as id, name as productName, category_id as categoryId, img_src as imageSource, price as price, description as description from product")
    ArrayList<Product> getAll();
    
    @Insert("insert into product (name,category_id,img_src,price,description) "+
            "values(#{productName},#{categoryId},#{imageSource},#{price},#{description})")
    public int insert(Product product);

    @Update("update product set name=#{productName},category_id=#{categoryId},img_src=#{imageSource},price=#{price},description=#{description} where id=#{id}")
    public int update(Product product);

    @Delete("delete from product where id=#{id}")
    public int delete(Product product);
}
