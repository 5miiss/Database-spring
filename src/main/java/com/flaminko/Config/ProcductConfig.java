package com.flaminko.Config;

import com.flaminko.DAO.CategoryDao;
import com.flaminko.DAO.ProductDao;
import com.flaminko.DAO.impl.CategoryDaoImpl;
import com.flaminko.DAO.impl.ProductDaoImpl;
import com.flaminko.models.Category;
import com.flaminko.models.CategoryId;
import com.flaminko.models.Product;
import com.flaminko.models.ProductId;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProcductConfig {

    @Bean
    public CategoryId categoryId(){
        return new CategoryId(0 ,0);
    }


    @Bean
    public Category category(CategoryId categoryId){
        return  new Category(categoryId,"Electronics","image");
    }

    @Bean
    public ProductId productId(CategoryId categoryId){
        return new ProductId(categoryId.getId(),categoryId.getParentId(),1);
    }

    @Bean
    public Product product(ProductId productId,Category category){
        return new Product(productId,category,"zz","asdas",12,1000);
    }
    @Bean
    public ProductDao productDao(){
        return new ProductDaoImpl();

    }

    @Bean
    public CategoryDao categoryDao(){
        return new CategoryDaoImpl();
    }
}
