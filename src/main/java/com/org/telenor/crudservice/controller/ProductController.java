package com.org.telenor.crudservice.controller;


import com.org.telenor.crudservice.mapper.ProductMapper;
import com.org.telenor.crudservice.model.Product;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;

/**
 * @author hamza.ahmed 26/09/19
 * Rest controller for creating api for products
 */
@RestController
public class ProductController {
    @Resource
    ProductMapper productMapper;


    @GetMapping("/")
    public  String msg(){
        return "Hello from Product Controller";
    }
    @GetMapping("/getAllProducts")
    public ArrayList<Product> getAllProducts(){

        return productMapper.getAll();
    }

    /**
     *
     * @param product will take the values from the request body
     * @return will return the object to the mapper for inserting product in database
     */
    @RequestMapping(value = "/insertProduct",method = RequestMethod.POST)
        public int insertProduct(@RequestBody Product product){
        return productMapper.insert(product);
    }

    /**
     *
     * @param product will take the values from the request body
     * @return will return the object to the mapper for updating product in database
     */
    @RequestMapping(value = "/updateProduct",method = RequestMethod.PUT)
    public int update(@RequestBody Product product){
        return productMapper.update(product);
    }

    /**
     *
     * @param product will take the product id from the request body
     * @return will return the object to the mapper for deleting product in database
     */
    @RequestMapping(value = "/deleteProduct",method = RequestMethod.DELETE)
    public int delete(@RequestBody Product product){
        return productMapper.delete(product);
    }

    /**
     *
     * @param id will be used to find the product with particular id
     * @return
     */
    @RequestMapping(value = "/getProductWithId",method = RequestMethod.GET)
    public Product getWithId(@RequestParam("id") String id){
        return productMapper.getProductWithId(id);
    }

    /**
     *
     * @param category_id will be used to find products with particular category id
     * @return
     */
    @RequestMapping(value = "/getProductWithCatId",method = RequestMethod.GET)
    public ArrayList<Product> getWithCatId(@RequestParam("cat_id") String category_id){
        return productMapper.getProductWithCatId(category_id);
    }

    /**
     *
     * @param query will be used to search product matching with their name
     * @return
     */
    @RequestMapping(value = "/searchProduct",method = RequestMethod.GET)
    public ArrayList<Product> searchProduct(@RequestParam("query") String query){
        return productMapper.searchProduct(query);
    }


}
