package com.example.jpa_mapping.Service;

import com.example.jpa_mapping.entity.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.jpa_mapping.repository.ProductRepo;

import java.util.List;

@Service
public class ProductService {

    @Autowired
   private  ProductRepo productRepo ;

    public ProductEntity saveProduct(ProductEntity productEntity) {
     return productRepo.save(productEntity) ;
    }

    public List<ProductEntity> saveProductList(List<ProductEntity> productEntities) {
        return productRepo.saveAll(productEntities) ;
    }

    public List<ProductEntity> getProducts (){
        return productRepo.findAll() ;
    }

    public ProductEntity getProductsById (int id) {
        return productRepo.findById(id).orElse(null
        );
    }

        public ProductEntity getProductsByName (String name)
        {
            return productRepo.findByName(name);

        }

        public  String deleteProduct(int id) {

        productRepo.deleteById(id);

        return "warning !!! product deleted !!" + id ;
        }

        public ProductEntity updateProduct (ProductEntity productEntity){
        ProductEntity existingProduct  =  productRepo.findById(productEntity.getId()).orElse(null)  ;

       if (existingProduct!=null) {
           existingProduct.setName(productEntity.getName());
           existingProduct.setQuantity(productEntity.getQuantity());
           existingProduct.setPrice(productEntity.getPrice());
       }

    return productRepo.save(existingProduct) ;

        }

}
