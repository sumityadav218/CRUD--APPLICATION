package com.example.jpa_mapping.controller;

import com.example.jpa_mapping.Service.ProductService;
import com.example.jpa_mapping.entity.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class controller {
    @Autowired
  private ProductService productService ;


    @GetMapping("/hello")
    public String hello (){
        return "hello world" ;
    }


    @RequestMapping(value = "/addProduct",method = RequestMethod.POST)
    public ProductEntity addProduct (@RequestBody ProductEntity  productEntity){
        return productService.saveProduct(productEntity) ;
    }
    @RequestMapping(value = "/addProducts",method = RequestMethod.POST)
    public List<ProductEntity> addProducts (@RequestBody List<ProductEntity>  productEntities){
        return productService.saveProductList(productEntities) ;
    }

    @RequestMapping(value = "/products",method = RequestMethod.GET)
    public List<ProductEntity> findAllProductEntities (){
        return productService.getProducts() ;
    }

    @RequestMapping(value = "/productsById/{id}",method = RequestMethod.GET)
    public ProductEntity findAllProductEntityById(@PathVariable int id){
        return productService.getProductsById(id ) ;
    }

    @RequestMapping(value = "/productsByName/{name}",method = RequestMethod.GET)
    public ProductEntity findAllProductEntityById(@PathVariable String name){
        return productService.getProductsByName(name ) ;
    }


    //put example
        @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public ProductEntity updateProduct(@RequestBody ProductEntity  productEntity){
        return productService.updateProduct(productEntity ) ;
    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public String deleteProduct(@PathVariable int id ){

        return productService.deleteProduct(id) ;
    }




}
