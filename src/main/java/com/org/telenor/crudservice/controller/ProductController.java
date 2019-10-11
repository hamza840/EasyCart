package com.org.telenor.crudservice.controller;


import com.org.telenor.crudservice.mapper.ProductMapper;
import com.org.telenor.crudservice.model.Comment;
import com.org.telenor.crudservice.model.Product;
import com.org.telenor.crudservice.model.Ratting;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;

/**
 * @author hamza.ahmed 26/09/19
 * Rest controller for creating api for products
 */
@RestController
@RequestMapping(value= "/product")
public class ProductController {
    @Resource
    ProductMapper productMapper;


    @GetMapping(value = "/")
    public  String msg(){
        return "Hello from Product Controller";
    }

    @GetMapping("/getAllProducts")
    public ArrayList<Product> getAllProducts(){


        return productMapper.getAll();
    }

    @GetMapping("/getproductdetail")
    public Product getAllProductDetail(@RequestParam("id") String id){
        return productMapper.getPrductDetail(id);
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
     * @param comment will take the values from the request body
     * @return will return the object to the mapper for inserting comment in database
     */
    @RequestMapping(value = "/insertcomment",method = RequestMethod.POST)
    public int insertComment(@RequestBody Comment comment){
        return productMapper.insertComment(comment);
    }

    /**
     *
     * @param ratting will take the values from the request body
     * @return will return the object to the mapper for inserting rating of product in database
     */
    @RequestMapping(value = "/insertratting",method = RequestMethod.POST)
    public int insertComment(@RequestBody Ratting ratting){
        return productMapper.insertRatting(ratting);
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
     * @param p_id will be used to find the product comment with particular product id
     * @return
     */
    @RequestMapping(value = "/getproductcomment",method = RequestMethod.GET)
    public ArrayList<Comment> getComments(@RequestParam("p_id") String p_id){
        return productMapper.getComments(p_id);
    }

    /**
     *
     * @param p_id will be used to find the product rattings with particular product id
     * @return
     */
    @RequestMapping(value = "/getproductratting",method = RequestMethod.GET)
    public ArrayList<Ratting> getRattings(@RequestParam("p_id") String p_id){
        return productMapper.getRatting(p_id);
    }

    /**
     *
     * @param id will be used to find products with particular category id
     * @return
     */
    @RequestMapping(value = "/getproductwithcatid",method = RequestMethod.GET)
    public ArrayList<Product> getWithCatId(@RequestParam("id") String id){
        return productMapper.getProductWithCatId(id);
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

    /**
     *
     * @return will return list of main categories
     */
    @RequestMapping(value = "/getcategories",method = RequestMethod.GET)
    public ArrayList<Product> getCategories(){
        return productMapper.getCategories();
    }

    /**
     * will return list of child categories
     * @return
     */
    @RequestMapping(value = "/getsubcategories",method = RequestMethod.GET)
    public ArrayList<Product> getSubCategories(@RequestParam("parent_id") String parent_id){
        return productMapper.getSubCategories(parent_id);
    }


}
